package br.com.alura.rh.service;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {
    default void validar(Funcionario funcionario, BigDecimal valorAumento) {

    }

}
