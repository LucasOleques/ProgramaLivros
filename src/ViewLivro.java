import java.util.ArrayList;
import java.util.Scanner;

public class ViewLivro {

    public static void exibirMenu(){
        Scanner scan = new Scanner(System.in);

        System.out.println("--- Biblioteca Particular ---\n");
        System.out.println(" 1 - Cadastrar Livro ");
        System.out.println(" 2 - Pequisa por Livro cadastrado ");
        System.out.println(" 3 - ERRO ");
        System.out.println(" 4 - ERRO ");
        System.out.println(" 5 - ERRO ");
        System.out.println(" 0 - Sair ");
        int opcao = scan.nextInt();

        switch (opcao){
            case 1:
                exibirCadastroLivro();
            case 2:
                pesquisaLivroCadastrado();
            case 3:

            case 4:

            case 5:

            case 0:
                break;
        }
    }
    //--------------------------------------------------------------------------------------------
    public static void exibirCadastroLivro () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a posição do Livro? ");
        int posicao = scan.nextInt();
        System.out.println("Qual a prateleira do Livro? ");
        int numprateleira = scan.nextInt();
        System.out.println("Qual o nome do Livro? ");
        String nomelivro = scan.next();
        System.out.println("Qual a editora do Livro? ");
        String editora = scan.next();
        System.out.println("Qual o autor do Livro? ");
        String autor = scan.next();
        System.out.println("Qual a categoria do Livro? ");
        String categoria = scan.next();
        System.out.println("Qual o idioma do Livro? ");
        String idioma = scan.next();
        System.out.println("Qual a numeropagina do Livro? ");
        int numeropagina = scan.nextInt();
        System.out.println("Qual a datainclusao do Livro? ");
        int datainclusao = scan.nextInt();
        System.out.println("Qual a avaliacao do Livro? ");
        int avaliacao = scan.nextInt();
        System.out.println("Digite um breve resumo do Livro: ");
        String resumo = scan.next();

        Livro livro = new Livro(posicao, numprateleira, nomelivro, editora, autor, categoria,
                idioma, numeropagina, datainclusao, avaliacao, resumo);
        ControllerLivro.adicionarLivro(livro);
    }
    //--------------------------------------------------------------------------------------------

    // Exibe todos os livros cadastrados
    public static void pesquisaLivroCadastrado() {
        ControllerLivro.getListalivros();
    }
    //-------------------------------------------------------------------------------------------

    // Exibe livros de uma prateleira específica
    public void exibirLivrosPorPosicao(int posicao) {
        ArrayList<Livro> livrosNaPrateleira = ControllerLivro.buscarLivroPorPosicao(posicao);
        if (!livrosNaPrateleira.isEmpty()) {
            ViewLivro.exibirMenu();
        } else {
            System.out.println("Nenhum livro encontrado na prateleira " + posicao + ".");
        }
    }
    //-------------------------------------------------------------------------------------------

    // Exibe detalhes de um livro específico pelo título
    public void exibirLivroPorNomeLivro(String nomelivro) {
        Livro livro = ControllerLivro.buscarLivroPorNomeLivro(nomelivro);
        if (livro != null) {
            ControllerLivro.getListalivros();
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
