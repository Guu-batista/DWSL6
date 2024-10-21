package praticaAula04;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/adicionarProduto")
public class AdicionarProdutoServlet extends HttpServlet {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static int idCounter = 1;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        double preco = Double.parseDouble(request.getParameter("preco"));
        Produto produto = new Produto(idCounter++, nome, preco);
        produtos.add(produto);
        
        System.out.println("Teste" + produto.toString());
        response.sendRedirect("listarProdutos");
    }

    public static ArrayList<Produto> getProdutos() {
        return produtos;
    }
    
}
