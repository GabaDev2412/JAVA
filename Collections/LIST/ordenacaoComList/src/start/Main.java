package start;

import utilidade.OrdenacaoPessoa;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    static OrdenacaoPessoa pessoa = new OrdenacaoPessoa();
    public static void main(String[] args) {
        int escolha;
        do {
            System.out.println("Exercícios de ordenação com List");
            System.out.println("1 - Adicionar pessoa\n" +
                    "2 - Ordenar por idade\n" +
                    "3 - Ordenar por altura\n" +
                    "0 - Sair");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    adicionarPessoa();
                    break;
                case 2:
                    pessoa.ordenarPorIdade();
                    break;
                case 3:
                    pessoa.ordenarPorAltura();
                    break;
            }
        } while (escolha != 0);
    }

    public static void adicionarPessoa() {
        sc.nextLine();
        System.out.println("Digite o nome da pessoa: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        int idade = sc.nextInt();
        System.out.println("Digite a altura da pessoa (formato esperaro 0,00): ");
        float altura = sc.nextFloat();
        pessoa.adicionarPessoa(nome, idade, altura);
    }

}