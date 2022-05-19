package com.br.example.designpattern.chainresponsability;

import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public abstract class DescontoChainResponsability {
    public abstract BigDecimal calcular(Orcamento orcamento);
    protected DescontoChainResponsability proximoDesconto;

    public DescontoChainResponsability(DescontoChainResponsability proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }
}
