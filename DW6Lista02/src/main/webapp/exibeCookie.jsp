<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jakarta.servlet.http.Cookie" %>
<html>
<head>
    <title>Exibir Cookie</title>
</head>
<body>
    <h1>Valor do Cookie</h1>
    <%
        Cookie[] cookies = request.getCookies();
        String username = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("username".equals(cookie.getName())) {
                    username = cookie.getValue();
                    break;
                }
            }
        }
    %>
    <p>
        <% if (username != null) { %>
            O nome do usuário armazenado no cookie é: <%= username %>
        <% } else { %>
            Nenhum cookie encontrado.
        <% } %>
    </p>
    <a href="index.jsp">Voltar</a>
</body>
</html>
