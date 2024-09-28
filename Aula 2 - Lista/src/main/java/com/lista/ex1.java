package com.lista;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/simpleMessage")
public class ex1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>Mensagem Simples</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Bem-vindo ao mundo dos Servlets!</h1>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
