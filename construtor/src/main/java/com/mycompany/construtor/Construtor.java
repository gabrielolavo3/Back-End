package com.mycompany.construtor;

import Entidade.ContaComum;
import java.util.Locale;
import java.util.Scanner;

public class Construtor 
{

    public static void main(String[] args) 
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaComum contas;
        
        // Solicitando dados       
  
        System.out.print("Informe o titular da conta: ");
        String titular = sc.nextLine();

        System.out.print("Informe o número da conta: ");
        int numero = sc.nextInt();


        System.out.print("Informe se há depósito inicial (y/s): ");
        char resposta = sc.next().charAt(0);

        if (resposta == 'y') {
            System.out.print("Informe o valor do depósito: ");
            double depInicial = sc.nextDouble();
            contas = new ContaComum(numero, titular);

        } else {
            contas = new ContaComum(numero, titular);
        }     
        
        System.out.print("Sua conta é Conta Comum ou Especial (1/2): ");
        int tipoConta = sc.nextInt();
        
        if () {
        
        }
        
        System.out.print(contas);
        System.out.print("Informe o valor do desposito: ");
        double depositoValor = sc.nextDouble();
        
        contas.deposito(depositoValor);
        System.out.print(contas);
        
        System.out.print("Informe o valor de saque: ");
        double saqueValor = sc.nextDouble();
        
        contas.saque(saqueValor);
        System.out.print(contas);
        
    }
}
