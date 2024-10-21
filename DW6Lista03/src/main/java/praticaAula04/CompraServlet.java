package praticaAula04;

import java.util.ArrayList;

public class CompraServlet {
    private static ArrayList<Compra> compras = new ArrayList<>();

    public static ArrayList<Compra> getCompras() {
        return compras;
    }

    public static void addCompra(Compra compra) {
        compras.add(compra);
    }
}
