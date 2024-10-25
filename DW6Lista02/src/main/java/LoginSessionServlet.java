

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginSessionServlet
 */

/* EXERCICIO FACIL
@WebServlet("/loginSession")
public class LoginSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        request.getSession().setAttribute("username", username);
        response.sendRedirect("exibeUsuario.jsp");
    }
}
 */

@WebServlet("/loginSession")
public class LoginSessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        request.getSession().setAttribute("username", username);
        response.sendRedirect("exibeUsuario.jsp");
    }
}
