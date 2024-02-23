package org.calculadora.operacoes;

public final class OperacoesBasicas {

    private OperacoesBasicas() {
        throw new AssertionError();
    }

    public static Double adicao(Double numeroUm, Double numeroDois) {
        return numeroUm + numeroDois;
    }

    public static Double subtracao(Double numeroUm, Double numeroDois) {
        return numeroUm - numeroDois;
    }

    public static Double multiplicacao(Double numeroUm, Double numeroDois) {
        return numeroUm * numeroDois;
    }

    public static Double divisao(Double numeroUm, Double numeroDois) {
        return numeroUm / numeroDois;
    }

}
