@import gg.jte.Content
@param String error

<form action="/sessions" method="post">
    <div>
        <label for="name">Username:</label>
        <input type="text" id="name" name="name" required>
    </div>
    <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
    </div>
    <button type="submit">Login</button>
</form>

@if (!error.isEmpty())
    <p style="color: red;">${error}</p>
@endif