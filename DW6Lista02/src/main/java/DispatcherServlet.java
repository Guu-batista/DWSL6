

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class DispatcherServlet
 */

/* EXERCICIO FACIL
 @WebServlet("/dispatcher")
public class DispatcherServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String valor = request.getParameter("valor");
        request.setAttribute("valorRecebido", valor);
        request.getRequestDispatcher("/exibeValor.jsp").forward(request, response);
    }
}
*/

@WebServlet("/dispatcher")
public class DispatcherServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String valor = request.getParameter("valor");
        request.setAttribute("valorRecebido", valor);
        request.getRequestDispatcher("/processaDados.jsp").forward(request, response);
    }
}

