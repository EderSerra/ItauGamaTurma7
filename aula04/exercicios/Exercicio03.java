package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);      
        String frase;
        int vogais;

        System.out.println("Digite uma palavra:");
        frase = teclado.nextLine();

        vogais = contaVogais(frase);

        System.out.println("Existem " + vogais + " vogais.");

        teclado.close();
    }

    public static int contaVogais(String palavra){
        int cont = 0;
        palavra = palavra.toLowerCase(); //troca todos os caracteres da palavra para minúsculo

        //length é tamanho (quantos caracteres) da palavra
        for(int i = 0; i < palavra.length(); i++ ){
            if(palavra.charAt(i) == 'a' || palavra.charAt(i) == 'e' ||
                palavra.charAt(i) == 'i'|| palavra.charAt(i) == 'o' ||
                palavra.charAt(i) == 'u'){
                cont++;
            }
        }
        return cont;
    }

}