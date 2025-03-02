@param exercise.dto.users.UserPage page

<!DOCTYPE html>
<html lang="en">
<head>
    <title>User Details</title>
</head>
<body>
    <h1>User Details</h1>
    <p>ID: ${page.getUser().getId()}</p>
    <p>Name: ${page.getUser().getFirstName()} ${page.getUser().getLastName()}</p>
    <p>Email: ${page.getUser().getEmail()}</p>
    <a href="/users">Back to Users List</a>
</body>
</html>