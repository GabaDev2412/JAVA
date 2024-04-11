package utilidade;

import modelo.Covidado;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Covidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, String codConvite) {
        convidadosSet.add(new Covidado(nome, codConvite));
    }

    public void removerConvidado(String codConvite) {
        Covidado covidado = null;
        for (Covidado c : convidadosSet) {
            if (c.getCodConvite().equals(codConvite)) {
                covidado = c;
                break;
            }
        }
        if (covidado != null) {
            convidadosSet.remove(covidado);
        }
    }

    public void contarConvidados() {
        System.out.println("Total de convidados: " + convidadosSet.size());
    }

    public void exibirConvidados() {
        System.out.println("Lista de convidados: \n" + convidadosSet);
    }
}
