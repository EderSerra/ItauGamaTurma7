package exercicios.exercicio05;

public class App {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marcos", "marcos@teste.com");
        ClienteVip cliente2 = new ClienteVip("Vanessa", "marcos@teste.com", 1000);

        System.out.println( cliente1.fazerCompra(100) );
        System.out.println( cliente1 );
        System.out.println( cliente2.fazerCompra(100) );
        System.out.println( cliente2 );

        
    }
}