package com.br.example.designpattern.chainresponsability;

import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public abstract class DescontoChainResponsability {
    public BigDecimal calcular(Orcamento orcamento) {
        if(deveCalcular(orcamento)) {
            return efetuarCalculo(orcamento);
        }
        return proximoDesconto.efetuarCalculo(orcamento);
    }
    protected DescontoChainResponsability proximoDesconto;

    protected abstract boolean deveCalcular(Orcamento orcamento);
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);


    public DescontoChainResponsability(DescontoChainResponsability proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }
}
