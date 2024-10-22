// By: Gabriel S. Olavo | Software Developer

package com.br.pagamentofuncionario;

import entidade.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PagamentoFuncionario {

    public static void main(String[] args) 
    {
        String nome;        
        float valorHora;
        int horaTrabalhada,
            quantFuncionario;
        
        Scanner scan = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();                
        
        System.out.print("Insira a quantidade de funcionários para realizar os cálculos: ");
        quantFuncionario = scan.nextInt();
        scan.nextLine();
        
        for (int a = 0; a < quantFuncionario; a++)
        {
            System.out.printf("\nInforme o nome do %dº funcionário: ", a+1);
            nome = scan.nextLine();
            System.out.print("Informe a quantidade de horas trabalhadas: ");
            horaTrabalhada = scan.nextInt();
            System.out.print("Informe o valor recebido por de horas trabalhadas: ");
            valorHora = scan.nextFloat();
            System.out.print("Informe se o funcionário é terceirizado ou não (Y/N): ");
            char tipoFuncionario = scan.next().charAt(0);
            
            // Validando o tipo de funcionário e passando as informações do ArrayList
            
            if (tipoFuncionario == 'Y' || tipoFuncionario == 'y')
            {
                System.out.print("\nInforme o valor da despesa adicional: ");
                float despesaAdicional = scan.nextFloat();
                scan.nextLine();
                
                funcionarios.add(new FuncionarioTerceirizado(nome, horaTrabalhada, valorHora, despesaAdicional));
            } 
            else
            {
                funcionarios.add(new FuncionarioComum(nome, horaTrabalhada, valorHora));
                scan.nextLine();
            }                       
        }
        
        // Laço ForEach para exibir o ArrayList
        
        System.out.println("\nTabela de Pagementos de Funcionários");
        for (Funcionario func : funcionarios)
        {
            System.out.println(func.toString());
        }
    }
}
