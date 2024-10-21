package praticaAula04;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/editarProduto")
public class EditarProdutoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Produto produto = null;

       
        for (Produto p : AdicionarProdutoServlet.getProdutos()) {
            if (p.getId() == id) {
                produto = p;
                break;
            }
        }

        // Define o produto como atributo e encaminha para a página de edição
        request.setAttribute("produto", produto);
        RequestDispatcher dispatcher = request.getRequestDispatcher("editarProduto.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");
        double preco = Double.parseDouble(request.getParameter("preco"));

        // Atualiza o produto com os novos valores
        for (Produto p : AdicionarProdutoServlet.getProdutos()) {
            if (p.getId() == id) {
                p.setNome(nome);
                p.setPreco(preco);
                break;
            }
        }

        // Redireciona para a lista de produtos
        response.sendRedirect("listarProdutos");
    }
}
