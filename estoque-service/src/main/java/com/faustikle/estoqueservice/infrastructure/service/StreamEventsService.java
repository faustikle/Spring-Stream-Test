package com.faustikle.estoqueservice.infrastructure.service;

import com.faustikle.estoqueservice.application.service.DomainEventService;
import com.faustikle.estoqueservice.domain.shared.DomainEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreamEventsService implements DomainEventService {

    @Autowired
    private Source pipe;

    @Override
    public void enviarEventos(List<DomainEvent> eventos) {
        for(DomainEvent evento: eventos) {
            pipe.output().send(getMessageFromEvent(evento));
        }
    }

    private Message getMessageFromEvent(DomainEvent event) {
        return MessageBuilder
                .withPayload(event)
                .setHeader("type", event.getClass().getSimpleName())
                .build();
    }
}
