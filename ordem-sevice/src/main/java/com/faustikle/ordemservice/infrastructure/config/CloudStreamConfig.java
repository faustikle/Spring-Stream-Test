package com.faustikle.ordemservice.infrastructure.config;

import com.faustikle.ordemservice.infrastructure.messaging.processor.DomainEventProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(DomainEventProcessor.class)
public class CloudStreamConfig {
}
