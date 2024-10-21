<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Editar Cliente</title>
</head>
<body>
    <h2>Editar Cliente</h2>
    <form action="editarCliente" method="post">
        <input type="hidden" name="id" value="${cliente.id}">
        Nome: <input type="text" name="nome" value="${cliente.nome}" required><br>
        Email: <input type="text" name="email" value="${cliente.email}" required><br>
        <input type="submit" value="Salvar">
    </form>
    <a href="listarClientes">Voltar para a Lista de Clientes</a>
</body>
</html>
