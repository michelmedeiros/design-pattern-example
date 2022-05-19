package com.br.example.designpattern.desconto;

import com.br.example.designpattern.imposto.CalculadoraImposto;
import com.br.example.designpattern.model.Orcamento;
import com.br.example.designpattern.model.TipoImposto;
import com.br.example.designpattern.strategy.CalculadoraCalculoICMS;
import com.br.example.designpattern.strategy.CalculadoraCalculoIPI;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalculadoraDescontoTest {

    @Test
    void testeCalcularDesconto() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        BigDecimal valor = BigDecimal.valueOf(100l);
        Orcamento orcamentoA = new Orcamento(valor, 5);
        BigDecimal impostoCalculadoA = calculadora.calcularDesconto(orcamentoA);

        BigDecimal valorB = BigDecimal.valueOf(1000l);
        Orcamento orcamentoB = new Orcamento(valorB, 1);
        BigDecimal impostoCalculadoB = calculadora.calcularDesconto(orcamentoB);

        Assertions.assertThat(impostoCalculadoA).isEqualTo(BigDecimal.valueOf(10.0));
        Assertions.assertThat(impostoCalculadoB).isEqualTo(BigDecimal.valueOf(100.0));
    }

    @Test
    void testeCalcularDescontoChainResponsability() {
        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        BigDecimal valor = BigDecimal.valueOf(100l);
        Orcamento orcamentoA = new Orcamento(valor, 5);
        BigDecimal impostoCalculadoA = calculadora.calcularDescontoChainResponsability(orcamentoA);

        BigDecimal valorB = BigDecimal.valueOf(1000l);
        Orcamento orcamentoB = new Orcamento(valorB, 1);
        BigDecimal impostoCalculadoB = calculadora.calcularDescontoChainResponsability(orcamentoB);

        Assertions.assertThat(impostoCalculadoA).isEqualTo(BigDecimal.valueOf(10.0));
        Assertions.assertThat(impostoCalculadoB).isEqualTo(BigDecimal.valueOf(100.0));
    }
}
