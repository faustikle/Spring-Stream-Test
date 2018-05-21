package com.faustikle.ordemservice.infrastructure.messaging.processor;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface DomainEventProcessor {

    String INPUT = "produto-sink";

    @Input("produto-sink")
    SubscribableChannel produtoSink();
}
