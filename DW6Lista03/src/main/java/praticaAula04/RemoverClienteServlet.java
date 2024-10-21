package praticaAula04;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/removerCliente")
public class RemoverClienteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        ArrayList<Cliente> clientes = AdicionarClienteServlet.getClientes();
        clientes.removeIf(cliente -> cliente.getId() == id);  // Remove o cliente com o ID fornecido
        
        response.sendRedirect("listarClientes");
    }
}
