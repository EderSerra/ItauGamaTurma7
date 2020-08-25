package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        FilaPrioridade fila = new FilaPrioridade();

        System.out.println("Estou atendendo " + fila.atender());

        fila.chegadaPessoa("Marcos", "N 123");
        fila.chegadaPessoa("Joselia", "P 23");
        fila.chegadaPessoa("Camila", "N 124");
        fila.chegadaPessoa("Raimundo", "P 24");
        fila.chegadaPessoa("Marta", "P 25");

        while (!fila.isEmpty()) {
            System.out.println("Estou atendendo " + fila.atender());
        }

    }
}