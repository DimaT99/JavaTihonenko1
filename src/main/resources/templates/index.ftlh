<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<table border="2px">
    <thead>
    <tr>
        <th>student id</th>
        <th>name</th>
        <th>courseId</th>

    </tr>
    </thead>
    <tbody>
    <#list students as student>
        <tr>
            <td><a href="/students/${student.getId()}"><p>${student.getId()}</a></td>
            <td>${student.getName()}</td>
            <td>${student.getCourseId()}</td>

        </tr>
    </#list>
    </tbody>
</table>

</body>
</html>