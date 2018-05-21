package com.faustikle.estoqueservice.application.service;

import com.faustikle.estoqueservice.application.dto.ProdutoDTO;
import com.faustikle.estoqueservice.domain.model.produto.Dimensao;
import com.faustikle.estoqueservice.domain.model.produto.Produto;
import com.faustikle.estoqueservice.infrastructure.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private DomainEventService domainEventService;


    public ProdutoDTO criarProduto(ProdutoDTO produtoDTO) {
        Produto novoProduto = new Produto(produtoDTO.getQuantidade(),new Dimensao(produtoDTO.getAltura(),
                produtoDTO.getLargura(), produtoDTO.getPeso()));

        produtoRepository.save(novoProduto);
        domainEventService.enviarEventos(novoProduto.getEventos());

        produtoDTO.setId(novoProduto.getId());

        return produtoDTO;


    }

    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }
}
