package exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        int a, i;

        a = 10;
        i = 0;
        while( i < 3 ){
            a = a + i;
            i++;
        }
        System.out.println(a);

        a = 10;
        for(i = 0; i < 3; i++){
            a = a + i;
        }
        System.out.println(a);

    }
}