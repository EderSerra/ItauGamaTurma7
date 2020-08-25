package exemplos;

import java.util.TreeSet;

public class Exemplo03 {
    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<>();
        int[] numeros = { 2, 4, 1, 6, 3, 7, 9, 5, 2, 0, 5, 3, 2, 5, 8, 7, 8 }; // vetor de números

        // percorre da posição 0 até o tamanho do vetor
        for (int i = 0; i < numeros.length; i++) {
            arvore.add(numeros[i]); // pega explicitamente os valores em cada posição
        }

        // exibe todos os elementos da árvore
        System.out.println(arvore);
        // verifica se o valor está presente na árvore
        System.out.println(arvore.contains(7));

        // para cada valor da árvore
        for (int valor : arvore) {
            System.out.print(valor + " - ");
        }

    }
}