package br.com.construtorconta;

import Entidade.ContaComum;
import Entidade.ContaEspecial;
import java.util.Locale;
import java.util.Scanner;

public class ConstrutorConta {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o titular da conta: ");
        String titular = sc.nextLine();

        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("A conta é especial? (y/n): ");
        char tipoConta = sc.next().charAt(0);
        ContaComum conta;

        if (tipoConta == 'y') {
            System.out.print("Informe o limite de empréstimo: ");
            double limiteEmprestimo = sc.nextDouble();

            System.out.print("Informe se há depósito inicial (y/n): ");
            char resposta = sc.next().charAt(0);

            if (resposta == 'y') {
                System.out.print("Informe o valor do depósito inicial: ");
                double depInicial = sc.nextDouble();
                conta = new ContaEspecial(numero, titular, depInicial, limiteEmprestimo);
            } else {
                conta = new ContaEspecial(numero, titular, 0, limiteEmprestimo);
            }
        } else {
            System.out.print("Informe se há depósito inicial (y/n): ");
            char resposta = sc.next().charAt(0);

            if (resposta == 'y') {
                System.out.print("Informe o valor do depósito inicial: ");
                double depInicial = sc.nextDouble();
                conta = new ContaComum(numero, titular, depInicial);
            } else {
                conta = new ContaComum(numero, titular);
            }
        }

        System.out.println(conta);

        System.out.print("Informe o valor do depósito: ");
        double depositoValor = sc.nextDouble();
        conta.deposito(depositoValor);
        System.out.println(conta);

        System.out.print("Informe o valor do saque: ");
        double saqueValor = sc.nextDouble();
        conta.saque(saqueValor);
        System.out.println(conta);
        
        if (tipoConta == 'y') {
            System.out.print("Informe o valor do empréstimo, se aplicável: ");
            double emprestimoValor = sc.nextDouble();
            conta.realizarEmprestimo(emprestimoValor);
            System.out.println(conta);
        }

        sc.close();
    }
}
