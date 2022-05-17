package com.br.example.designpattern.strategy;

import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public interface CalculadoraStrategy {
    BigDecimal calcularImposto(Orcamento orcamento);
}
