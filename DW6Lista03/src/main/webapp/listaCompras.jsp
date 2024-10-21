<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Lista e Adicionar Compras</title>
</head>
<body>
    <h2>Compras Realizadas</h2>

    <c:if test="${empty compras}">
        <p>Nenhuma compra foi realizada ainda.</p>
    </c:if>

    <c:forEach var="compra" items="${compras}">
        <h3>Compra do Cliente ID: ${compra.idCliente}</h3>
        <table border="1">
            <tr>
                <th>ID do Produto</th>
                <th>Nome do Produto</th>
                <th>Preço</th>
            </tr>
            <c:forEach var="produto" items="${compra.produtos}">
                <tr>
                    <td>${produto.id}</td>
                    <td>${produto.nome}</td>
                    <td>${produto.preco}</td>
                </tr>
            </c:forEach>
        </table>
        <p><strong>Total da compra:</strong> R$ ${compra.calcularTotal()}</p>
        <hr>
    </c:forEach>

    <!-- Formulário para Adicionar Compra -->
    <h3>Adicionar Nova Compra</h3>
    <form action="adicionarCompra" method="post">
        <label for="idCliente">ID do Cliente:</label>
        <input type="text" name="idCliente" id="idCliente" required><br><br>

        <label for="produtos">Selecione os Produtos:</label><br>
        <c:forEach var="produto" items="${produtos}">
            <input type="checkbox" name="produtosSelecionados" value="${produto.id}"> 
            ${produto.nome} - R$ ${produto.preco}<br>
        </c:forEach>

        <br>
        <input type="submit" value="Adicionar Compra">
    </form>
</body>
</html>
