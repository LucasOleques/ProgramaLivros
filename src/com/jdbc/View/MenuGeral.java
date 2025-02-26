package com.jdbc.View;

import java.util.Scanner;
import static com.jdbc.Service.ControllerUsuario.*;

public class MenuGeral {
    static Scanner scan = new Scanner(System.in);

    public static void menuUsuario(){
        int opcao;

        do {
            System.out.println("--- Menu Usuário ---\n");
            System.out.println(" 1 - Cadastrar Usuário ");
            System.out.println(" 2 - Login Usuário ");
            System.out.println(" 3 - Consultar Usuário Existente ");
            System.out.println(" 4 - Alterar Usuário Existente ");
            System.out.println(" 5 - Remover Usuário ");
            System.out.println(" 0 - Sair ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite nome do usuário: ");
                    String nomeusuario1 = scan.next();
                    scan.nextLine();
                    System.out.println("Digite o login do usuário: ");
                    String loginusuario1 = scan.next();
                    scan.nextLine();
                    System.out.println("Digite a senha do usuário: ");
                    String senhausuario1 = scan.next();
                    scan.nextLine();
                    cadastrarUsuario(nomeusuario1,loginusuario1,senhausuario1);
                    break;
                case 2:
                    System.out.println("Digite o login: ");
                    String login = scan.next();
                    scan.nextLine();
                    System.out.println("Digite a senha");
                    String senha = scan.next();
                    scan.nextLine();
                    boolean sucesso = loginUsuario(login, senha);
                    if (sucesso) {
                        System.out.println("Login bem-sucedido!");
                    } else {
                        System.out.println("Falha no login. Verifique suas credenciais.");
                    }
                    break;
                case 3:
                    System.out.println("Qual Login de Usuário deseja buscar? ");
                    String usuarioConsulta = scan.next();
                    scan.nextLine();
                    consultarUsuario(usuarioConsulta);
                    break;
                case 4:
                    System.out.println("Qual Login de usuário deseja alterar?");
                    String usuarioAlterar = scan.next();
                    scan.nextLine();
                    System.out.println("Digite o novo nome do usuário:");
                    String nomeUsuario = scan.nextLine();
                    System.out.println("Digite a nova senha do usuário:");
                    String senhaUsuario = scan.nextLine();
                    alterarUsuario(usuarioAlterar, nomeUsuario, senhaUsuario);
                    break;
                case 5:
                    System.out.println("Digite o nome a ser deletado: ");
                    String nomedeletado = scan.next();
                    scan.nextLine();
                    removerUsuario(nomedeletado);
                    break;
                case 0:
                    System.out.println("Saindo da biblioteca...");
                    break;
            }
        }
        while (opcao != 0);
        scan.close();
    }

    public static void exibirMenu(){
        int opcao;

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
                    ViewLivro.exibirCreateLivro();
                case 2:
                    ViewLivro.exibirReadLivro();
                case 3:
                    ViewLivro.exibirUpdateLivro();
                case 4:
                    ViewLivro.exibirDeleteLivro();
                case 0:
                    System.out.println("Saindo da biblioteca...");
                    break;
            }
        }
        while(opcao != 0);
        scan.close();
    }
}

