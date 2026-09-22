package br.edu.ifsp.orderflow.events.headlers;

import br.edu.ifsp.orderflow.events.IEventHandler;
import br.edu.ifsp.orderflow.events.PagamentoRecusado;

public class PagamentoRecusadoMetricasHandler implements IEventHandler<PagamentoRecusado> {

    private final Metricas metricas;

    PagamentoRecusadoMetricasHandler(Metricas metricas){
        this.metricas = metricas;
    }
    public void handle(PagamentoRecusado event) {
        this.metricas.incrementarQtdReprovado();
    }

    public Class<PagamentoRecusado> eventType(){
        return PagamentoRecusado.class;
    }
}
