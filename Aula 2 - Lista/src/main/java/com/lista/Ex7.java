package com.lista;

import java.io.IOException;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/acesso")
public class Ex7 extends HttpServlet {
    private HashMap<String, Integer> accessCounts = new HashMap<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        
        if (nome != null && !nome.trim().isEmpty()) {
            accessCounts.put(nome, accessCounts.getOrDefault(nome, 0) + 1);
        }
        
        response.setContentType("text/html;charset=UTF-8");
        
        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>Contador de Acessos</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Contador de Acessos por Usuário</h1>");
        response.getWriter().println("<ul>");
        
        for (String user : accessCounts.keySet()) {
            response.getWriter().println("<li>" + user + ": " + accessCounts.get(user) + " acessos</li>");
        }
        
        response.getWriter().println("</ul>");
        response.getWriter().println("<form action='acesso' method='get'>");
        response.getWriter().println("<input type='text' name='nome' placeholder='Digite seu nome' required>");
        response.getWriter().println("<input type='submit' value='Contar Acesso'>");
        response.getWriter().println("</form>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
