package br.com.defaultcompany;

import br.com.defaultcompany.config.DatabaseConfig;
import org.jooq.DSLContext;

public class Main {

    public static void main(String[] args) throws Exception {

        DSLContext dsl = DatabaseConfig.getDSLContext();

        System.out.println("Conectado com sucesso!");
    }

}