package com.lista;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/productForm")
public class Ex8 extends HttpServlet {
    private ArrayList<Product> products = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String priceStr = request.getParameter("price");
        
        double price = Double.parseDouble(priceStr);
        
        products.add(new Product(name, price));
        
        response.setContentType("text/html;charset=UTF-8");
        
        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>Produtos Cadastrados</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Produtos Cadastrados:</h1>");
        response.getWriter().println("<ul>");
        
        for (Product product : products) {
            response.getWriter().println("<li>" + product.getName() + ": R$ " + product.getPrice() + "</li>");
        }
        
        response.getWriter().println("</ul>");
        response.getWriter().println("<a href='productForm.html'>Cadastrar mais produtos</a>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
    
    public class Product {
        private String name;
        private double price;
        
        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }
        
        public String getName() {
            return name;
        }
        
        public double getPrice() {
            return price;
        }
    }
}
