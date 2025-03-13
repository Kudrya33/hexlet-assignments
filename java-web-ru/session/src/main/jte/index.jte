@import gg.jte.Content
@param String currentUser

@if (currentUser == null) {
    <a href="/sessions/build">Войти</a>
@else
    <p>Welcome, ${currentUser}!</p>
    <form action="/sessions/delete" method="post">
        <button type="submit">Выйти</button>
    </form>
@endif