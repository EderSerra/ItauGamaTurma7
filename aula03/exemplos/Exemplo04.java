package exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto;
        int numeroInt;
        double numeroDouble;

        texto = entrada.nextLine();
        
        System.out.println(texto + 1);

        numeroInt = Integer.parseInt(texto);
        System.out.println(numeroInt + 1);

        numeroDouble = Double.parseDouble(texto);
        System.out.println(numeroDouble + 1);

        entrada.close();
    }
}