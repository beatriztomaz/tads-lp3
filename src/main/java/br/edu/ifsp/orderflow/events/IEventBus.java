package br.edu.ifsp.orderflow.events;

public interface IEventBus {
    <E extends IDomainEvent> void publish(E event);

    <E extends IDomainEvent> void register(IEventHandler<E> handler);
}
