package exercicios.exercicio4;

public class App {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("ABC 1212", "VW-Gol", 12.5);
        Veiculo carro2 = new Veiculo("DEB 1454", "Chevrolet Cruze", 7.5);

        System.out.println(carro1.exibir());
        System.out.println("O consumo do carro 1 é " + carro1.consumo());
        
        System.out.println(carro2.exibir());
        System.out.println("O consumo do carro 2 é " + carro2.consumo());
    }
}