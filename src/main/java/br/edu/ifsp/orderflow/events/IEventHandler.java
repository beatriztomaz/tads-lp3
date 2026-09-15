package br.edu.ifsp.orderflow.events;

/**
 * Algo que irá consumir/reagir a tipo específico de evento (uma class que implementa IDomainEvent).
 *
 * O parametro de tipo E garante, em TEMPO DE COMPILAÇÃO, que um handler de PagamentoAprovado nunca receba um
 * PagamentoRecusado.
 */
public interface IEventHandler<E extends IDomainEvent> {

    void handle(E event);

    /**
     * Qual tipo de evento este handler trata/consome?
     *
     * Necessário por causa do apagamento de tipo do Java (type erasure).
     * @return
     */
    Class<E> eventType();
}
