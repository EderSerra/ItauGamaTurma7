package exemplos.exlivros;

public class Livro {
    // atributos
    String titulo, autor;
    int paginas, anoPublicacao;

    // construtor
    Livro(String titulo, String novoAutor, int pg, int novoAnoPublicacao) {
        // this se refere ao próprio objeto
        this.titulo = titulo; // this aqui é obrigatório pois os nomes são iguais
        this.autor = novoAutor; // this aqui é opcional pois os nomes são diferentes
        paginas = pg;
        anoPublicacao = novoAnoPublicacao;
    }

    // métodos
    void exibirDados() { // void significa que não retorna nada
        System.out.println(titulo + " : " + autor + " - " + anoPublicacao);
    }

    int numeroPaginas() { // int significa que retorna um valor int
        return paginas;
    }
}