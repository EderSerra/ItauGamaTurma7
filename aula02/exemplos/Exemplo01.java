package exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        int a, b;
        double media; 

        a = entrada.nextInt();
        b = entrada.nextInt();

        media = (double)(a + b) / 2;

        /*

        No printf temos:

        %s - String
        %d - inteiros
        %f - float ou double
        .2 - limita a quantidade de casas decimais exibidas
        \n - pular para a proxima linha

        */

        System.out.printf("(%d + %d) / 2 = %.2f\n", a, b, media);

        entrada.close();
    }
}