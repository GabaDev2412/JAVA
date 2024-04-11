package utilidade;

import modelo.Palavra;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(new Palavra(palavra));
    }

public void removerPalavra(String palavra) {
        Palavra palavraRemove = null;
        for (Palavra p : palavrasSet) {
            if (p.getPalavra().equals(palavra)) {
                palavraRemove = p;
                break;
            }
        }
        if (palavraRemove != null) {
            palavrasSet.remove(palavraRemove);
        }
    }

    public void contarPalavras() {
        System.out.println("Total de palavras: " + palavrasSet.size());
    }

    public void exibirPalavras() {
        System.out.println("Lista de palavras: \n" + palavrasSet);
    }
}
