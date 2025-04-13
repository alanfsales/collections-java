package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agenda;

    public AgendaContatos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agenda.put(nome, telefone);
    }

    public void removerContato(String nome){
        agenda.remove(nome);
    }

    public void exibirContatos(){
        System.out.println(agenda);
    }

    public void pesquisarPorNome(String nome){
        System.out.println(agenda.get(nome));
    }
}
