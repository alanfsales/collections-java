package main.java.set.Ordenacao;

public class MainProduto {

    public static void main(String[] args) {
        CadastroProduto cp = new CadastroProduto();
        cp.adicionarProduto(11,"Produto 6", 15, 5);
        cp.adicionarProduto(12,"Produto 2", 10, 5);
        cp.adicionarProduto(13,"Produto 3", 50, 5);
        cp.adicionarProduto(14,"Produto 4", 35, 5);

        System.out.println(cp.exibirProdutosPorNome());
        System.out.println(cp.exibirProdutosPorPreco());
        ;
    }
}
