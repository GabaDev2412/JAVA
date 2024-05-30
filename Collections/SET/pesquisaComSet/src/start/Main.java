package start;

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
                    //agendaContatos();
                    break;
                case 2:
                    System.out.println("Lista de tarefas");
                    //listaTarefas();
                    break;
            }
        }while (escolha != 0);
    }
}