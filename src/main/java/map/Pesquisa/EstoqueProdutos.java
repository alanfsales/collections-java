package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotal = 0;
        for (Produto p : estoqueProdutoMap.values()){
            valorTotal += p.getQuantidade() * p.getPreco();
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        for (Produto p : estoqueProdutoMap.values()){
            if (p.getPreco() >= maiorValor){
                produtoMaisCaro = p;
                maiorValor = p.getPreco();
            }
        }
        return  produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorValor = obterProdutoMaisCaro().getPreco();
        for (Produto p : estoqueProdutoMap.values()){
            if (p.getPreco() <= menorValor){
                produtoMaisBarato = p;
                menorValor = p.getPreco();
            }
        }
        return  produtoMaisBarato;
    }


    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaisQuantValor = null;
        double maiorValor = Double.MIN_VALUE;
        for (Produto p : estoqueProdutoMap.values()){
            if ((p.getPreco() * p.getQuantidade()) >= maiorValor){
                produtoMaisQuantValor = p;
                maiorValor = p.getPreco() * p.getQuantidade();
            }
        }
        return produtoMaisQuantValor;
    }

}
