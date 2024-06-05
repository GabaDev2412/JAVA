package start;

import utilidade.AgendaContatos;

import java.util.Scanner;

public class Main {
    protected static Scanner sc = new Scanner(System.in);
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
            System.out.println("Bem vindo ao Agenda Contatos!");
            System.out.println("\n1 - Adicionar Contatos" +
                    "\n2 - Exibir Contatos" +
                    "\n3 - Pesquisar por Nome" +
                    "\n4 - Atualizar Numero Contato" +
                    "\n0 - Sair");
            escolha = sc.nextInt();

            switch (escolha){
                case 1: // Adicionar Contatos
                    System.out.println("Digite o nome do contato: ");
                    String nome = sc.next();
                    System.out.println("Digite o numero do contato: ");
                    String numero = sc.next();
                    agendaContatos.adicionarContato(nome, numero);
                    break;
                case 2: // Exibir Contatos
                    agendaContatos.exibirContatos();
                    break;
                case 3: // Pesquisar por Nome
                    System.out.println("Digite o nome do contato: ");
                    String nomePesquisa = sc.next();
                    System.out.println(agendaContatos.pesquisarPorNome(nomePesquisa));
                    break;
                case 4: // Atualizar Numero Contato
                    System.out.println("Digite o nome do contato: ");
                    String nomeAtualizar = sc.next();
                    System.out.println("Digite o novo numero do contato: ");
                    String numeroAtualizar = sc.next();
                    agendaContatos.atualizarNumeroContato(nomeAtualizar, numeroAtualizar);
                    System.out.println("Contato atualizado.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (escolha != 0);
    }
}