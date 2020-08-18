package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );
        int numero;

        System.out.println("Digite o número:");
        numero = entrada.nextInt();

        if(numero > 20){
            System.out.println("Metade: " + numero / 2);
        }

        entrada.close();
    }
}