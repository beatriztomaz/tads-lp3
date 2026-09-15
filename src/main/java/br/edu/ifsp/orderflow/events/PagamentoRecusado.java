package br.edu.ifsp.orderflow.events;

public record PagamentoRecusado(
        String pedidoId,
        String motivo,
        Instant ocorridoEm
) implements IDomainEvent {
}
