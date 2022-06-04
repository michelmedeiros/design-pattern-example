package com.br.example.designpattern.command;

import com.br.example.designpattern.model.Orcamento;
import com.br.example.designpattern.observer.AcaoPedido;
import com.br.example.designpattern.observer.EnviarEmailPedido;
import com.br.example.designpattern.observer.SalvarPedido;
import com.br.example.designpattern.pedido.Pedido;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
public class GeraPedidoHandler {

    //adicionar dependencias - injection

    private List<AcaoPedido> acoes;

    public void executa(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), orcamento, LocalDateTime.now());
        acoes.forEach(acaoPedido -> acaoPedido.executarAcao(pedido));
    }
}
