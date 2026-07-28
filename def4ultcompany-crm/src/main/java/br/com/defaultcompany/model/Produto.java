package br.com.defaultcompany.model;

public class Produto {
    private Long pkProdutoId;
    private String nomeProduto;
    private String descricaoProduto;
    private Double precoProduto;
    private Boolean ativoProduto;
    private Integer quantidadeProduto;

    public Produto () {

    }

    public Produto(Long pkProdutoId, String nomeProduto,
                   String descricaoProduto,
                   Double precoProduto,
                   Boolean ativoProduto,
                   Integer quantidadeProduto) {
            this.pkProdutoId = pkProdutoId;
            setNomeProduto(nomeProduto);
            this.descricaoProduto = descricaoProduto;
            setPrecoProduto(precoProduto);
            setAtivoProduto(ativoProduto);
            setQuantidadeProduto(quantidadeProduto);

    }

    public void setPkProdutoId(Long pkProdutoId) {
        this.pkProdutoId = pkProdutoId;
    }

    public Long getPkProdutoId() {
        return pkProdutoId;
    }

    public void setNomeProduto(String nomeProduto) {
        if (nomeProduto == null || nomeProduto.trim().isBlank()) {
            throw new IllegalArgumentException("Nome incorreto.");
        }

        this.nomeProduto = nomeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        if (precoProduto < 0) {
            throw new IllegalArgumentException("Não é aceito valor menor que 0!");
        }

        this.precoProduto = precoProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setAtivoProduto(Boolean ativoProduto) {
        if (ativoProduto == null) {
            this.ativoProduto = true;
            return;
        }

        this.ativoProduto = ativoProduto;
    }

    public Boolean getAtivoProduto() {
        return ativoProduto;
    }

    public void setQuantidadeProduto(Integer quantidadeProduto) {
        if (quantidadeProduto < 0) {
            throw new IllegalArgumentException("Não é aceito valor menor que 0!");
        }

        this.quantidadeProduto = quantidadeProduto;
    }

    public Integer getQuantidadeProduto() {
        return quantidadeProduto;
    }
}
