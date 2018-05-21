package com.faustikle.estoqueservice.domain.model.produto;

import com.faustikle.estoqueservice.domain.shared.DomainEvent;

public class ProdutoCriadoEvent implements DomainEvent<ProdutoCriadoEvent> {

    private Produto produto;

    private String eventType;

    public ProdutoCriadoEvent(Produto produto) {
        this.produto = produto;
        this.eventType = "ProdutoCriadoEvent";
    }

    public Produto getProduto() {
        return produto;
    }

    public String getEventType() {
        return eventType;
    }
}
