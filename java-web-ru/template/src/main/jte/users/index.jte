@param exercise.dto.users.UsersPage page

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Users List</title>
</head>
<body>
    <h1>Users</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Details</th>
        </tr>
        @for(exercise.model.User user : page.getUsers())
            <tr>
                <td>${user.getId()}</td>
                <td>${user.getFirstName()} ${user.getLastName()}</td>
                <td>${user.getEmail()}</td>
                <td><a href="/users/${user.getId()}">View</a></td>
            </tr>
        @endfor
    </table>
</body>
</html>