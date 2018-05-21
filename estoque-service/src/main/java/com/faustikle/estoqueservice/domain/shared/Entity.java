package com.faustikle.estoqueservice.domain.shared;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity {

    @JsonIgnore
    private List<DomainEvent> eventos;

    public Entity() {
        this.eventos = new ArrayList<>();
    }

    public void adicionarEvento(DomainEvent evento) {
        this.eventos.add(evento);
    }

    public void limparEventos() {
        this.eventos.clear();
    }

    public List<DomainEvent> getEventos() {
        return eventos;
    }
}
