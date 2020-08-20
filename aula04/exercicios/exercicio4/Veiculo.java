package exercicios.exercicio4;

public class Veiculo {
    String placa, modelo;
    double consumo;

    Veiculo(String placa, String modelo, double consumo){
        this.placa = placa;
        this.modelo = modelo;
        this.consumo = consumo;
    }

    String exibir(){
        return modelo + " placa " + placa;
    }

    double consumo(){
        return consumo;
    }
}