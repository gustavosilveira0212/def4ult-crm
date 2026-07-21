package br.com.defaultcompany.model;

public class Usuario {

    private int id;
    private String nome;
    private String login;
    private String senha;
    private String cargo;
    private boolean ativo;

    public Usuario() {

    }

    public Usuario(int id, String nome, String login,
                   String senha, String cargo, boolean ativo) {

        // Fazendo a validação de dados dentro do construtor:

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }

        if (login == null || login.isBlank()) {
            throw new IllegalArgumentException("Login não pode ser vazio!");
        }

        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cargo = cargo;
        this.ativo = ativo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {

        // Criando essa restrição para que não seja gerado nenhum valor NULO ou sem argumento

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
            this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setLogin(String nome) {
        // Criando essa restrição para que não seja gerado nenhum valor NULO ou sem argumento

        if (login == null || login.isBlank()) {
            throw new IllegalArgumentException("Login não pode ser vazio");
        }

        this.nome = nome;
    }

    public String getLogin() {
        return nome;
    }

    public void setSenha(String senha) {

        // Criando essa restrição para que não seja gerado nenhum valor NULO ou sem argumento

        if (senha == null || senha.isBlank()) {
            throw new IllegalArgumentException("Senha não pode ser vazia");
        }

        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setCargo(String cargo) {

        if (cargo == null || cargo.isBlank()) {
            throw new IllegalArgumentException("Cargo não pode ser vazio");
        }
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean getAtivo() {
        return ativo;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Usuário{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", login='").append(login).append('\'');
        sb.append(", cargo'").append(cargo).append('\'');
        sb.append(", ativo=").append(ativo).append('\'');
        sb.append('}');

        return sb.toString();
    }
}
