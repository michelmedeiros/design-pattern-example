package com.br.example.designpattern.chainresponsability;

import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends DescontoChainResponsability {

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean deveCalcular(Orcamento orcamento) {
        return true;
    }
}
