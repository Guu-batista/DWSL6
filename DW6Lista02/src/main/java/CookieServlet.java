

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CookieServlet
 */
 /* EXERCICIO FACIL
@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        Cookie cookie = new Cookie("username", username);
        response.addCookie(cookie);
        response.sendRedirect("exibeCookie.jsp");
    }
}
*/

@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        Cookie cookie = new Cookie("username", username);
        cookie.setMaxAge(60*60); // 1 hora
        response.addCookie(cookie);
        response.sendRedirect("exibeCookie.jsp");
    }
}

