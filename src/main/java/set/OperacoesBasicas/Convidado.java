package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

    private int numeroConvite;
    private String nome;

    public Convidado(int numeroConvite, String nome) {
        this.numeroConvite = numeroConvite;
        this.nome = nome;
    }

    public int getNumeroConvite() {
        return numeroConvite;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getNumeroConvite() == convidado.getNumeroConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNumeroConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "numeroConvite = " + numeroConvite +
                ", nome = '" + nome + '\'' +
                '}';
    }
}
