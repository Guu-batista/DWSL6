<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Lista de Clientes</title>
</head>
<body>
    <h2>Clientes Cadastrados</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Email</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="cliente" items="${clientes}">
            <tr>
                <td>${cliente.id}</td>
                <td>${cliente.nome}</td>
                <td>${cliente.email}</td>
                <td>
                    <a href="editarCliente?id=${cliente.id}">Editar</a> |
                    <a href="removerCliente?id=${cliente.id}">Remover</a> |
                </td>
            </tr>
        </c:forEach>
    </table>

    <h3>Adicionar Cliente</h3>
    <form action="adicionarCliente" method="post">
        Nome: <input type="text" name="nome" required><br/>
        Email: <input type="text" name="email" required><br/>
        <input type="submit" value="Adicionar">        
    </form>
</body>
</html>
