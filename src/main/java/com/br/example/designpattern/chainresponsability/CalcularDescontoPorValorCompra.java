package com.br.example.designpattern.chainresponsability;

import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontoPorValorCompra extends DescontoChainResponsability {

    public CalcularDescontoPorValorCompra(DescontoChainResponsability desconto) {
        super(desconto);
    }
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getValor().compareTo(BigDecimal.valueOf(500.0)) > 0) {
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
        }
        return proximoDesconto.calcular(orcamento);
    }
}
