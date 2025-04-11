package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        Convidado convidado = new Convidado(codigoConvite, nome);
        convidados.add(convidado);
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        convidados.removeIf(c -> c.getNumeroConvite() == codigoConvite);
//        for (Convidado c : convidados){
//            if (c.getNumeroConvite() == codigoConvite){
//                convidados.remove(c);
//            }
//        }
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        convidados.forEach(System.out::println);
        //System.out.println(convidados);
    }

}
