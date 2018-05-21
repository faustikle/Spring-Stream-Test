package com.faustikle.ordemservice.application.listener;

import com.faustikle.ordemservice.domain.model.produto.Produto;
import com.faustikle.ordemservice.domain.model.produto.ProdutoCriadoEvent;
import com.faustikle.ordemservice.infrastructure.messaging.processor.DomainEventProcessor;
import com.faustikle.ordemservice.infrastructure.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class ProdutoCriadoListener implements DomainEventListener<ProdutoCriadoEvent> {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    @StreamListener(target = DomainEventProcessor.INPUT, condition = "headers['type']=='ProdutoCriadoEvent'")
    public void handle(ProdutoCriadoEvent evento) {
        Produto produto = evento.getProduto();
        Produto novoProduto = new Produto(produto.getId(), produto.getQuantidade());

        produtoRepository.save(novoProduto);

        System.out.println(ProdutoCriadoEvent.class.getSimpleName());


    }
}
