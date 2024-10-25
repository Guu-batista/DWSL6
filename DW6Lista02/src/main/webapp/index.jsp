<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Página Inicial</title>
</head>
<body>
    <h1>Bem-vindo ao Sistema de Login</h1>
    <form action="login" method="post">
        <label for="username">Nome de Usuário:</label>
        <input type="text" id="username" name="username" required>
        <button type="submit" value="Login">Login</button>
    </form>
    <form action="cookie" method="post">
        <label for="cookieUser">Nome de Usuário para Cookie:</label>
        <input type="text" id="username" name="username" required>
        <button type="submit">Salvar em Cookie</button>
    </form>
    <a href="exibeCookie.jsp">Ver Cookie</a>
</body>
</html>
