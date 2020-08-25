package exercicios.exercicio05;

public class ClienteVip extends Cliente {
    private double creditoEspecial;

    public ClienteVip(String nome, String email, double creditoEspecial){
        super(nome, email);
        this.creditoEspecial = creditoEspecial;
    }

    @Override
    public boolean fazerCompra(double valor){
        if(valor > 0 && credito + creditoEspecial >= valor){
            credito = credito - valor;
            return true;
        }
        return false;
    }
}