package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoExcpetion;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidacaoPercentualReajuste implements  ValidacaoReajuste{
    public void validar(Funcionario funcionario, BigDecimal valorAumento) {
        BigDecimal salarioAtual = funcionario.getSalario();
        BigDecimal percentualReajuste = valorAumento.divide(salarioAtual, RoundingMode.HALF_UP);
        if(percentualReajuste.compareTo(new BigDecimal("0.4")) > 0){
            throw new ValidacaoExcpetion("Reajuste não pode ser superior a 40% do salario!");
        }
    }

}
