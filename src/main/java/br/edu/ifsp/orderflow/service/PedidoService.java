package br.edu.ifsp.orderflow.service;

public class PedidoService {
    private IEstoqueService estoqueService;

    public PedidoService(IEstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }
    public Pedido processar (Pedido pedido) {
        boolean foiReservado = this.estoqueService.reservar(pedido);
        if (!foiReservado){
            pedido.cancelar();
            return pedido;
        }
    }
}
