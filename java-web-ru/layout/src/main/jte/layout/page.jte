@import gg.jte.Content
@param Content content

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Название сайта</title>
</head>
<body>
    <header>
        <nav>
            <h1>My project</h1>
            <ul>
                <li><a href="/">Главная</a></li>
                <li><a href="/users">Просмотр всех пользователей</a></li>
            </ul>
        </nav>
    </header>

    <main>
        ${content}
    </main>

    <footer>
        <p>Посетите мой профиль на <a href="https://github.com/Kudrya33" target="_blank">GitHub</a>.</p>
    </footer>
</body>
</html>