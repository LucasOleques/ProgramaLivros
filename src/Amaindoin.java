import com.jdbc.DataBaseConnection.DataBaseConnection;
import com.jdbc.View.MenuGeral;

import java.sql.SQLException;

public class Amaindoin {
    public static void main(String[] args) throws SQLException {
        //Conexão ao DB
        DataBaseConnection.getConexao();

        MenuGeral.menuUsuario();
    }
}