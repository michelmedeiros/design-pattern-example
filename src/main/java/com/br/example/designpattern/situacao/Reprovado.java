package com.br.example.designpattern.situacao;

import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacaoOrcamento(new Finalizado());
    }
}
