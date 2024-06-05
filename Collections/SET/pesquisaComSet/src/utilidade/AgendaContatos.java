package utilidade;

import modelo.Contato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String telefone) {
        this.contatoSet.add(new Contato(nome.toLowerCase(), telefone));
    }

    public void exibirContatos() {
        for (Contato contato : this.contatoSet) {
            System.out.println(contato);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!contatoSet.isEmpty()) {
            for (Contato c : contatoSet) {
                if (c.getNome().startsWith(nome.toLowerCase())) {
                    // startsWith() é um método da classe String que verifica se a String
                    // começa com o valor passado como argumento
                    contatosPorNome.add(c);
                }
            }
            return contatosPorNome;

        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void atualizarNumeroContato(String nome, String novoTelefone){
        for (Contato contato : this.contatoSet) {
            if (contato.getNome().equals(nome.toLowerCase())) {
                contatoSet.add(new Contato(nome.toLowerCase(), novoTelefone));
                return;
            }
        }
        System.out.println("Contato não encontrado.");
    }


}
