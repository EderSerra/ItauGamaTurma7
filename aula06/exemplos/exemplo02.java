package exemplos;

import java.util.ArrayList;

public class exemplo02 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); 
        int soma = 0;
        int numeroProcurado = 21;
        boolean achou;

		numeros.add(10); //[0]
		numeros.add(7);  //[1]
        numeros.add(20); //[2] 
        numeros.add(5);  //[3]

        System.out.println(numeros); 
        
        for(int i = 0; i < numeros.size(); i++){
            soma = soma + numeros.get(i);
        }

        System.out.println("Soma = " + soma);

        achou = false;
        for(int i = 0; i < numeros.size(); i++){
            if(numeros.get(i) == numeroProcurado){
                achou = true;
                break; //interrompe o laço
            }
        }

        if(achou){
            System.out.println("Achei!!!");
        }else{
            System.out.println("Não achei...");
        }

    }
}