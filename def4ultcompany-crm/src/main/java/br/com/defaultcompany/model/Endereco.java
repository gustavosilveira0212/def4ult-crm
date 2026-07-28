package br.com.defaultcompany.model;

public class Endereco {
    private Integer pkEnderecoId;
    private Integer fkUsuarioId;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private Character estado;
    private String cep;
    private Boolean usuarioAtivo;

    public Endereco() {

    }

    public Endereco(Integer pkEnderecoId,
                    Integer fkUsuarioId,
                    String logradouro,
                    String numero,
                    String complemento,
                    String bairro,
                    String cidade,
                    Character estado,
                    String cep,
                    Boolean usuarioAtivo) {
        this.pkEnderecoId = pkEnderecoId;
    }

    public void setPkEnderecoId(Integer pkEnderecoId){
        this.pkEnderecoId = pkEnderecoId;
    }

    public Integer getPkEnderecoId(Integer pkEnderecoId) {
        return this.pkEnderecoId;
    }

    //public Integer
}
