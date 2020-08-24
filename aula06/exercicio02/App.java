package exercicio02;

public class App {
    public static void main(String[] args) {
        
        ContaPoupanca cp1 = new ContaPoupanca(1111);
        ContaPoupanca cp2 = new ContaPoupanca(1111);

        ContaPoupanca.setTaxa(0.1);
        ContaPoupanca.setTaxa(0.2);

        System.out.println(cp1.getTaxa());
        System.out.println(cp2.getTaxa());
    }
}