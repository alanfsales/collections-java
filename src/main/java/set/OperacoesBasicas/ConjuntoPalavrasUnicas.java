package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        palavras.removeIf(p -> p.equals(palavra));
    }

    public boolean verificarPalavra(String palavra){
        return palavras.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        palavras.forEach(System.out::println);
    }
}
