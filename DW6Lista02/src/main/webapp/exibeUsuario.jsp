<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Usuário Logado</title>
</head>
<body>
    <h1>Usuário Logado</h1>
    <p>O nome do usuário é: ${sessionScope.username}</p>
    <a href="logout">Logout</a>
</body>
</html>
