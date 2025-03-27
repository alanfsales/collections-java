package main.java.list.OperacoesBasicas;

public class MainTarefas {

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Número total de tarafas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("Número total de tarafas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("Número total de tarafas: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
