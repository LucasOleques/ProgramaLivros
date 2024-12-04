package EntidadesMVC.Controller;

import EntidadesMVC.Model.Livro;

import java.util.ArrayList;

public class ControllerLivro {

    private static ArrayList<Livro> listalivros = new ArrayList<>();

    public static void createLivro(Livro livro) {
        listalivros.add(livro);
        System.out.println("Livro " + livro.getNomelivro() + " cadastrado com sucesso! ");
    }

    public static void readLivroPorNomeLivro(String nomelivro) {
        boolean encontrado = false;
        for (Livro livro : listalivros) {
            if (livro.getNomelivro().equalsIgnoreCase(nomelivro)) {
                System.out.println("O livro buscado foi '" + nomelivro);
                encontrado = true;
                break;
            }
        }
        if(!encontrado) {
            System.out.println("Livro não foi encontrado.");
        }
    }

    public static void updateLivro(String nomeAntigo, String novoNome) {
        for (Livro livro : listalivros) {
            if (livro.getNomelivro().equalsIgnoreCase(nomeAntigo)) {
                livro.setNomelivro(novoNome);
                System.out.println("Livro atualizado: " + livro);
                return;
            }
        }
        System.out.println("Livro não encontrado para atualização.");
    }

    public static void deleteLivroPorNome(String nomelivro) {
        for (int livro = 0; livro < listalivros.size(); livro++) {
            if (listalivros.get(livro).getNomelivro().equalsIgnoreCase(nomelivro)) {
                listalivros.remove(livro);
                System.out.println("Livro '" + nomelivro + "' removido com sucesso.");
                return; // Interrompe o loop após a remoção
            }
        }
        System.out.println("Erro: Livro com o título '" + nomelivro + "' não encontrado.");
    }
}
