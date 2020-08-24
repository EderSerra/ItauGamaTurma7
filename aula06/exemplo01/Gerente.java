package exemplo01;

public class Gerente extends Funcionario {
    private int numFuncionarios;

    public Gerente(String nome, double salario, int numFuncionarios){
        super(nome, salario); //chama o construtor da classe base
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumFuncionarios(){
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios){
        if(numFuncionarios > 0){
            this.numFuncionarios = numFuncionarios;
        }
    }

}