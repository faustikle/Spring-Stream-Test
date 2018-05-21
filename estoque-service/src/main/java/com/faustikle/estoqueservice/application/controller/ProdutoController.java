package com.faustikle.estoqueservice.application.controller;

import com.faustikle.estoqueservice.application.dto.ProdutoDTO;
import com.faustikle.estoqueservice.application.service.ProdutoService;
import com.faustikle.estoqueservice.domain.model.produto.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<ProdutoDTO> criar(@RequestBody ProdutoDTO produtoRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.criarProduto(produtoRequest));
    }

    @GetMapping()
    public ResponseEntity<List<Produto>> todos() {
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.buscarTodos());
    }
}
