package praticaAula04;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/adicionarCompra")
public class AdicionarCompraServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtém o ID do cliente
        int idCliente = Integer.parseInt(request.getParameter("idCliente"));

        // Obtém os IDs dos produtos selecionados
        String[] produtosSelecionados = request.getParameterValues("produtosSelecionados");
        ArrayList<Produto> produtosCompra = new ArrayList<>();

        if (produtosSelecionados != null) {
            for (String idProduto : produtosSelecionados) {
                int id = Integer.parseInt(idProduto);
                for (Produto p : AdicionarProdutoServlet.getProdutos()) {
                    if (p.getId() == id) {
                        produtosCompra.add(p);
                        break;
                    }
                }
            }
        }

        // Cria uma nova compra
        Compra novaCompra = new Compra(idCliente, produtosCompra);
        CompraServlet.addCompra(novaCompra);

        // Redireciona para a página de listagem de compras
        response.sendRedirect("listarCompras");
    }
    
    
}
