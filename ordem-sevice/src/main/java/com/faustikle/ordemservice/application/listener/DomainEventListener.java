package com.faustikle.ordemservice.application.listener;

import com.faustikle.ordemservice.domain.shared.DomainEvent;

public interface DomainEventListener<T> {

    public void handle(T event);
}
