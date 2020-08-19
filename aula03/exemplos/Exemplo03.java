package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta, texto;
        int num, soma;
        char continua ;

        soma = 0;
        continua = 's';
        while( continua == 's' || continua == 'S' ){
            System.out.println("Digite o próximo número:");
            texto = entrada.nextLine();
            //num = entrada.nextInt();
            num = Integer.parseInt(texto);
            soma += num; //soma = soma + num;

            System.out.print("Deseja continuar?(s/n) ");
            resposta = entrada.nextLine();
            //pega o primeiro caracter da String resposta
            continua = resposta.charAt(0);
        }

        System.out.println("A soma calculada foi " + soma);

        entrada.close();
    }

}