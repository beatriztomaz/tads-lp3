package br.edu.ifsp.orderflow.domain;

public class ItemPedido {
    private final Produto produto;
    private final int qtd;

    public ItemPedido(Produto produto, int qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQtd() {
        return qtd;
    }

    @Override
    public String toString() {
        return this.qtd
    }
}
