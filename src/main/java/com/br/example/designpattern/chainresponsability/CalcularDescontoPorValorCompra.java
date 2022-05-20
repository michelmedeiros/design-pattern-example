package com.br.example.designpattern.chainresponsability;

import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontoPorValorCompra extends DescontoChainResponsability {

    public CalcularDescontoPorValorCompra(DescontoChainResponsability desconto) {
        super(desconto);
    }
    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
    }

    @Override
    protected boolean deveCalcular(Orcamento orcamento) {
        return orcamento.getValor().compareTo(BigDecimal.valueOf(500.0)) > 0;
    }
}
