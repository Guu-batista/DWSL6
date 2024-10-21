package praticaAula04;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/adicionarCliente")
public class AdicionarClienteServlet extends HttpServlet {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static int idCounter = 1;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");

        Cliente cliente = new Cliente(idCounter++, nome, email);
        clientes.add(cliente);
        System.out.println("Teste" + clientes.toString());
        response.sendRedirect("listarClientes");
    }

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }
}
