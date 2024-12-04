package EntidadesMVC.View;

import java.util.Scanner;

import static EntidadesMVC.Controller.ControllerUsuario.*;
import static EntidadesMVC.Controller.ControllerUsuario.removerUsuario;
import static EntidadesMVC.View.ViewLivro.*;

public class MenuGeral {
    static Scanner scan = new Scanner(System.in);
    static int opcao;

    public static void menuUsuario(){

        do {
            System.out.println("--- Menu Usuário ---\n");
            System.out.println(" 1 - Cadastrar Usuário ");
            System.out.println(" 2 - Login Usuário ");
            System.out.println(" 3 - Consultar Usuário Existente ");
            System.out.println(" 4 - Remover Usuário ");
            System.out.println(" 0 - Sair ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite nome do usuário: ");
                    String nomeusuario1 = scan.nextLine();
                    scan.nextLine();
                    System.out.println("Digite o login do usuário: ");
                    String loginusuario1 = scan.nextLine();
                    System.out.println("Digite a senha do usuário: ");
                    String senhausuario1 = scan.nextLine();
                    cadastrarUsuario(nomeusuario1,loginusuario1,senhausuario1);
                case 2:
                    System.out.println("Digite o login: ");
                    String login = scan.nextLine();scan.nextLine();
                    System.out.println("Digite a senha");
                    String senha = scan.nextLine();scan.nextLine();
                    boolean sucesso = loginUsuario(login, senha);
                    if (sucesso) {
                        System.out.println("Login bem-sucedido!");
                    } else {
                        System.out.println("Falha no login. Verifique suas credenciais.");
                    }
                    break;
                case 3:
                    consultarUsuario();
                case 4:
                    removerUsuario();
                case 0:
                    System.out.println("Saindo da biblioteca...");
                    break;
            }
        }
        while (opcao != 0);
        scan.close();
    }

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
                case 0:
                    System.out.println("Saindo da biblioteca...");
                    break;
            }
        }
        while(opcao != 0);
        scan.close();
    }
}

