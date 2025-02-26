package com.jdbc.Service;

import com.jdbc.DAO.UsuarioDAO;
import com.jdbc.Model.Usuario;
//IMPLEMENTAR -> import org.mindrot.jbcrypt.BCrypt;

import java.util.ArrayList;

public class ControllerUsuario {

    public static ArrayList<Usuario> usuarioList = new ArrayList<>();

    public static void cadastrarUsuario(String nomeusuario, String loginusuario, String senhausuario) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        //Verifica se o usuário já é existente
        if (usuarioDAO.verificarUsuarioExisteDB(loginusuario)) {
            System.out.println("Erro: Usuário já existente!!");
        }

        // Gerar hash da senha antes de salvar no banco
        // IMPLEMENTAR -> String senhaHash = BCrypt.hashpw(senhaUsuario, BCrypt.gensalt());

        Usuario usuario = new Usuario();
        usuario.setNomeUsuario(nomeusuario);
        usuario.setLoginUsuario(loginusuario);
        usuario.setSenhaUsuario(senhausuario);

        // Cadastra o usuário no banco
        if (usuarioDAO.cadastrarUsuarioDB(usuario)) {
            usuarioList.add(usuario);
            System.out.println("Usuario cadastrado com sucesso. =)");
        } else {
            System.out.println("Erro ao cadastrar usuário!!");
        }
    }

    public static boolean autenticarUsuario(String usuario, String senha) {
        for (Usuario usuario1 : usuarioList) {
            if (usuario1.getLoginUsuario().equals(usuario) && usuario1.getSenhaUsuario().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public static boolean loginUsuario(String usuario, String senha) {
        return autenticarUsuario(usuario, senha);
    }

    public static void consultarUsuario(String loginUsuario) {
        Usuario usuario = UsuarioDAO.consultarUsuarioDB(loginUsuario);

        if (usuario != null) {
            System.out.println("Usuário encontrado: " + usuario.getNomeUsuario());
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    public static void alterarUsuario(String loginUsuario, String nomeUsuario, String senhaUsuario) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // Gerar hash da senha antes de salvar no banco
        // IMPLEMENTAR -> String senhaHash = BCrypt.hashpw(senhaUsuario, BCrypt.gensalt());

        if (usuarioDAO.alterarUsuarioDB(loginUsuario, nomeUsuario, senhaUsuario)) {
            System.out.println("Usuário atualizado com sucesso.");
        } else {
            System.out.println("Erro ao atualizar o usuário. Verifique se o login está correto.");
        }
    }

    public static void removerUsuario(String nomeDeletado) {
        if (UsuarioDAO.removerUsuarioDB(nomeDeletado)) {
            usuarioList.removeIf(usuario -> usuario.getLoginUsuario().equals(nomeDeletado));
            System.out.println("Usuário removido com sucesso!");
        } else {
            System.out.println("Erro ao remover usuário. Verifique se o login está correto.");
        }
    }
}
