package exercicios.exercicio5;

public class AppEbook {
    public static void main(String[] args) {
        //criar os objetos do tipo livro
        Ebook book1 = new Ebook("Matemática para 5° serie", "James B.", 80);
        Ebook book2 = new Ebook("Português para 8° serie", "Thomas J.", 90);

        //utilizar os objetos criados

        book1.retrocederPagina();

        //book1.paginaAtual = -5; //impossível pois é "private"
        

        System.out.println("Página atual: " + book1.exibirPagina());

        book1.avancaPagina();
        System.out.println("Página atual: " + book1.exibirPagina());

        System.out.println("Qual página você quer ler?");
        int pagina = 100;
        book1.irParaPagina(pagina);
        System.out.println("Página atual: " + book1.exibirPagina());

        book2.irParaPagina(10);
        System.out.println("Página atual: " + book2.exibirPagina());

        
    }
}