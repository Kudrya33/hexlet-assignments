@import exercise.dto.articles.BuildArticlePage
@param BuildArticlePage page

@if(page.getErrors() != null)
      <ul>
          @for(var validator : page.getErrors().values())
              @for(var error : validator)
                  <li>${error.getMessage()}</li>
              @endfor
          @endfor
      </ul>
@endif

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Название вашего сайта</title>
</head>
<body>
    <form action="/articles" method="post">
      <div>
        <label>
          <p>Название статьи</p>
          <input type="text" name="title" value="${page.getTitle()}"/>
        </label>
      </div>
      <div>
        <label>
          <p>Содержимое статьи</p>
          <input type="textarea" required name="content" value="${page.getContent()}"/>
        </label>
      </div>
      <input type="submit" value="Создать" />
    </form>
</body>
</html>