package br.edu.ifsp.orderflow.events;

/**
 * Evento que ser apublicado quando um pagamento for aprovado.
 * @param pedidoId
 * @param transacaoId
 * @param ocorridoEm
 */
public record PagamentoAprovado(
        String pedidoId,
        String transacaoId,
        Instant ocorridoEm
) implements IDomainEvent {
}
