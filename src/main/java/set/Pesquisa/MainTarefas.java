package main.java.set.Pesquisa;

public class MainTarefas {

    public static void main(String[] args) {
        ListaTarefas lt = new ListaTarefas();

        lt.exibirTarefas();
        lt.adicionarTarefa("tarefa 1");
        lt.adicionarTarefa("tarefa 1");
        lt.adicionarTarefa("tarefa 2");
        lt.adicionarTarefa("tarefa 3");
        lt.exibirTarefas();
        System.out.println("Qtd " + lt.contarTarefas());
        lt.removerTarefa("tarefa 1");
        lt.exibirTarefas();
        System.out.println("Qtd " + lt.contarTarefas());
        lt.marcarTarefaConcluida("tarefa 2");
        System.out.println(lt.obterTarefasConcluidas());
        System.out.println(lt.obterTarefasPendentes());
        lt.marcarTarefaPendente("tarefa 2");
        System.out.println(lt.obterTarefasConcluidas());
        System.out.println(lt.obterTarefasPendentes());
        lt.limparListaTarefas();
        System.out.println("Limpou");
        lt.exibirTarefas();
    }
}
