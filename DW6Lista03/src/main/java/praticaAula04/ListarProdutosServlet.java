package praticaAula04;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/listarProdutos")
public class ListarProdutosServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Produto> produtos = AdicionarProdutoServlet.getProdutos();
        request.setAttribute("produtos", produtos);
        
        System.out.print("Teste 2"+ produtos);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listaProdutos.jsp");
        dispatcher.forward(request, response);
    }
}

