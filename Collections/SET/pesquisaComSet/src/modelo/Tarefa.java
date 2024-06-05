package modelo;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean checkTarefa; // true = tarefa concluída, false = tarefa não concluída

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.checkTarefa = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCheckTarefa() { // método get para boolean
        return checkTarefa;
    }

    public void setCheckTarefa(boolean checkTarefa) { // método set para boolean
        this.checkTarefa = checkTarefa;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", checkTarefa=" + checkTarefa +
                '}';
    }
}
