package exercise.controller.users;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import exercise.model.Post;
import exercise.Data;

// BEGIN
@RestController
@RequestMapping("/api")
public class PostsController {

    private List<Post> posts = Data.getPosts();

    @GetMapping("/users/{userId}/posts")
    public List<Post> index(@PathVariable int userId) {
        return posts.stream()
                .filter(p -> p.getUserId() == userId)
                .toList();
    }

    @PostMapping("/users/{userId}/posts")
    @ResponseStatus(HttpStatus.CREATED)
    public Post create(
            @PathVariable int userId,
            @RequestBody Post postData
    ) {
        Post newPost = new Post();
        newPost.setSlug(postData.getSlug());
        newPost.setTitle(postData.getTitle());
        newPost.setBody(postData.getBody());
        newPost.setUserId(userId);

        posts.add(newPost);
        return newPost;
    }
}
// END
