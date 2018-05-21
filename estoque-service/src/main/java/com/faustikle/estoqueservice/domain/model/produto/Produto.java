package com.faustikle.estoqueservice.domain.model.produto;

import com.faustikle.estoqueservice.domain.shared.Entity;

import javax.persistence.*;

@javax.persistence.Entity
public class Produto extends Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int quantidade;

    @Embedded
    private Dimensao dimensao;

    public Produto() {
    }

    public Produto(int quantidade, Dimensao dimensao) {
        super();

        this.quantidade = quantidade;
        this.dimensao = dimensao;

        adicionarEvento(new ProdutoCriadoEvent(this));
    }

    public Long getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Dimensao getDimensao() {
        return dimensao;
    }
}
