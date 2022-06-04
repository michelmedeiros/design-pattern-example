package com.br.example.designpattern.model;

import com.br.example.designpattern.state.SituacaoOrcamento;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Orcamento {
    public BigDecimal valor;
    public int quantidadeItems;
    private SituacaoOrcamento situacaoOrcamento;

    public Orcamento(BigDecimal valorOrcamento, int quantidadeItens) {
        this.valor = valorOrcamento;
        this.quantidadeItems = quantidadeItens;
    }

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
