package com.jdbc.DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/sistemalivro";
    private static final String user = "root";
    private static final String password = "";

    public static Connection getConexao() throws SQLException {
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados: " + e.getMessage());
            throw e;
        }
    }
}
