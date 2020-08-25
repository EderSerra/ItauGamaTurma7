package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();
        String frase ;
        
        System.out.println("Digite uma frase:");
        frase = teclado.nextLine();
        frase = frase + " ";
        
        //frase.length() significa o tamanho da frase (qtde de caracteres)

        //percorrer toda a frase do início ao final
        for(int i = 0; i < frase.length(); i++){
            //a cada palavra encontrada exibir ao contrário
            if(frase.charAt(i) == ' '){
                while(!pilha.isEmpty()){ //pilha.isEmpty() == false
                    System.out.print(pilha.pop());
                }
                System.out.print(" ");
            }else{
                pilha.push(frase.charAt(i));
            }
        }
/*         while(!pilha.isEmpty()){ //pilha.isEmpty() == false
            System.out.print(pilha.pop());
        } */

        teclado.close();
    }
}
