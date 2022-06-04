package com.br.example.designpattern.observer;

import com.br.example.designpattern.pedido.Pedido;

public class EnviarEmailPedido implements AcaoPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviar pedido para email");
    }
}
