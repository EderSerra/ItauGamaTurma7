package exercicio01;

public class Senior extends Funcionario {

    double bonus;
    
    public Senior(String nome, double valorPorHora, int horasTrabalhadas, double bonus) {
        super(nome, valorPorHora, horasTrabalhadas);
        this.bonus = bonus;
    }

    @Override
    public double calculaSalario() {
        return super.calculaSalario() + (getHorasTrabalhadas() / 10) * bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ": " + bonus;
    }


}