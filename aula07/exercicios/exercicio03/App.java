package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        FilaPrioridade fila = new FilaPrioridade();

        fila.chegadaPessoa("Marcos", "N 123");
        fila.chegadaPessoa("Joselia", "P 23");
        fila.chegadaPessoa("Camila", "N 124");
        fila.chegadaPessoa("Raimundo", "P 24");

        System.out.println("Estou atendendo " + fila.atender() );
    }
}