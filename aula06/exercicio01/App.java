package exercicio01;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos Antonio", 30, 1000);
        Senior gerente = new Senior("Maristela Ferreira", 45, 800, 30);

        System.out.println(funcionario);
        System.out.println("Salario: " + funcionario.calculaSalario());
        System.out.println(gerente);
        System.out.println("Salario: " + gerente.calculaSalario());

    }
}