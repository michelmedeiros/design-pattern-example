package com.br.example.designpattern.strategy;

import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public class CalculadoraCalculoICMS implements CalculadoraStrategy {
    @Override
    public BigDecimal calcularImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.2));
    }
}
