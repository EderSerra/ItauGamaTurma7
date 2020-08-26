package exercicios;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Exercicio04 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        TreeSet<Integer> arvore = new TreeSet<>(); 

        Random rnd = new Random();
        for (int i = 0; i < 1000; i++) {
            lista.add( rnd.nextInt(500) + 1);
        }

        for (Integer numero : lista) {
            arvore.add(numero);
        }

        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Tamanho da árvores: " + arvore.size());

        System.out.println(arvore);
    }
}