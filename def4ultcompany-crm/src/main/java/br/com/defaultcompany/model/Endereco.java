package br.com.defaultcompany.model;

public class Endereco {
    private Integer pkEnderecoId;
    private Integer fkClienteId;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private Boolean usuarioAtivo;

    public Endereco() {

    }

    public Endereco(Integer pkEnderecoId,
                    Integer fkClienteId,
                    String logradouro,
                    String numero,
                    String complemento,
                    String bairro,
                    String cidade,
                    String estado,
                    String cep,
                    Boolean usuarioAtivo) {
        this.pkEnderecoId = pkEnderecoId;
        setFkClienteId(fkClienteId);
        setLogradouro(logradouro);
        setNumero(numero);
        setComplemento(complemento);
        setBairro(bairro);
        setCidade(cidade);
        setEstado(estado);
        setCep(cep);
        setUsuarioAtivo(usuarioAtivo);
    }

    public void setPkEnderecoId(Integer pkEnderecoId) {
        this.pkEnderecoId = pkEnderecoId;
    }

    public Integer getPkEnderecoId() {
        return pkEnderecoId;
    }

    public void setFkClienteId(Integer fkClienteId) {
        if (fkClienteId == null || fkClienteId <= 0) {
            throw new IllegalArgumentException("Tentativa inválida! ID do cliente é obrigatório.");
        }

        this.fkClienteId = fkClienteId;
    }

    public Integer getFkClienteId() {
        return fkClienteId;
    }

    public void setLogradouro(String logradouro) {
        if (logradouro == null || logradouro.trim().isBlank()) {
            throw new IllegalArgumentException("Tentativa inválida! Logradouro não pode ser nulo ou conter espaços.");
        }

        if (logradouro.length() > 100) {
            throw new IllegalArgumentException("Tentativa inválida! Logradouro deve ter no máximo 100 caracteres.");
        }

        this.logradouro = logradouro.trim();
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setNumero(String numero) {
        if (numero == null || numero.trim().isBlank()) {
            throw new IllegalArgumentException("Tentativa inválida! Número não pode ser nulo ou conter espaços.");
        }

        if (!numero.matches("[A-Za-z0-9/-]+")) {
            throw new IllegalArgumentException("Tentativa inválida! Número contém caracteres inválidos.");
        }

        this.numero = numero.trim();
    }

    public String getNumero() {
        return numero;
    }

    public void setComplemento(String complemento) {
        if (complemento == null || complemento.trim().isBlank()) {
            this.complemento = null;
            return;
        }

        if (complemento.length() > 100) {
            throw new IllegalArgumentException("Tentativa inválida! Complemento deve ter no máximo 100 caracteres.");
        }

        this.complemento = complemento.trim();
    }

    public String getComplemento() {
        return complemento;
    }

    public void setBairro(String bairro) {
        if (bairro == null || bairro.trim().isBlank()) {
            throw new IllegalArgumentException("Tentativa inválida! Bairro não pode ser nulo ou conter espaços.");
        }

        if (bairro.length() > 100) {
            throw new IllegalArgumentException("Tentativa inválida! Bairro deve ter no máximo 100 caracteres.");
        }

        this.bairro = bairro.trim();
    }

    public String getBairro() {
        return bairro;
    }

    public void setCidade(String cidade) {
        if (cidade == null || cidade.trim().isBlank()) {
            throw new IllegalArgumentException("Tentativa inválida! Cidade não pode ser nulo ou conter espaços.");
        }

        if (cidade.length() > 100) {
            throw new IllegalArgumentException("Tentativa inválida! Cidade deve ter no máximo 100 caracteres.");
        }

        this.cidade = cidade.trim();
    }

    public String getCidade() {
        return cidade;
    }

    public void setEstado(String estado) {
        if (estado == null || estado.trim().isBlank()) {
            throw new IllegalArgumentException("Tentativa inválida! Estado não pode ser nulo ou conter espaços.");
        }

        estado = estado.trim().toUpperCase();

        if (estado.length() != 2) {
            throw new IllegalArgumentException("Tentativa inválida! Estado deve conter 2 caracteres.");
        }

        if (!estado.matches("AC|AL|AP|AM|BA|CE|DF|ES|GO|MA|MT|MS|MG|PA|PB|PR|PE|PI|RJ|RN|RS|RO|RR|SC|SP|SE|TO")) {
            throw new IllegalArgumentException("Tentativa inválida! Estado inválido.");
        }

        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setCep(String cep) {
        if (cep == null || cep.trim().isBlank()) {
            throw new IllegalArgumentException("Tentativa inválida! CEP não pode ser nulo ou conter espaços.");
        }

        cep = cep.trim();

        if (!cep.matches("\\d{8}")) {
            throw new IllegalArgumentException("Tentativa inválida! CEP deve conter exatamente 8 números.");
        }

        this.cep = cep;
    }

    public String getCep() {
        return cep;
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
