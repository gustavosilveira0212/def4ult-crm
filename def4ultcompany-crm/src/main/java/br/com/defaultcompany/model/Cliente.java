package br.com.defaultcompany.model;

public class Cliente {

    private int id;
    private String nome;
    private String telefone;
    private String email;
    private String redeSocial;
    private String nicho;
    private String ondeVeio;
    private String trafego;
    private String indicacao;
    private String servicosDestribuidos;

    public Cliente() {

    }

    public Cliente(int id, String nome,
                   String telefone, String email,
                   String redeSocial, String nicho,
                   String ondeVeio, String trafego,
                   String indicacao, String servicosDestribuidos) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }

        if (telefone == null || telefone.isBlank()) {
            throw new IllegalArgumentException("Telefone não pode ser vazio!");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email não pode ser vazio!");
        }

        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.redeSocial = redeSocial;
        this.nicho = nicho;
        this.ondeVeio = ondeVeio;
        this.trafego = trafego;
        this.indicacao = indicacao;
        this.servicosDestribuidos = servicosDestribuidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(String redeSocial) {
        this.redeSocial = redeSocial;
    }

    public String getNicho() {
        return nicho;
    }

    public void setNicho(String nicho) {
        this.nicho = nicho;
    }

    public String getOndeVeio() {
        return ondeVeio;
    }

    public void setOndeVeio(String ondeVeio) {
        this.ondeVeio = ondeVeio;
    }

    public String getTrafego() {
        return trafego;
    }

    public void setTrafego(String trafego) {
        this.trafego = trafego;
    }

    public String getServicosDestribuidos() {
        return servicosDestribuidos;
    }

    public void setServicosDestribuidos(String servicosDestribuidos) {
        this.servicosDestribuidos = servicosDestribuidos;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Cliente{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", telefone='").append(telefone).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", redeSocial='").append(redeSocial).append('\'');
        sb.append(", nicho='").append(nicho).append('\'');
        sb.append(", ondeVeio='").append(ondeVeio).append('\'');
        sb.append(", trafego='").append(trafego).append('\'');
        sb.append(", indicacao='").append(indicacao).append('\'');
        sb.append(", servicosDistribuidos='").append(servicosDestribuidos).append('\'');

        return sb.toString();
    }
}
