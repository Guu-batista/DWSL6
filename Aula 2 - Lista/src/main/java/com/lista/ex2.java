package com.lista;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/index")
public class ex2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        response.setContentType("text/html;charset=UTF-8");
        
        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>Bem-vindo</title></head>");
        response.getWriter().println("<body>");
        if (nome != null && !nome.isEmpty()) {
            response.getWriter().println("<h1>Olá, " + nome + "!</h1>");
        } else {
            response.getWriter().println("<h1>Olá, Professor!</h1>");
        }
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}

