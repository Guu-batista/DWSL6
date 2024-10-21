<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Editar Produto</title>
</head>
<body>
    <h2>Editar Produto</h2>
    <form action="editarProduto" method="post">
        <input type="hidden" name="id" value="${produto.id}">
        Nome: <input type="text" name="nome" value="${produto.nome}" required><br>
        Preço: <input type="text" name="preco" value="${produto.preco}" required><br>
        <input type="submit" value="Salvar">
    </form>
    <a href="listarProdutos">Voltar para a Lista de Produtos</a>
</body>
</html>
