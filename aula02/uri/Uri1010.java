package uri;

import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cod, qtde;
        double valor;

        cod = entrada.nextInt();
        qtde = entrada.nextInt();
        valor = entrada.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor * qtde);

        cod = entrada.nextInt();
        qtde = entrada.nextInt();
        valor = entrada.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor * qtde);
        entrada.close();
    }
}