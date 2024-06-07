package utilidade;

import modelo.Tarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {this.tarefaSet = new HashSet<>(); }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao.toLowerCase()));
    }

    public void removerPorDescricao(String descricao){
        Tarefa tarefaParaRemover = null;
        if(!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().startsWith(descricao.toLowerCase())) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            throw new RuntimeException("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else {
            throw new RuntimeException("Sem tarefas cadastradas!");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> getTarefaConcluida(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.isCheckTarefa()){
                tarefasConcluidas.add(t);
            }
        }
    }

}

