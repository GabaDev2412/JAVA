package start;

import utilidade.AgendaContatos;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Exercício pesquisa com SET");
        int escolha;

        do{
            System.out.println("1 - Agenda de Contatos" +
                    "\n2 - Lista de tarefas" +
                    "\n0 - Sair");
            escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("Agenda de Contatos");
                    agendaContatos();
                    break;
                case 2:
                    System.out.println("Lista de tarefas");
                    //listaTarefas();
                    break;
            }
        }while (escolha != 0);
    }

    private static void agendaContatos(){
        AgendaContatos agendaContatos = new AgendaContatos();
        int escolha;

        do{
            System.out.println("\n1 - Adicionar Contatos" +
                    "\n2 - Exibir Contatos" +
                    "\n3 - Pesquisar por Nome" +
                    "\n4 - Atualizar Numero Contato" +
                    "\n0 - Sair");
            escolha = sc.nextInt();
        }while (escolha != 0);
    }
}