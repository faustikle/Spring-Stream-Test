package com.faustikle.ordemservice.domain.model.produto;

import com.faustikle.ordemservice.domain.shared.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@javax.persistence.Entity
public class Produto extends Entity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int quantidade;

    public Produto() {
    }



    public Produto(Long id, int quantidade) {
        this.id = id;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
