package main.java.set.Ordenacao;

public class MainAlunos {

    public static void main(String[] args) {
        GerenciadorAlunos ga = new GerenciadorAlunos();

        ga.adicionarAluno("Cris", 11,8);
        ga.adicionarAluno("Alan", 12,10);
        ga.adicionarAluno("Maria", 13,5);
        ga.adicionarAluno("João", 14,6);

        System.out.println("Por nome: " + ga.exibirAlunosPorNome());
        System.out.println("Por nota: " + ga.exibirAlunosPorNota());
        System.out.println("Sem ordem: " + ga.exibirAlunos());

        ga.removerAluno(13);

        System.out.println("Removel 1 " + ga.exibirAlunos());


    }
}
