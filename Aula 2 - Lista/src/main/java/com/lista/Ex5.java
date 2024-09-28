package com.lista;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addNome")
public class Ex5 extends HttpServlet {
    // ArrayList para armazenar os nomes
    private ArrayList<String> nomes = new ArrayList<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Captura o parâmetro "nome" da URL
        String nome = request.getParameter("nome");
        
        // Se o nome não for nulo, adiciona ao ArrayList
        if (nome != null && !nome.trim().isEmpty()) {
            nomes.add(nome);
        }
        
        // Define o tipo de conteúdo da resposta
        response.setContentType("text/html;charset=UTF-8");
        
        // Escreve a resposta HTML
        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>Armazenamento de Nomes</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Lista de Nomes Armazenados:</h1>");
        response.getWriter().println("<ul>");
        
        // Exibe todos os nomes armazenados
        for (String storedName : nomes) {
            response.getWriter().println("<li>" + storedName + "</li>");
        }
        
        response.getWriter().println("</ul>");
        response.getWriter().println("<form action='addNome' method='get'>");
        response.getWriter().println("<input type='text' name='nome' placeholder='Digite um nome' required>");
        response.getWriter().println("<input type='submit' value='Adicionar Nome'>");
        response.getWriter().println("</form>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}

