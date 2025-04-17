package main.java.map.Pesquisa;

public class MainProduto {

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "Produto A" , 10, 5.0);
        estoque.adicionarProduto(2L, "Produto B" , 6, 10.0);
        estoque.adicionarProduto(3L, "Produto C" , 2, 15.0);
        estoque.adicionarProduto(4L, "Produto D" , 2, 20.0);

        estoque.exibirProdutos();
        System.out.println("Caro: " + estoque.obterProdutoMaisCaro());
        System.out.println("Barato: " + estoque.obterProdutoMaisBarato());
        System.out.println("Maior quant valor: " + estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println("Total estoque: " +estoque.calcularValorTotalEstoque());

    }
}
