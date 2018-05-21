package com.faustikle.ordemservice.domain.model.produto;

import com.faustikle.ordemservice.domain.shared.DomainEvent;

public class ProdutoCriadoEvent implements DomainEvent<ProdutoCriadoEvent> {

    private Produto produto;

    public ProdutoCriadoEvent() {
    }

    public ProdutoCriadoEvent(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }
}
