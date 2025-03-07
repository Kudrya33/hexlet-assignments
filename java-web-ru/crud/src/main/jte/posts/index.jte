@param exercise.dto.posts.PostsPage page

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Posts List</title>
</head>
<body>
    <h1>Posts</h1>
    <ul>
        @for(exercise.model.Post post : page.getPosts())
            <li><a href="/posts/${post.getId()}">${post.getName()}</a></li>
        @endfor
    </ul>
    <div>
        <a href="/posts?page=${page.getPageNumber() - 1}&posts=${page.getPostsNumber()}">назад</a>
        <a href="/posts?page=${page.getPageNumber() + 1}&posts=${page.getPostsNumber()}">вперед</a>
    </div>
</body>
</html>