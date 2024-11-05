package View;

import java.util.Scanner;

import static View.ViewLivro.*;

public class ViewMenu {
    static Scanner scan = new Scanner(System.in);
    static int opcao;

    public static void exibirMenu(){

        do {
            System.out.println("--- Biblioteca Particular ---\n");
            System.out.println(" 1 - Cadastrar livro ");
            System.out.println(" 2 - Pequisa por livro cadastrado ");
            System.out.println(" 3 - Alterar livro ");
            System.out.println(" 4 - Remover livro ");
            System.out.println(" 0 - Sair ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    exibirCreateLivro();
                case 2:
                    exibirReadLivro();
                case 3:
                    exibirUpdateLivro();
                case 4:
                    exibirDeleteLivro();
                case 5:

                case 0:
                    System.out.println("Saindo da biblioteca...");
                    break;
            }
        }
        while(opcao != 0);
        scan.close();
    }
}
