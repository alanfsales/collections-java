package main.java.list.OperacoesBasicas;

public class MainCarrinho {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Pão", 1, 5);
        carrinho.adicionarItem("Queijo", 30, 1);
        carrinho.adicionarItem("Queijo", 30, 1);

        System.out.println("Total: " + carrinho.calcularValorTotal());
        System.out.println(carrinho.exibirItens());

        carrinho.removerItem("Queijo");
        System.out.println("Total: " + carrinho.calcularValorTotal());
        System.out.println(carrinho.exibirItens());
    }
}
