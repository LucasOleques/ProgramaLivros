package EntidadesMVC.Controller;

import EntidadesMVC.Model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerUsuario {
    static Scanner scan = new Scanner(System.in);

    private static List<Usuario> usuarioList = new ArrayList<>();
    private static Usuario usuario = new Usuario();

    public static void cadastrarUsuario(String nomeusuario, String loginusuario, String senhausuario) {
        usuario.setNomeusuario(nomeusuario);
        usuario.setLoginusuario(loginusuario);
        usuario.setSenhausuario(senhausuario);
        usuarioList.add(usuario);
        System.out.println("Usuario cadastrado com sucesso.");
    }
    public static boolean autenticarUsuario(String usuario, String senha){
        for(Usuario usuario1 : usuarioList){
            if (usuario1.getLoginusuario().equals(usuario) && usuario1.getSenhausuario().equals(senha)){
                return true;
            }
        } return false;
    }
    public static boolean loginUsuario(String usuario, String senha){
        return autenticarUsuario(usuario, senha);
    }

    public static void consultarUsuario(){

    }

    public static void removerUsuario(){
        usuarioList.remove(usuario);
    }
}
