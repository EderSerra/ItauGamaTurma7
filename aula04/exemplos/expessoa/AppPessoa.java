package exemplos.expessoa;

public class AppPessoa {
    public static void main(String[] args) {
        //decalra uma variável do tipo Pessoa
        Pessoa pessoa1;
        //cria um objeto do tipo Pessoa
        pessoa1 = new Pessoa();

        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Emerson";
        pessoa2.nome = "Paduan";

        pessoa1.apresentar();
        pessoa2.apresentar();
    }
}