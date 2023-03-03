package Mentorama.DesafioMod9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Victor", 35);
        Cliente c2 = new Cliente("Julia", 200);
        Cliente c3 = new Cliente("Pedro", 150);
        Cliente c4 = new Cliente("Lua", 135);
        Cliente c5 = new Cliente("Sofia", 55);
        Cliente c6 = new Cliente("Giuliano", 12);
        Cliente c7 = new Cliente("Gilberto", 199);
        Cliente c8 = new Cliente("Cesar", 16);
        Cliente c9 = new Cliente("Geovana", 90);
        Cliente c10 = new Cliente("Hercilio", 106);

        List<Cliente> clientes = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10);

        Comparator<Cliente> maiorCompra = (cliente1, cliente2) -> {
            if(cliente1.getQuantidadeCompras() > cliente2.getQuantidadeCompras()) return 1;
            if(cliente1.getQuantidadeCompras() < cliente2.getQuantidadeCompras()) return -1;
            return 0;
        };

        System.out.println("Maior numero de compras");
        System.out.println(clientes.stream().max(maiorCompra).get());
        System.out.println("----------");
        System.out.println("Menor numero de compras");
        System.out.println(clientes.stream().min(maiorCompra).get());
        System.out.println("----------");
        System.out.println("Media da quantidade de compras");
        System.out.println(clientes.stream().mapToDouble(Cliente::getQuantidadeCompras).average().getAsDouble());
        System.out.println("----------");

    }
}
