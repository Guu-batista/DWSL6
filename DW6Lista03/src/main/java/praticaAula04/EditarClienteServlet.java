package praticaAula04;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/editarCliente")
public class EditarClienteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Cliente cliente = null;

        // Busca o cliente pelo ID
        for (Cliente c : AdicionarClienteServlet.getClientes()) {
            if (c.getId() == id) {
                cliente = c;
                break;
            }
        }

        // Define o cliente como atributo e encaminha para a página de edição
        request.setAttribute("cliente", cliente);
        RequestDispatcher dispatcher = request.getRequestDispatcher("editarCliente.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");

        // Atualiza o cliente com os novos valores
        for (Cliente c : AdicionarClienteServlet.getClientes()) {
            if (c.getId() == id) {
                c.setNome(nome);
                c.setEmail(email);
                break;
            }
        }

        // Redireciona para a lista de clientes
        response.sendRedirect("listarClientes");
    }
}
