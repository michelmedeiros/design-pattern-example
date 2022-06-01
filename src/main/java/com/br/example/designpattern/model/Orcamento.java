package com.br.example.designpattern.model;

import com.br.example.designpattern.situacao.SituacaoOrcamento;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItems;
    private SituacaoOrcamento situacaoOrcamento;

    public void aplicarDescontoExtra() {
        BigDecimal desconto = this.situacaoOrcamento.calcularDescontoExtra(this);
        this.valor = this.valor.subtract(desconto);
    }

    public void aprovar() {
        this.situacaoOrcamento.aprovar(this);
    }
    public void reprovar() {
        this.situacaoOrcamento.reprovar(this);
    }
    public void finalizar() {
        this.situacaoOrcamento.finalizar(this);
    }
}
