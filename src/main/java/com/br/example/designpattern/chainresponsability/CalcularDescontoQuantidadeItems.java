package com.br.example.designpattern.chainresponsability;

import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontoQuantidadeItems extends DescontoChainResponsability {

    public CalcularDescontoQuantidadeItems(DescontoChainResponsability desconto) {
        super(desconto);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if(orcamento.getQuantidadeItems() >=5) {
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
        }
        return proximoDesconto.calcular(orcamento);
    }
}
