package br.com.defaultcompany;

import java.sql.Connection;
import br.com.defaultcompany.connection.Conexao;

public class Main {
    public static void main(String[] args) {
        Connection conexao = Conexao.getConnection();

        if (conexao != null) {
            System.out.println("Teste realizado com sucesso!");
        } else {
            System.out.println("Erro ao conectar no banco de dados!");
        }
    }
}