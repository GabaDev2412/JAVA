package start;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int escolha;

        do{
            System.out.println("Exercícios de ordenação com List");
            System.out.println("1 - Adicionar pessoa\n" +
                    "2 - Ordenar por idade\n" +
                    "3 - Ordenar por altura\n" +
                    "0 - Sair");
            escolha = sc.nextInt();
        }while (escolha != 0);
    }
}