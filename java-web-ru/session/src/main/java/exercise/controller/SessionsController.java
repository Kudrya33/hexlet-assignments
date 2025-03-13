package exercise.controller;

import static io.javalin.rendering.template.TemplateUtil.model;
import exercise.dto.MainPage;
import exercise.dto.LoginPage;
import exercise.model.User;
import exercise.repository.UsersRepository;
import static exercise.util.Security.encrypt;

import exercise.util.NamedRoutes;
import io.javalin.http.Context;

import java.util.Optional;

public class SessionsController {

    // BEGIN
    public static void build(Context ctx) {
        ctx.render("build.jte", model("error", ""));
    }

    public static void create(Context ctx) {
        String name = ctx.formParam("name");
        String password = ctx.formParam("password");

        Optional<User> userOpt = UsersRepository.findByName(name);

        if (userOpt.isPresent() && userOpt.get().getPassword().equals(encrypt(password))) {
            ctx.sessionAttribute("currentUser", userOpt.get().getName());
            ctx.redirect(NamedRoutes.rootPath());
        } else {
            ctx.render("build.jte", model("error", "Wrong username or password"));
        }
    }

    public static void delete(Context ctx) {
        ctx.sessionAttribute("currentUser", null);
        ctx.redirect(NamedRoutes.rootPath());
    }
    // END
}
