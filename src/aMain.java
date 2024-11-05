import java.util.ArrayList;
import java.util.Scanner;

public class aMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int posicao = 0;
        int numprateleira = 0;
        int[][] prateleira = new int[posicao][numprateleira];

        System.out.println("Qual a posição do Livro? ");
        posicao = scan.nextInt();
        System.out.println("Qual a prateleira do Livro? ");
        numprateleira  = scan.nextInt();

        ArrayList<Livro> listalivros = new ArrayList<>();

        System.out.println("Qual o nome do Livro? ");
        String nomelivro = scan.nextLine();
        System.out.println("Qual a editora do Livro? ");
        String editora = scan.nextLine();
        System.out.println("Qual o autor do Livro? ");
        String autor = scan.nextLine();
        System.out.println("Qual a categoria do Livro? ");
        String categoria = scan.nextLine();
        System.out.println("Qual o idioma do Livro? ");
        String idioma = scan.nextLine();
        System.out.println("Qual a numeropagina do Livro? ");
        int numeropagina = scan.nextInt();
        System.out.println("Qual a datainclusao do Livro? ");
        int datainclusao = scan.nextInt();
        System.out.println("Qual a avaliacao do Livro? ");
        int avaliacao = scan.nextInt();
        System.out.println("Digite um breve resumo do Livro: ");
        String resumo = scan.nextLine();

        Livro livro = new Livro(nomelivro,editora,autor,categoria,idioma,numeropagina,datainclusao,avaliacao,resumo);
        listalivros.add(livro);


        //teste commit
    }
}