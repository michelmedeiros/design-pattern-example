package com.br.example.designpattern.imposto;

import com.br.example.designpattern.model.Orcamento;
import com.br.example.designpattern.model.TipoImposto;
import com.br.example.designpattern.strategy.CalculadoraCalculoICMS;
import com.br.example.designpattern.strategy.CalculadoraCalculoIPI;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculadoraImpostoTest {

    @Test
    void testeCalcularIPI() {
        CalculadoraImposto calculadora = new CalculadoraImposto();
        BigDecimal valor = BigDecimal.valueOf(100l);
        Orcamento orcamento = new Orcamento(valor);
        BigDecimal impostoCalculado = calculadora.calcularImposto(orcamento, TipoImposto.IPI);
        Assertions.assertThat(impostoCalculado).isEqualTo(BigDecimal.valueOf(10.0));
    }

    @Test
    void testeCalcularStrategyICMS() {
        CalculadoraImposto calculadora = new CalculadoraImposto();
        BigDecimal valor = BigDecimal.valueOf(100l);
        Orcamento orcamento = new Orcamento(valor);
        BigDecimal impostoCalculado = calculadora.calcularImpostoStrategy(orcamento, new CalculadoraCalculoICMS());
        Assertions.assertThat(impostoCalculado).isEqualTo(BigDecimal.valueOf(20.0));
    }

    @Test
    void testeCalcularStrategyIPI() {
        CalculadoraImposto calculadora = new CalculadoraImposto();
        BigDecimal valor = BigDecimal.valueOf(100l);
        Orcamento orcamento = new Orcamento(valor);
        BigDecimal impostoCalculado = calculadora.calcularImpostoStrategy(orcamento, new CalculadoraCalculoIPI());
        Assertions.assertThat(impostoCalculado).isEqualTo(BigDecimal.valueOf(10.0));
    }

    @Test
    void testeCalcularICMS() {
        CalculadoraImposto calculadora = new CalculadoraImposto();
        BigDecimal valor = BigDecimal.valueOf(100l);
        Orcamento orcamento = new Orcamento(valor);
        BigDecimal impostoCalculado = calculadora.calcularImposto(orcamento, TipoImposto.ICMS);
        Assertions.assertThat(impostoCalculado).isEqualTo(BigDecimal.valueOf(20.0));
    }
}
