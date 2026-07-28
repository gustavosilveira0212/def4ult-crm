package br.com.defaultcompany.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://100.106.176.106:3306/projetos";

    public static Connection getConnection(String usuario, String senha) {

        try {
            return DriverManager.getConnection(URL, usuario, senha);
        } catch(SQLException e) {
            throw new RuntimeException("Erro ao conectar no banco de dados.");
        }
    }
}
