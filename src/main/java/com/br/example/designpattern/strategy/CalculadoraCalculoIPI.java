package com.br.example.designpattern.strategy;

import com.br.example.designpattern.model.Orcamento;
import com.br.example.designpattern.model.TipoImposto;

import java.math.BigDecimal;

public class CalculadoraCalculoIPI implements CalculadoraStrategy {
    @Override
    public BigDecimal calcularImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
    }
}
