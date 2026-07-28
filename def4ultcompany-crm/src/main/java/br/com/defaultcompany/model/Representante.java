package br.com.defaultcompany.model;

public class Representante {

    private Long pkRepresentanteId;
    private String representanteCnpj;
    private String razaoSocial;
    private String cpfResp;
    private String telefoneResp;

    public Representante() {

    }

    public Representante(Long pkRepresentanteId, String representanteCnpj,
                         String razaoSocial,
                         String cpfResp,
                         String telefoneResp) {
        this.pkRepresentanteId = pkRepresentanteId;
        setRepresentanteCnpj(representanteCnpj);
        setRazaoSocial(razaoSocial);
        setCpfResp(cpfResp);
        setTelefoneResp(telefoneResp);

    }

    public void setPkRepresentanteId(Long pkRepresentanteId) {
        this.pkRepresentanteId = pkRepresentanteId;
    }

    public Long getPkRepresentanteId() {
        return pkRepresentanteId;
    }

    public void setRepresentanteCnpj(String representanteCnpj) {
        if(representanteCnpj == null || representanteCnpj.length() != 14 ) {
            throw new IllegalArgumentException("Cnpj inválido!");
        }

        this.representanteCnpj = representanteCnpj;
    }

    public String getRepresentanteCnpj() {
        return representanteCnpj;
    }

    public void setRazaoSocial(String razaoSocial) {
        if (razaoSocial == null || razaoSocial.trim().isBlank()) {
            throw new IllegalArgumentException("Razão social inválido!");
        }

        if (razaoSocial.length() > 100) {
            throw new IllegalArgumentException("O nome da razão social excedeu a quantidade de caracteres!");
        }

        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setCpfResp(String cpfResp) {
        if (cpfResp == null || cpfResp.length() != 11) {
            throw new IllegalArgumentException("Cpf inválido! Tente novamente.");
        }

        this.cpfResp = cpfResp;
    }

    public String getCpfResp() {
        return cpfResp;
    }

    public void setTelefoneResp(String telefoneResp) {
        if (telefoneResp == null || telefoneResp.trim().isBlank()) {
            throw new IllegalArgumentException("Telefone não pode ser vazio.");
        }

        if (telefoneResp.matches("\\d+")) {
            throw new IllegalArgumentException("Telefone deve conter apenas números.");
        }

        this.telefoneResp = telefoneResp;
    }

    public String getTelefoneResp() {
        return telefoneResp;
    }
}
