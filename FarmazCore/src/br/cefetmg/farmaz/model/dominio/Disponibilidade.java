/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.farmaz.model.dominio;

/**
 *
 * @author Gabriel
 */
public class Disponibilidade {
    
    Long produtoSeq;
    Long farmaciaCadastro;
    String estoque;
    Long preco;
    String avaliacao;

    public Disponibilidade() {
    }

    public Disponibilidade(Long produtoSeq, Long farmaciaCadastro, String estoque, Long preco, String avaliacao) {
        this.produtoSeq = produtoSeq;
        this.farmaciaCadastro = farmaciaCadastro;
        this.estoque = estoque;
        this.preco = preco;
        this.avaliacao = avaliacao;
    }
    
    public Long getProdutoSeq() {
        return produtoSeq;
    }

    public void setProdutoSeq(Long produtoSeq) {
        this.produtoSeq = produtoSeq;
    }

    public Long getFarmaciaCadastro() {
        return farmaciaCadastro;
    }

    public void setFarmaciaCadastro(Long farmaciaCadastro) {
        this.farmaciaCadastro = farmaciaCadastro;
    }

    public String getEstoque() {
        return estoque;
    }

    public void setEstoque(String estoque) {
        this.estoque = estoque;
    }

    public Long getPreco() {
        return preco;
    }

    public void setPreco(Long preco) {
        this.preco = preco;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    
}
