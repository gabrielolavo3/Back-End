// Autores: Andrei Vieira e Gabriel Olavo

package com.mycompany.estoque;

import entidade.*;
import java.util.Scanner;

public class Estoque {

    public static void main(String[] args) {
        
        String nome;
        double preco;
        int quantidade, 
            atualizarQuant;
        char escolhaQuant;
        
        Produto produto;        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome do produto: ");
        nome = sc.nextLine();
        System.out.print("Digite o preço do produto: ");
        preco = sc.nextFloat();
        System.out.print("Digite a quantidade do produto: ");
        quantidade = sc.nextInt();
        
        produto = new Produto(nome, preco, quantidade);
        
        System.out.print("Deseja adicionar mais quantidade ao estoque(Y/N)? ");
        escolhaQuant = sc.next().charAt(0);
        
        if (escolhaQuant == 'Y' || escolhaQuant == 'y') {
            System.out.print("Informe o quanto deve adicionar: ");
            atualizarQuant = sc.nextInt();
            produto.addProdutos(atualizarQuant);
        }
                        
        System.out.println(produto);
        
        System.out.print("Deseja remover uma quantidade ao estoque(Y/N)? ");
        escolhaQuant = sc.next().charAt(0);
        
        if (escolhaQuant == 'Y' || escolhaQuant == 'y') {
            System.out.print("Informe o quanto deve remover: ");
            atualizarQuant = sc.nextInt();
            produto.removerProdutos(atualizarQuant);            
        }
        
        System.out.println(produto);
    }
}
