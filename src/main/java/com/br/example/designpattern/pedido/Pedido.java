package com.br.example.designpattern.pedido;

import com.br.example.designpattern.model.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {
    private String cliente;
    private Orcamento orcamento;
    private LocalDateTime dataPedido;
}
