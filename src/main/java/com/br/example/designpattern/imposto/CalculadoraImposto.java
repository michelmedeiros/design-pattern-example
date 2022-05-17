package com.br.example.designpattern.imposto;

import com.br.example.designpattern.model.Orcamento;
import com.br.example.designpattern.model.TipoImposto;
import com.br.example.designpattern.strategy.CalculadoraStrategy;

import java.math.BigDecimal;

public class CalculadoraImposto {

    public BigDecimal calcularImposto(Orcamento orcamento, TipoImposto tipoImposto) {
        return switch (tipoImposto) {
            case IPI -> orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
            case ICMS -> orcamento.getValor().multiply(BigDecimal.valueOf(0.2));
        };
    }

    public BigDecimal calcularImpostoStrategy(Orcamento orcamento, CalculadoraStrategy imposto) {
        return imposto.calcularImposto(orcamento);
    }
}
