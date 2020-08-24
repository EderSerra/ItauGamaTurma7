package exemplo01;

public class App {
    public static void main(String[] args) {
        
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario("Joao", 2000);
        Gerente ger1 = new Gerente("Carlos", 3000, 10);

        func1.setNome("Emerson");
        String nome = func1.getNome();
        System.out.println("Funcionario: " + nome);

        ger1.setNome("Paduan");
        nome = ger1.getNome();
        System.out.println("Gerente: " + nome);

        System.out.println("Func 2: " + func2.getNome());
    }
}