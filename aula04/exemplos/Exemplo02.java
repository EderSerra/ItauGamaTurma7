package exemplos;

/*
Exemplo02 - retorno de método
*/
public class Exemplo02 {

    public static void main(String[] args) {
        int resultado;

        resultado = soma(10,5); // a + b

        System.out.println(resultado);
    }

    public static int soma(int a, int b){
        //scopo da vairável: onde ela é valida
        //resp é uma variável LOCAL ao método soma
        int resp;

        resp = a + b;

        return resp;
    }

}