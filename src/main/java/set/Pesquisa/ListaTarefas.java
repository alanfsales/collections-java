package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        tarefas.removeIf(c -> c.getDescricao().equalsIgnoreCase(descricao));
    }

    public void exibirTarefas(){
        System.out.println(tarefas);
    }

    public int contarTarefas(){
        return  tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas =  new HashSet<>();

        for (Tarefa t : tarefas){
            if (t.isConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendetes = new HashSet<>();

        for (Tarefa t : tarefas){
            if (!t.isConcluida()){
                tarefasPendetes.add(t);
            }
        }
        return tarefasPendetes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : tarefas){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefas.clear();
    }

}
