package com.br.example.designpattern.situacao;

import com.br.example.designpattern.exception.OrcamentoException;
import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{

    @Override
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.02));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Finalizado());
    }
}
