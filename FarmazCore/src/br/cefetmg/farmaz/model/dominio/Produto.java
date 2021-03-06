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
public class Produto {
    Long id;
    String nome;
    boolean isReceita;
    String descricao;
    String laboratorio;
    Long cadastroAnvisa;

    public Produto() {
    }

    public Produto(Long id, String nome, boolean isReceita, String descricao, String laboratorio, Long cadastroAnvisa) {
        this.id = id;
        this.nome = nome;
        this.isReceita = isReceita;
        this.descricao = descricao;
        this.laboratorio = laboratorio;
        this.cadastroAnvisa = cadastroAnvisa;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long produtoId) {
        this.id = produtoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isReceita() {
        return isReceita;
    }

    public void setReceita(boolean receita) {
        this.isReceita = receita;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public Long getCadastroAnvisa() {
        return cadastroAnvisa;
    }

    public void setCadastroAnvisa(Long cadastroAnvisa) {
        this.cadastroAnvisa = cadastroAnvisa;
    }
    
}
