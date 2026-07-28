package br.com.defaultcompany.repository;

import br.com.defaultcompany.config.DatabaseConfig;
import br.com.defaultcompany.jooq.tables.Usuario;
import br.com.defaultcompany.jooq.tables.records.UsuarioRecord;
import org.jooq.DSLContext;

import java.util.List;

import static br.com.defaultcompany.jooq.Tables.USUARIO;

public class UsuarioRepository {

    private final DSLContext dsl;

    public UsuarioRepository() throws Exception {
        this.dsl = DatabaseConfig.getDSLContext();
    }

    public List<UsuarioRecord> buscarTodos() {
        return dsl.selectFrom(USUARIO)
                .fetch();
    }
}
