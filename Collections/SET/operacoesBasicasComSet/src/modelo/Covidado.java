package modelo;

import java.util.Objects;

public class Covidado {
    private String nome;
    private String codConvite;

    public Covidado(String nome, String codConvite) {
        this.nome = nome;
        this.codConvite = codConvite;
    }

    public String getNome() {
        return nome;
    }

    public String getCodConvite() {
        return codConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Covidado covidado = (Covidado) o;
        return Objects.equals(getCodConvite(), covidado.getCodConvite());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodConvite());
    }

    @Override
    public String toString() {
        return "\nCovidado{" +
                "\nnome= '" + nome + '\'' +
                ", \ncodConvite= " + codConvite +
                '}';
    }
}
