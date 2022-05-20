package com.br.example.designpattern.chainresponsability;

import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontoQuantidadeItems extends DescontoChainResponsability {

    public CalcularDescontoQuantidadeItems(DescontoChainResponsability desconto) {
        super(desconto);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
    }

    @Override
    protected boolean deveCalcular(Orcamento orcamento) {
        return orcamento.getQuantidadeItems() >=5;
    }
}
