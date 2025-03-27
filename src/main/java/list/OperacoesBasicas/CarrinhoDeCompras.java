package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome,preco, quantidade);
        itens.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for(Item i: itens){
            if (i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }
        itens.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal(){
        double soma = 0;
        for (Item i: itens){
            soma = soma + (i.getPreco() * i.getQuantidade());
        }

        return soma;
    }

    public List<Item> exibirItens(){
        return itens;
    }

}
