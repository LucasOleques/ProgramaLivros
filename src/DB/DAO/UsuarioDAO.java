package DB.DAO;

import DB.Conexao.Conexao;
import EntidadesMVC.Model.Usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public void cadastrarUsuario(Usuario usuario){
        String sql = "INSERT INT USUARIO (NOMEUSUARIO,LOGINUSUARIO,SENHAUSUARIO) VALUES (?,?,?,?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1,usuario.getNomeusuario());
            ps.setString(2,usuario.getLoginusuario());
            ps.setString(3,usuario.getLoginusuario());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}