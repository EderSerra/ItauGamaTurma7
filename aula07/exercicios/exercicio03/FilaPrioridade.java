package exercicios.exercicio03;

import java.util.LinkedList;
import java.util.Queue;

public class FilaPrioridade {
    private Queue<Pessoa> filaNormal;
    private Queue<Pessoa> filaPrioridade;

    public FilaPrioridade(){
        filaNormal = new LinkedList<>();
        filaPrioridade = new LinkedList<>();       
    }

    public void chegadaPessoa(String nome, String senha){
        Pessoa pessoa = new Pessoa(nome, senha);
        if(pessoa.getPrioridade() == Pessoa.VIP){
            filaPrioridade.add(pessoa);
        }else{
            filaNormal.add(pessoa);
        }
    }

    public String atender(){
        Pessoa pessoa = filaNormal.remove();
        return pessoa.getDados();
    }

}