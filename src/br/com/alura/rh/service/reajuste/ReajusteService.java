package br.com.alura.rh.service;

import br.com.alura.rh.ValidacaoExcpetion;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;
    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal valorAumento){
        this.validacoes.forEach(v -> v.validar(funcionario, valorAumento));

        BigDecimal salarioReajustado = funcionario.getSalario().add(valorAumento);
        funcionario.atualizarSalario(salarioReajustado);
    }

}
