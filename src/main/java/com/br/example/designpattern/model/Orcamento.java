package com.br.example.designpattern.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Orcamento {
    private BigDecimal valor;
}
