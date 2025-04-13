package main.java.map.OperacoesBasicas;

public class MainDicionario {

    public static void main(String[] args) {
        Dicionario d = new Dicionario();

        d.adicionarPalavra("palavra 1", "palavra 1 palavra 1 palavra 1 palavra 1");
        d.adicionarPalavra("palavra 2", "palavra 2 palavra 2 palavra 2 palavra 2");
        d.adicionarPalavra("palavra 3", "palavra 3 palavra 3 palavra 3 palavra 3");

        d.exibirPalavras();

        d.pesquisarPorPalavra("palavra 1");
        d.removerPalavra("palavra 1");
        d.exibirPalavras();
    }
}
