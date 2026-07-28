package br.com.defaultcompany.model;

public class Cliente {
    private Integer pkClienteId;
    private String cpf;
    private String nome;
    private String email;
    private String telefone;
    private Boolean usuarioAtivo;

    public Cliente() {

    }

    public Cliente(Integer pkClienteId,
                   String cpf,
                   String nome,
                   String email,
                   String telefone,
                   Boolean usuarioAtivo) {
        this.pkClienteId = pkClienteId;
        setCpf(cpf);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setUsuarioAtivo(usuarioAtivo);
    }

    public void setPkClienteId(Integer pkClienteId) {
        this.pkClienteId = pkClienteId;
    }

    public Integer getPkClienteId() {
        return pkClienteId;
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isBlank()) {
            throw new IllegalArgumentException("Tentativa inválida! CPF não pode ser nulo ou conter espaços.");
        }

        if(cpf.length() != 11) {
            throw new IllegalArgumentException("Tentativa inválida! CPF deve conter exatamente 11 números.");
        }

        if (!cpf.matches("\\d{11}")) {
            throw new IllegalArgumentException("Tentativa inválida! CPF deve conter exatamente 11 números.");
        }

        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isBlank()){
            throw new IllegalArgumentException("Tentativa inválida! Nome não pode ser nulo ou conter espaços.");
        }

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isBlank()) {
            throw new IllegalArgumentException("Tentativa inválida! E-mail não pode ser nulo ou conter espaços.");
        }

        if (!email.contains("@")) {
            throw new IllegalArgumentException("Tentativa inválida! E-mail deve conter @.");
        }

        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        if (telefone == null || telefone.trim().isBlank()) {
            throw new IllegalArgumentException("Tentativa inválida! Telefone não pode ser nulo ou conter espaços.");
        }

        if (!telefone.matches("\\d+")) {
            throw new IllegalArgumentException("Tentativa inválida! Telefone deve conter apenas números.");
        }

        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
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
}
