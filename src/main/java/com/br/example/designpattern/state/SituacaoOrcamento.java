package com.br.example.designpattern.state;

import com.br.example.designpattern.exception.OrcamentoException;
import com.br.example.designpattern.model.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
    public void aprovar(Orcamento orcamento) {
        throw new OrcamentoException("Não é possível aprovar o orçamento");
    }
    public void reprovar(Orcamento orcamento) {
        throw new OrcamentoException("Não é possível reprovar o orçamento");
    }
    public void finalizar(Orcamento orcamento) {
        throw new OrcamentoException("Não é possível finalizar o orçamento");
    }
}
