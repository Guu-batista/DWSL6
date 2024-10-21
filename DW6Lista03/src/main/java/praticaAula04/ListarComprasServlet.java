package praticaAula04;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/listarCompras")
public class ListarComprasServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Compra> compras = CompraServlet.getCompras();
        ArrayList<Produto> produtos = AdicionarProdutoServlet.getProdutos();
        request.setAttribute("compras", compras);
        request.setAttribute("produtos", produtos);
        RequestDispatcher dispatcher = request.getRequestDispatcher("listaCompras.jsp");
        dispatcher.forward(request, response);
    }
}
