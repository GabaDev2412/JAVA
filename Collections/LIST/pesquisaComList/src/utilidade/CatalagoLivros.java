package utilidade;

import modelo.Livro;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> listLivros;

    public CatalagoLivros() {
        this.listLivros = new ArrayList<>();
    };

    public void adicionarLivro(String autor, String titulo, int anoPublicacao) {
        listLivros.add(new Livro(autor, titulo, anoPublicacao));
    };

    public void pesquisaPorAutor(String autor) {
        if (!listLivros.isEmpty()) {
            for (Livro livro : listLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    System.out.println("TITULO: " + livro.getTitulo() + "\nAUTOR: " + livro.getAutor() + "\nANO: " + livro.getAnoPublicacao());
                }else{
                    throw new RuntimeException("Não há livros do autor: " + autor);
                }
            }
        } else {
            throw new RuntimeException("Não há livros cadastrados");
        }
    };

        public void pesquisaPorTitulo (String titulo){
            if (!listLivros.isEmpty()) {
                for (Livro livro : listLivros) {
                    if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                        System.out.println("TITULO: " + livro.getTitulo() + "\nAUTOR: " + livro.getAutor() + "\nANO: " + livro.getAnoPublicacao());
                    }else{
                        throw new RuntimeException("Não há livros com o título: " + titulo);
                    }
                }
            } else {
                throw new RuntimeException("Não há livros cadastrados");
            }
        };

        public void pesquisaPorIntervaloAno (int anoInicio, int anoFim){
            for (Livro livro : listLivros) {
                if (livro.getAnoPublicacao() >= anoInicio && livro.getAnoPublicacao() <= anoFim) {
                    System.out.println("TITULO: " + livro.getTitulo() + "\nAUTOR: " + livro.getAutor() + "\nANO: " + livro.getAnoPublicacao());
                }
            }
        };

        public void listarLivros () {
            for (Livro livro : listLivros) {
                System.out.println(livro);
            }
        };
    }

