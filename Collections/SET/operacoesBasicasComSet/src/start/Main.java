package start;

import utilidade.ConjuntoConvidados;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Exercício de Operações Basicas com SET");
        int escolha;

        do{
            System.out.println("1 - Conjunto de Convidados" +
                    "\n0 - Sair");
            escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    conjuntoConvidados();
                    break;
            }
        }while (escolha != 0);
    }

    private static void conjuntoConvidados() {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        int escolha;

        do{
            System.out.println("\n1 - Adicionar convidado" +
                    "\n2 - Remover convidado" +
                    "\n3 - Contar convidados" +
                    "\n4 - Exibir convidados" +
                    "\n0 - Sair");
            escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Digite o nome do convidado: ");
                    String nome = sc.next();
                    System.out.println("Digite o código do convite: ");
                    String codConvite = sc.next();
                    conjuntoConvidados.adicionarConvidado(nome, codConvite);
                    break;
                case 2:
                    System.out.println("Digite o código do convidado que deseja remover: ");
                    String codConviteRemove = sc.next();
                    conjuntoConvidados.removerConvidado(codConviteRemove);
                    break;
                case 3:
                    conjuntoConvidados.contarConvidados();
                    break;
                case 4:
                    conjuntoConvidados.exibirConvidados();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (escolha != 0);
    }
}