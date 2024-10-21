package praticaAula04;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/removerProduto")
public class RemoverProdutoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        
        for (int i = 0; i < AdicionarProdutoServlet.getProdutos().size(); i++) {
            if (AdicionarProdutoServlet.getProdutos().get(i).getId() == id) {
                AdicionarProdutoServlet.getProdutos().remove(i);
                break;
            }
        }

        // Redireciona para a lista de produtos
        response.sendRedirect("listarProdutos");
    }
}
