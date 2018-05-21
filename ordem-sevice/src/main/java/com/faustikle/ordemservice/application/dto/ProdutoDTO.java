package com.faustikle.ordemservice.application.dto;

public class ProdutoDTO {

    private Long id;

    private int quantidade;

    private Double altura;

    private Double largura;

    private Double peso;

    public ProdutoDTO() {
    }

    public ProdutoDTO(Long id, int quantidade, Double altura, Double largura, Double peso) {
        this.id = id;
        this.quantidade = quantidade;
        this.altura = altura;
        this.largura = largura;
        this.peso = peso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
