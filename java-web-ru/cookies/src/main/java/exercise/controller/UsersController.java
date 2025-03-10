package exercise.controller;

import org.apache.commons.lang3.StringUtils;
import exercise.util.Security;
import exercise.model.User;
import exercise.util.NamedRoutes;
import static io.javalin.rendering.template.TemplateUtil.model;
import exercise.repository.UserRepository;
import exercise.dto.users.UserPage;
import io.javalin.http.NotFoundResponse;
import io.javalin.http.Context;

import java.util.Optional;


public class UsersController {

    public static void build(Context ctx) throws Exception {
        ctx.render("users/build.jte");
    }

    // BEGIN
    public static void create(Context ctx) {
        String firstName = ctx.formParam("firstName");
        String lastName = ctx.formParam("lastName");
        String email = ctx.formParam("email");
        String password = ctx.formParam("password");

        String encryptedPassword = Security.encrypt(password);
        String token = Security.generateToken();

        User user = new User(firstName, lastName, email, encryptedPassword, token);
        UserRepository.save(user);

        ctx.cookie("token", token);
        ctx.redirect(NamedRoutes.userPath(user.getId()));
    }

    public static void show(Context ctx) {
        Long userId = Long.parseLong(ctx.pathParam("id"));
        Optional<User> userOptional = UserRepository.find(userId);

        if (userOptional.isEmpty()) {
            throw new NotFoundResponse();
        }

        User user = userOptional.get();
        String userToken = user.getToken();
        String cookieToken = ctx.cookie("token");

        if (cookieToken == null || !cookieToken.equals(userToken)) {
            ctx.redirect(NamedRoutes.buildUserPath());
            return;
        }

        UserPage userPage = new UserPage(user);
        ctx.render("users/show.jte", model("page", userPage));
    }
    // END
}
