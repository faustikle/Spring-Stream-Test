package com.faustikle.estoqueservice.application.service;

import com.faustikle.estoqueservice.domain.shared.DomainEvent;

import java.util.List;

public interface DomainEventService {

    public void enviarEventos(List<DomainEvent> eventos);
}
