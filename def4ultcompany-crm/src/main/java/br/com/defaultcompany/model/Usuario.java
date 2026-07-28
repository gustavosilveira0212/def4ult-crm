package br.com.defaultcompany.model;

import java.time.LocalDateTime;

public class Usuario {
    private Long pkUsuarioId;
    private String nomeUsuario;
    private String emailUsuario;
    private String senhaUsuario;
    private Boolean usuarioAtivo;
    private LocalDateTime dataCriacao;

    public Usuario() {

    }

    public Usuario(Long pkUsuarioId, String nomeUsuario, String senhaUsuario, String emailUsuario, Boolean usuarioAtivo, LocalDateTime dataCriacao) {

        this.pkUsuarioId = pkUsuarioId;
        setNomeUsuario(nomeUsuario);
        setSenhaUsuario(senhaUsuario);
        setEmailUsuario(emailUsuario);
        setUsuarioAtivo(usuarioAtivo);
        this.dataCriacao = dataCriacao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {

        if (nomeUsuario == null || nomeUsuario.trim().isBlank()) {
            throw new IllegalArgumentException("O nome não pode ser vazio!");
        }

        this.nomeUsuario = nomeUsuario;
    }

    public Long getPkUsuarioId() {
        return pkUsuarioId;
    }

    public void setPkUsuarioId(Long pkUsuarioId) {
        this.pkUsuarioId = pkUsuarioId;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {

        if(emailUsuario == null || emailUsuario.trim().isBlank()) {
            throw new IllegalArgumentException("O email não pode ser vazio!");
        }

        if (!emailUsuario.contains("@")) {
            throw new IllegalArgumentException("Formato errado de email!");
        }
        this.emailUsuario = emailUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {

        if (senhaUsuario == null || senhaUsuario.trim().isBlank()) {
            throw new IllegalArgumentException("A senha não pode ser vazia!");
        }
        this.senhaUsuario = senhaUsuario;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Boolean getUsuarioAtivo() {
        return usuarioAtivo;
    }

    public void setUsuarioAtivo(Boolean usuarioAtivo) {

        if(usuarioAtivo == null) {
            this.usuarioAtivo = true;
        }
        this.usuarioAtivo = usuarioAtivo;
    }
}
