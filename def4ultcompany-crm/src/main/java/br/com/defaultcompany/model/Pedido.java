package br.com.defaultcompany.model;

import br.com.defaultcompany.enums.StatusPedido;

import java.time.LocalDateTime;

public class Pedido {
    private Long pkPedidoId;
    private LocalDateTime dataPedido;
    private StatusPedido statusPedido;
    private Double valorTotal;

    public Pedido() {

    }

    public Pedido(Long pkPedidoId, LocalDateTime dataPedido,
                  StatusPedido statusPedido, Double valorTotal) {
        this.pkPedidoId = pkPedidoId;
        this.dataPedido = dataPedido;
        this.statusPedido = statusPedido;
        this.valorTotal = valorTotal;
    }

    public void setPkPedidoId(Long pkPedidoId) {
        this.pkPedidoId = pkPedidoId;
    }

    public Long getPkPedidoId() {
        return pkPedidoId;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setValorTotal(Double valorTotal) {
        if (valorTotal < 0) {
            throw new IllegalArgumentException("Não é permitido valor menor que R$ 0!");
        }

        this.valorTotal = valorTotal;
    }

    public Double getValorTotal() {
        return valorTotal;
    }
}
