package com.br.example.designpattern.command;

import com.br.example.designpattern.model.Orcamento;
import com.br.example.designpattern.pedido.Pedido;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
public class GeraPedidoHandler {

    //adicionar dependencias - injection

    public void executa(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), orcamento, LocalDateTime.now());
    }
}
