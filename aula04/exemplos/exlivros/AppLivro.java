package exemplos.exlivros;

public class AppLivro {
    public static void main(String[] args) {
        Livro livroUm = new Livro("Programando em Java", "Deitel", 500, 2010);
        Livro livroDois = new Livro("Java Extremo", "Deitel Jr", 400, 2015);

/*         livroUm.titulo = "Programando em Java";
        livroUm.autor = "Deitel";
        livroUm.paginas = 500;
        livroUm.anoPublicacao = 2010; */

        livroUm.exibirDados();
        System.out.println("Páginas:" + livroUm.numeroPaginas());
        
        livroDois.exibirDados();

    }
}