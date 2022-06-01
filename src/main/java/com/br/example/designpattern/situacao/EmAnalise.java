package com.br.example.designpattern.situacao;

import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.05));
    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Reprovado());
    }
}
