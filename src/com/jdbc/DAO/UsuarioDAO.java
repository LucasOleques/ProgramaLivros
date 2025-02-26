package com.jdbc.DAO;

import com.jdbc.DataBaseConnection.DataBaseConnection;
import com.jdbc.Model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public static boolean cadastrarUsuarioDB(Usuario usuario) {

        String sql = "INSERT INTO USUARIO (NOMEUSUARIO,LOGINUSUARIO,SENHAUSUARIO) VALUES (?,?,?)";
        PreparedStatement ps = null;

        try {
            ps = DataBaseConnection.getConexao().prepareStatement(sql);

            ps.setString(1, usuario.getNomeUsuario());
            ps.setString(2, usuario.getLoginUsuario());
            ps.setString(3, usuario.getSenhaUsuario());

            int linhasAfetadas = ps.executeUpdate();
            return linhasAfetadas > 0;


        } catch (SQLException exception) {
            System.out.println("Erro ao cadastrar usuário: " + exception.getMessage());
        }
        return false;
    }

    public static boolean verificarUsuarioExisteDB(String login) {
        String sql = "SELECT COUNT(*) FROM USUARIO WHERE LOGINUSUARIO = ?";

        try (Connection conn = DataBaseConnection.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                return true; // Usuário já existe
            }

        } catch (SQLException exception) {
            System.out.println("Erro ao verificar usuário: " + exception.getMessage());
        }
        return false;
    }

    public static Usuario consultarUsuarioDB(String loginUsuario) {
        String sql = "SELECT * FROM USUARIO WHERE LOGINUSUARIO = ?";
        Usuario usuario = null;

        try (Connection conn = DataBaseConnection.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, loginUsuario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setNomeUsuario(rs.getString("NOMEUSUARIO"));
                usuario.setLoginUsuario(rs.getString("LOGINUSUARIO"));
                usuario.setSenhaUsuario(rs.getString("SENHAUSUARIO"));
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar usuário: " + e.getMessage());
        }
        return usuario; // Retorna null se o usuário não for encontrado
    }

    public boolean alterarUsuarioDB(String loginUsuario, String novoNome, String novaSenha) {
        String sql = "UPDATE USUARIO SET NOMEUSUARIO = ?, SENHAUSUARIO = ? WHERE LOGINUSUARIO = ?";

        try (Connection conn = DataBaseConnection.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, novoNome);
            ps.setString(2, novaSenha);
            ps.setString(3, loginUsuario);

            int linhasAfetadas = ps.executeUpdate();
            return linhasAfetadas > 0; // Retorna true se a atualização foi bem-sucedida

        } catch (SQLException e) {
            System.out.println("Erro ao alterar usuário: " + e.getMessage());
            return false;
        }
    }

    public static boolean removerUsuarioDB(String loginUsuario) {
        String sql = "DELETE FROM USUARIO WHERE LOGINUSUARIO = ?";

        try (Connection conn = DataBaseConnection.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, loginUsuario);
            int linhasAfetadas = ps.executeUpdate();
            return linhasAfetadas > 0; // Retorna true se o usuário foi removido

        } catch (SQLException e) {
            System.out.println("Erro ao tentar remover usuário: " + e.getMessage());
        }
        return false;
    }
}