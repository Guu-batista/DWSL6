package praticaAula04;

import java.util.ArrayList;

public class Compra {
    private int idCliente;
    private ArrayList<Produto> produtos;

    public Compra(int idCliente, ArrayList<Produto> produtos) {
        this.idCliente = idCliente;
        this.produtos = produtos;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}
