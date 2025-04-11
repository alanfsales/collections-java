package main.java.set.OperacoesBasicas;

public class MainPalavas {

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas cpu =new ConjuntoPalavrasUnicas();

       cpu.adicionarPalavra("Pão");
       cpu.adicionarPalavra("Ovo");
       cpu.adicionarPalavra("Queijo");
       cpu.adicionarPalavra("Café");
       cpu.adicionarPalavra("Café");

       cpu.exibirPalavrasUnicas();

        System.out.println(cpu.verificarPalavra("Café"));
        cpu.removerPalavra("Café");

        cpu.exibirPalavrasUnicas();
    }
}
