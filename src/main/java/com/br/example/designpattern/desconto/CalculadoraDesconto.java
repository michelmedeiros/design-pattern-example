package com.br.example.designpattern.desconto;

import com.br.example.designpattern.chainresponsability.CalcularDescontoPorValorCompra;
import com.br.example.designpattern.chainresponsability.CalcularDescontoQuantidadeItems;
import com.br.example.designpattern.chainresponsability.DescontoChainResponsability;
import com.br.example.designpattern.chainresponsability.SemDesconto;
import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcularDesconto(Orcamento orcamento) {
        if(orcamento.getQuantidadeItems() >=5 ||
                orcamento.getValor().compareTo(BigDecimal.valueOf(500.0)) > 0) {
            return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
        }
        return BigDecimal.ZERO;
    }

    public BigDecimal calcularDescontoChainResponsability(Orcamento orcamento) {
        DescontoChainResponsability desconto = new CalcularDescontoQuantidadeItems(
                new CalcularDescontoPorValorCompra(new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
