package EntidadesMVC.View;

import EntidadesMVC.Controller.ControllerLivro;

import static EntidadesMVC.View.MenuGeral.*;

public class ViewLivro {

    static int opcao;

    public static void exibirCreateLivro() {
        System.out.println("Qual o nome do livro? ");
        String nomelivro = scan.next();
        System.out.println("Qual a editora do livro? ");
        String editora = scan.next();
        System.out.println("Qual o autor do livro? ");
        String autor = scan.next();
        System.out.println("Qual o numero depagina do livro? ");
        int numeropagina = scan.nextInt();

        /**
         * Livro livro = new Livro(nomelivro, editora, autor, numeropagina);
         *         ControllerLivro.createLivro(livro);
         *
         *         System.out.println("Qual a posição do livro? ");
         *         int posicao = scan.nextInt();
         *         System.out.println("Qual a prateleira do livro? ");
         *         int numprateleira = scan.nextInt();
         *
         *         Estoque estoque = new Estoque(posicao, numprateleira);
         *         ControllerEstoque.createLivroNoEstoque(estoque);
         */

    }

    public static void exibirReadLivro(){
        System.out.println("Digite o nome do livro a ser buscado: ");
        String nomelivro = scan.nextLine();
        ControllerLivro.readLivroPorNomeLivro(nomelivro);
    }

    public static void exibirUpdateLivro(){
        System.out.println("Digite o nome do livro a ser alterado: ");
        String nomeAntigo = scan.nextLine();
        System.out.println("Digite o novo nome do livro: ");
        String novoNome = scan.nextLine();
        ControllerLivro.updateLivro(nomeAntigo, novoNome);
    }


    public static void exibirDeleteLivro(){
        System.out.println("Digite o nome do livro a ser removido: ");
        String nomelivro = scan.nextLine();
        ControllerLivro.deleteLivroPorNome(nomelivro);
    }
}
