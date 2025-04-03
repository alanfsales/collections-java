package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAsc = new ArrayList<>(numeros);
        Collections.sort(numerosAsc);
        return  numerosAsc;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosAsc = new ArrayList<>(ordenarAscendente());
        numerosAsc.sort(Collections.reverseOrder());
        return  numerosAsc;
    }
}
