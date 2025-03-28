package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (int n: numeros){
            soma = soma + n;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;
        for (int n : numeros){
            if (n > maior){
                maior = n;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = encontrarMaiorNumero();
        for (int n : numeros){
            if (n < menor){
                menor = n;
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros(){
        return numeros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(11);
        somaNumeros.adicionarNumero(100);
        somaNumeros.adicionarNumero(19);
        somaNumeros.adicionarNumero(25);

        System.out.println(somaNumeros.exibirNumeros());
        System.out.println("Soma: " + somaNumeros.calcularSoma());
        System.out.println("Maior: " +somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor: " +somaNumeros.encontrarMenorNumero());


    }
}
