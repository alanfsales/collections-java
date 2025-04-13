package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota){
        alunos.add(new Aluno(matricula, nome, nota));
    }

    public void removerAluno(long matricula){
        alunos.removeIf(c -> c.getMatricula() == matricula);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        return new TreeSet<>(alunos);
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunos);
        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos(){
        return alunos;
    }
}
