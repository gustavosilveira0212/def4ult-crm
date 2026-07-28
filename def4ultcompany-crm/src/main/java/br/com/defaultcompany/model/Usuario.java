package br.com.defaultcompany.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Usuario {
    private Long pkUsuarioId;
    private String nomeUsuario;
    private String emailUsuario;
    private String senhaUsuario;
    private Boolean usuarioAtivo;
    private LocalDateTime dataCriacao;

    public Usuario() {

    }

    public Usuario(Long pkUsuarioId, String nomeUsuario,
                   String emailUsuario, String senhaUsuario,
                   Boolean usuarioAtivo, LocalDateTime dataCriacao) {
        this.pkUsuarioId = pkUsuarioId;
        setNomeUsuario(nomeUsuario);
        setEmailUsuario(emailUsuario);
        setSenhaUsuario(senhaUsuario);
        setUsuarioAtivo(usuarioAtivo);
        setDataCriacao(dataCriacao);
    }

    public void setPkUsuarioId(Long pkUsuarioId) {
        this.pkUsuarioId = pkUsuarioId;
    }

    public Long getPkUsuarioId() {
        return pkUsuarioId;
    }

    public void setNomeUsuario(String nomeUsuario) {

        if (nomeUsuario == null || nomeUsuario.trim().isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }

        this.nomeUsuario = nomeUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {

        if(emailUsuario == null || emailUsuario.trim().isBlank()) {
            throw new IllegalArgumentException("Email não pode ser vazio!");
        }

        if (!emailUsuario.contains("@")) {
            throw new IllegalArgumentException("Email inválido!");
        }

        this.emailUsuario = emailUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {

        if (senhaUsuario == null || senhaUsuario.length() < 6) {
            throw new IllegalArgumentException("Senha não pode ser vazia!");
        }

        this.senhaUsuario = senhaUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setUsuarioAtivo(Boolean usuarioAtivo) {

        if (usuarioAtivo == null) {
            this.usuarioAtivo = true;
            return;
        }
        this.usuarioAtivo = usuarioAtivo;

    }

    public Boolean getUsuarioAtivo() {
        return usuarioAtivo;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

}
