package br.com.defaultcompany.config;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DatabaseConfig {

    private static final String URL = "jdbc:mysql://localhost:3306/projetos";
    private static final String USUARIO = "root";
    private static final String SENHA = "senha.admin";

    private DatabaseConfig() {

    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                URL,
                USUARIO,
                SENHA
        );
    }

    public static DSLContext getDSLContext() throws SQLException {
        return DSL.using(
                getConnection(),
                SQLDialect.MYSQL
        );
    }

}
