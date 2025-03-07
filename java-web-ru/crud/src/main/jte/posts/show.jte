@param exercise.dto.posts.PostPage page

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Post Details</title>
</head>
<body>
    <h1>Post Details</h1>
    <p>${page.getPost().getName()}</p>
    <p>${page.getPost().getBody()}</p>
    <a href="/posts">Back to Posts List</a>
</body>
</html>