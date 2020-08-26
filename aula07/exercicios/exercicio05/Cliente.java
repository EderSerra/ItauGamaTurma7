package exercicios.exercicio05;

public class Cliente { //implicito extends Object
    private String nome, email;
    protected double credito;

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
        credito = 0;
    }

    public boolean fazerCompra(double valor){
        if(valor > 0 && credito >= valor){
            credito = credito - valor;
            return true;
        }
        return false;
    }

    public boolean quitarDivida(double valor){
        if(valor > 0){
            credito = credito + valor;
            return true;
        }
        return false;
    }

    //toString vem da classe Object que é um extends implicito para toda classe
    //Object é a classe root (raiz) de todas as outras classes
    @Override
    public String toString() {
        return nome + ": " + email + " credito: " + credito;
    }

}