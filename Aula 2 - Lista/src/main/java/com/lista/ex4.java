package com.lista;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/accessCounter")
public class ex4 extends HttpServlet {
    private int accessCount = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        accessCount++;
        
        response.setContentType("text/html;charset=UTF-8");
        
        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>Contador de Acessos</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Este servlet foi acessado " + accessCount + " vezes.</h1>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
