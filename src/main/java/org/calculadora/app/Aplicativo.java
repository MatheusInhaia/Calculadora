package org.calculadora.app;

import org.calculadora.operacoes.OperacoesBasicas;

import java.util.Scanner;

public class Aplicativo {
    Scanner scanner;

    public Aplicativo() {
        this.scanner = new Scanner(System.in);
    }

    public Double escolherNumeroUm(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();
        return numeroUm;
    }

    public Double escolherNumeroDois(Scanner scanner) {
        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();
        return numeroDois;
    }

    public Double calcula(double primeiroNumero, double segundoNumero, int opcao) {
        double resultado = 0;
        switch (opcao) {
            case 1:
                System.out.println("Parabéns, você fez uma adição!");
                resultado = OperacoesBasicas.adicao(primeiroNumero, segundoNumero);
                break;
            case 2:
                System.out.println("Parabéns, você fez uma subtração!");
                resultado = OperacoesBasicas.subtracao(primeiroNumero, segundoNumero);
                break;
            case 3:
                System.out.println("Parabéns, você fez uma divisão!");
                resultado = OperacoesBasicas.divisao(primeiroNumero, segundoNumero);
                break;
            case 4:
                System.out.println("Parabéns, você fez uma multiplicação!");
                resultado = OperacoesBasicas.multiplicacao(primeiroNumero, segundoNumero);
                break;
            default:
                System.out.println("Opção não existente, escolha novamente.");
        }
        return resultado;
    }

    public void exibirCalculadora() {
        double numeroUm = 0;
        double numeroDois = 0;
        int opcao;

        do {
            System.out.println("Escolha uma operação entre dois números:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Divisão");
            System.out.println("4. Multiplicação");
            System.out.println("0. Fechar Calculadora");
            opcao = scanner.nextInt();
            if (opcao < 5 && opcao != 0) {
                numeroUm = escolherNumeroUm(scanner);
                numeroDois = escolherNumeroDois(scanner);

                System.out.println(calcula(numeroUm, numeroDois, opcao));

            }

        } while (opcao != 0);
    }
}
