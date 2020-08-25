package exemplos;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(10); //empilhar
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        
        while( !pilha.isEmpty() ){
            System.out.println( pilha.pop() ); //desempilhar
        }

        pilha.push(50);
        
        try { //tente fazer isso
            int n = pilha.pop();
            System.out.println(n);
        } catch (Exception e) {  //se tiver problema
            System.out.println("Ocorreu um erro.");
            System.exit(1);
        } 

        System.out.println("Final do programa.");

    }

}