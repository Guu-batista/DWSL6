package com.lista;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submitComment")
public class Ex6 extends HttpServlet {
    private ArrayList<String> comments = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String comment = request.getParameter("comment");
        
        if (comment != null && !comment.trim().isEmpty()) {
            comments.add(comment);
        }
        
        response.setContentType("text/html;charset=UTF-8");
        
        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>Comentários Submetidos</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Comentários Submetidos:</h1>");
        response.getWriter().println("<ul>");
        
        for (String storedComment : comments) {
            response.getWriter().println("<li>" + storedComment + "</li>");
        }
        
        response.getWriter().println("</ul>");
        response.getWriter().println("<a href='commentForm.html'>Voltar ao formulário</a>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}

