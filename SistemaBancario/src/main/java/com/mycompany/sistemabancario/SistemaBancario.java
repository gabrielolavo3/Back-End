// Autores: Camile Oliveira e Gabriel Olavo

package com.mycompany.sistemabancario;

import entidade.*;
import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {
        
        // Declaração de variáveis
        
        String chave;
        int operacao, 
                loop = 0;
        float valorInicial,
              quantia;
        
        // Declaração de Objetos
        
        Scanner scan = new Scanner(System.in);
        BancoLegado bancoLegado;       
        
        System.out.print("Informe o saldo da conta: ");
        valorInicial = scan.nextFloat();
        bancoLegado = new BancoLegado(valorInicial);
        
         // Criando Objeto Adaptado
        Banco adapter = new AdapterBancoLegado(bancoLegado);
                
        while (true) 
        {
            System.out.println("\nModalidades disponíveis!\n");
            System.out.println("01 - Deposito");
            System.out.println("02 - Saque");
            System.out.println("03 - Transação via Pix");
            System.out.println("04 - Sair");
            System.out.print("Escolha uma ação: ");
            operacao = scan.nextInt();
            
            switch (operacao) 
            {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    quantia = scan.nextFloat();
                    bancoLegado.deposito(quantia);
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: ");
                    quantia = scan.nextFloat();
                    bancoLegado.saque(quantia);
                    break;

                case 3:
                    System.out.print("Digite o valor da transação Pix: ");
                    quantia = scan.nextFloat();
                    scan.nextLine(); 
                    System.out.print("Digite a Chave Pix do destinatario: ");
                    chave = scan.nextLine();
                    adapter.pix(quantia, chave);
                    break;
                
  
                 default:
                    if (operacao < 4 || operacao > 4) 
                    {
                        System.out.println("\nOperação não válida!");
                        break;
                    }     
            } 
            
            if (operacao == 4) 
            {
                System.out.println("\nOperação encerrada!");
                break;
            }
        }
        
        System.out.println("\nSaldo: R$ " + String.format("%.2f", bancoLegado.saldoAtual()));
        scan.close();
    }
}
