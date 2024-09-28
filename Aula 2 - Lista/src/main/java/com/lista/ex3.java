package com.lista;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class ex3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        
        response.setContentType("text/html;charset=UTF-8");
        
        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>Boas-vindas</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Bem-vindo, " + username + "!</h1>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}

