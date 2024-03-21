package utilidade;

import modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listPessoas;

    public OrdenacaoPessoa() {
        this.listPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, float altura){
        listPessoas.add(new Pessoa(nome, idade, altura));
    }

    public void ordenarPorIdade() {
        System.out.println("Orddem atual: " + listPessoas);
        listPessoas.sort((p1, p2) -> p1.getIdade() - p2.getIdade());
        System.out.println("Ordem nova: " + listPessoas);
    }

    public void ordenarPorAltura() {
        System.out.println("Orddem atual: " + listPessoas);
        listPessoas.sort((p2, p1) -> Float.compare(p1.getAltura(), p2.getAltura()));
        System.out.println("Ordem nova: " + listPessoas);
    }

}
