package com.br.example.designpattern.observer;

import com.br.example.designpattern.pedido.Pedido;

public class SalvarPedido implements AcaoPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvar pedido no DB");
    }
}
