package uri;

import java.util.Scanner;

/**
 * Ex1002: calcular a área de uma circunferência
 */
public class Uri1002 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double raio, area;
        final double n = 3.14159; //PI

        raio = entrada.nextDouble();

        area = n * raio * raio;

        System.out.printf("A=%.4f", area);

        entrada.close();
    }
}