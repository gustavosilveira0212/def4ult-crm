package br.com.defaultcompany.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/def4ult_company";
    private static final String USUARIO = "root";
    private static final String SENHA = "teste";

    public static Connection getConnection() {
        try {
            Connection conexao = DriverManager.getConnection(
                    URL,
                    USUARIO,
                    SENHA
            );

            System.out.println("Conectado com sucesso!");

            return conexao;

        } catch (SQLException e) {
            System.out.println("Erro ao conectar no banco de dados!");

            throw new RuntimeException(e);

        }
    }
}
