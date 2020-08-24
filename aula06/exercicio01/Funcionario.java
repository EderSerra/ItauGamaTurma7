package exercicio01;

/**
 * Funcionario
 */


 //classe implicita Object

public class Funcionario {

    private String nome;
    private int horasTrabalhadas;
    private double valorPorHora;

    public Funcionario(String nome, double valorPorHora, int horasTrabalhadas) {
        this.nome = nome;
        setValorPorHora(valorPorHora);
        setHorasTrabalhadas(horasTrabalhadas);
    }

    public double calculaSalario(){
        return horasTrabalhadas * valorPorHora;
    }

    public String getNome(){
        return nome;
    }

    @Override
    public String toString() {
        return nome + " : " + valorPorHora + " : " + horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if(horasTrabalhadas > 0){
            this.horasTrabalhadas = horasTrabalhadas;
        }
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        if(valorPorHora > 0){
            this.valorPorHora = valorPorHora;
        }
    }
}