package com.br.example.designpattern.command;

import com.br.example.designpattern.model.Orcamento;
import com.br.example.designpattern.pedido.Pedido;
import com.br.example.designpattern.state.Aprovado;
import com.br.example.designpattern.state.SituacaoOrcamento;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

}
