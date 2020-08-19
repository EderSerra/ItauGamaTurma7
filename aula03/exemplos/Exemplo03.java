package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta;
        int num, soma;
        char continua ;

        continua = 's';
        while( continua == 's' || continua == 'S' ){


            System.out.print("Deseja continuar?(s/n) ");
            resposta = entrada.nextLine();
            //pega o primeiro caracter da String resposta
            continua = resposta.charAt(0);
        }

    }

}