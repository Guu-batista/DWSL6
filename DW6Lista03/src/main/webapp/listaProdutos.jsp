<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Lista de Produtos</title>
</head>
<body>
    <h2>Produtos Cadastrados</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Nome</th>
            <th>Preço</th>
            <th>Ações</th>
        </tr>
        <c:forEach var="produto" items="${produtos}">
            <tr>
                <td>${produto.id}</td>
                <td>${produto.nome}</td>
                <td>${produto.preco}</td>
                <td>
                    <a href="editarProduto?id=${produto.id}">Editar</a> |
                    <a href="removerProduto?id=${produto.id}">Remover</a>
                </td>
            </tr>
        </c:forEach>
    </table>

    <h3>Adicionar Produto</h3>
    <form action="adicionarProduto" method="post">
        Nome: <input type="text" name="nome" required><br>
        Preço: <input type="text" name="preco" required><br>
        <input type="submit" value="Adicionar">
    </form>
</body>
</html>
