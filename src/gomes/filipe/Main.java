package gomes.filipe;
import gomes.filipe.domain.Entregador;
import gomes.filipe.domain.Vendedor;

public class Main {
    public static void main(String[] args) {
        Vendedor vendedorFilipe = new Vendedor("Filipe", "Gomes", 10, 50000);
        vendedorFilipe.calculaPlusVendedor();

        System.out.println();

        Vendedor vendedorOwen = new Vendedor("Owen", "Shelter", 3, 6890);
        vendedorOwen.calculaPlusVendedor();

        System.out.println();

        Entregador entregadorJonas = new Entregador("Jonas", "Basco", 1, 2760);
        entregadorJonas.calculaPlusEntregador();

        System.out.println();

        Entregador entregadorMario = new Entregador("Mario", "Bros", 6, 3767);
        entregadorMario.calculaPlusEntregador();
    }
}
