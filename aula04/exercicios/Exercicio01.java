package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        
        if(isPar(10)){
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }

    }

    public static boolean isPar(int num){
/*         if(num % 2 == 0){
            return true;
        } else{
            return false;
        } */

        return (num % 2 == 0);
    }

}