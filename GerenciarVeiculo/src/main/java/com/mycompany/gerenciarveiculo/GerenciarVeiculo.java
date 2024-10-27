// Dev: Gabriel S. Olavo
// Data de implementação: 25.10.24
// Descrição: Algoritmo de gerencimanto de N veículos. Criar a SuperClass Veiculo, com os atributos marca e modelo, e métodos para dirigir e exibir detalhes
// As Class Carro e Moto herdam de Veiculo. A Class Carro possui o número de portas e a Class Moto possui a cilindrada
// Deve obter a quantidade de veículos, imprimir os métodos dirigir() e exibirDetalhes()

package com.mycompany.gerenciarveiculo;

import entidade.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarVeiculo 
{
    public static void main(String[] args) 
    {
        int quantidadeDeVeiculo;
        String marca,
               modelo;
        
        Scanner scan = new Scanner(System.in);
        List<Veiculo> automovel = new ArrayList<>();
        
        System.out.print("Digite a quantidade de automóveis: ");
        quantidadeDeVeiculo = scan.nextInt();
        scan.nextLine(); // Limpar Buff da tecla Enter do teclado
        
        for (int a = 0; a < quantidadeDeVeiculo; a++)
        {
            System.out.print("\nInforme a marca/fabricante do automóvel: ");
            marca = scan.nextLine();
            System.out.print("Informe o modelo: ");
            modelo = scan.nextLine();
            System.out.print("Informe se o automóvel é um Carro ou Moto: ");
            String tipoAutomovel = scan.nextLine();            
            
            // equalsIgnoreCase ignora as letras maiúsculas e minúsculas, aceitando o que é digitando conforme está nos parenteses
            
            if (tipoAutomovel.equalsIgnoreCase("carro"))
            {
                System.out.print("\nDigite a quantidade de portas: ");
                byte numeroDePortas = scan.nextByte();
                scan.nextLine();
                automovel.add(new Carro(marca, modelo, numeroDePortas));
            }
            else if (tipoAutomovel.equalsIgnoreCase("moto"))
            {
                System.out.print("\nDigite a cilindrada da moto: ");
                short cilindrada = scan.nextShort();
                scan.nextLine();
                automovel.add(new Moto(marca, modelo, cilindrada));
            }
            else 
            {
                a--;
            }
        }
        
        // Impressão de ArrayList sem ForEach
        // .size() -> Retorna o tamanho do ArrayList
        // .get() -> Busca um elemento do ArrayList pelo index
        
        for (int x = 0; x < automovel.size(); x++)
        {
            System.out.println(automovel.get(x).exibirDetalhes());
            System.out.println(automovel.get(x).digirir());
        }
    }
}
