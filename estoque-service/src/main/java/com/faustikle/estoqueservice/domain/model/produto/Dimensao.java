package com.faustikle.estoqueservice.domain.model.produto;

import javax.persistence.Embeddable;

@Embeddable
public class Dimensao {

    private Double altura;

    private Double largura;

    private Double peso;

    public Dimensao() {
    }

    public Dimensao(Double altura, Double largura, Double peso) {
        this.altura = altura;
        this.largura = largura;
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getLargura() {
        return largura;
    }

    public Double getPeso() {
        return peso;
    }
}
