package start;

import utilidade.CatalagoLivros;
import utilidade.SomaNumeros;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Exercícios de Pesquisa com LiST");
        int escolha;

        do{
            System.out.print("1 - Catálogo de Livros\n" +
                    "2 - Soma de Números\n" +
                    "0 - Sair\n" +
                    "Escolha uma opção: ");
            escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    catalagoLivros();
                    break;
                case 2:
                    somaNumeros();
                    break;
            }
        }while (escolha != 0);
    }

    private static void catalagoLivros(){
        CatalagoLivros catalago = new CatalagoLivros();
        int escolha;
        do{
            System.out.println("Bem vindo ao Catálogo de Livros\n");
            System.out.print("1 - Adicionar Livro\n" +
                    "2 - Pesquisar por Autor\n" +
                    "3 - Pesquisar por Título\n" +
                    "4 - Pesquisar por Intervalo de Ano\n" +
                    "5 - Listar Livros\n" +
                    "0 - Sair\n" +
                    "Escolha uma opção: ");
            escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    sc.nextLine();
                    System.out.println("Digite o autor do livro: ");
                    String autor = sc.nextLine();
                    System.out.println("Digite o título do livro: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o ano de publicação do livro: ");
                    int anoPublicacao = sc.nextInt();
                    catalago.adicionarLivro(titulo, autor, anoPublicacao);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Digite o autor que deseja pesquisar: ");
                    String autorPesquisa = sc.nextLine();
                    catalago.pesquisaPorAutor(autorPesquisa);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Digite o título que deseja pesquisar: ");
                    String tituloPesquisa = sc.nextLine();
                    catalago.pesquisaPorTitulo(tituloPesquisa);
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("Digite o ano de início do intervalo: ");
                    int anoInicio = sc.nextInt();
                    System.out.println("Digite o ano de fim do intervalo: ");
                    int anoFim = sc.nextInt();
                    catalago.pesquisaPorIntervaloAno(anoInicio, anoFim);
                    break;
                case 5:
                    catalago.listarLivros();
                    break;
            }
        }while (escolha != 0);
    }

    private static void somaNumeros(){
        SomaNumeros listNumeros = new SomaNumeros();
        int escolha;
        do{
            System.out.println("Bem vindo ao Soma de Números\n");
            System.out.print("1 - Adicionar Número\n" +
                    "2 - Somar Números\n" +
                    "3 - Maior Número\n" +
                    "4 - Menor Número\n" +
                    "5 - Listar Números\n" +
                    "0 - Sair\n" +
                    "Escolha uma opção: ");
            escolha = sc.nextInt();
            switch (escolha){
                case 1:
                    System.out.println("Digite o número que deseja adicionar: ");
                    int numero = sc.nextInt();
                    listNumeros.adicionarNumero(numero);
                    break;
                case 2:
                    System.out.println("A soma dos números é: " + listNumeros.somarNumeros());
                    break;
                case 3:
                    listNumeros.maiorNumero();
                    break;
                case 4:
                    listNumeros.menorNumero();
                    break;
                case 5:
                    listNumeros.listarNumeros();
                    break;
            }
        }while (escolha != 0);
    }
}