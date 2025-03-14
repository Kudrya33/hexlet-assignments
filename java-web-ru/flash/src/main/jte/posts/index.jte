@import exercise.dto.posts.PostsPage
@param PostsPage page

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Posts List</title>
</head>
<body>
    <h1>Posts</h1>
    <ul>
        @for(var post : page.getPosts())
            <li>${post.getId()} ${post.getName()}</li>
        @endfor
    </ul>
</body>
</html>
