package utilidade;

import modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listPessoas;

    public OrdenacaoPessoa(List<Pessoa> listPessoas) {
        this.listPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, float altura){
        listPessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade() {
        listPessoas.sort((p1, p2) -> p1.getIdade() - p2.getIdade());
    }

    public void ordenarPorAltura() {
        listPessoas.sort((p2, p1) -> Float.compare(p1.getAltura(), p2.getAltura()));
    }

}
