package start;

import utilidade.ListaTarefa;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Exercícios de Operações Básicas com LIST");
        int escolha;

        do{
            System.out.print("1 - Lista de Tarefas\n" +
                    "2 - Carrinho de Compras\n" +
                    "0 - SAIR\n" +
                    "Escolha: ");
            escolha = sc.nextInt();

            switch (escolha){
                case 1:{
                    listaDeTarefas();
                    break;
                }
                case 2:
            }

        }while (escolha!= 0);

    }

    private static void listaDeTarefas(){
        ListaTarefa listaTarefa = new ListaTarefa();
        int escolha;
        do {
            System.out.println("\nBem vindo ao Lista de Tarefas!\n");
            System.out.print("1 - Adicionar tarefa\n" +
                    "2 - Remover tarefa\n" +
                    "3 - Obter número total de tarefas\n" +
                    "4 - Listar tarefas\n" +
                    "0 - SAIR\n" +
                    "Escolha: ");
            escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    String addTarefa;
                    System.out.println("Digite uma nova tarefa: ");
                    sc.nextLine();
                    listaTarefa.adicionarTarefa(addTarefa = sc.nextLine());
                    break;

                case 2:
                    String tarefaParaRemover;
                    System.out.println("Digite a tarefa que deseja remover: ");
                    sc.nextLine();
                    listaTarefa.removerTarefa(tarefaParaRemover = sc.nextLine());
                    break;

                case 3:
                    System.out.println("O número total de tarefas na lista é: "+listaTarefa.obterNumeroTotalTarefas());
                    break;

                case 4:
                    listaTarefa.obterDescricoesTarefas();
                    break;
            }
        }while (escolha != 0);
    }
}