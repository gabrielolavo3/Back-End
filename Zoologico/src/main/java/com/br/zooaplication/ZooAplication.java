/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.br.zooaplication;

import entidades.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ZooAplication {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Animal> animais = new ArrayList<>();
        
        while (true){
            System.out.println("\nCadastre um novo animal!");
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();

            System.out.print("Digite o tipo do animal: ");
            String tipo = sc.nextLine();

            System.out.print("Digite qual é o habitat do animal: ");
            String habitat = sc.nextLine();

            System.out.println("Animais Disponíveis para Cadastro");
            System.out.println("1 - Leão");
            System.out.println("2 - Elefante");
            System.out.println("3 - Papagaio");
            System.out.println("4 - Sair e exibir dados");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();            
        
            switch (opcao){
                case 1 -> animais.add (new Leao(nome, tipo, habitat));               
                case 2 -> animais.add (new Elefante(nome, tipo, habitat));                
                case 3 -> animais.add (new Papagaio(nome, tipo, habitat));                
                default -> {
                    System.out.println("Opção inválida! Selecione uma opção do menu");
                }                
           }
            
           if (opcao == 4){
               break;
           }
           
           System.out.print("Deseja cadastrar outro animal (Sim/ Não): ");
           String cadastro = sc.nextLine();
           
           if (cadastro.equalsIgnoreCase("Sim")){
               continue;
           
           } else if (cadastro.equalsIgnoreCase("Não")){
               break;
           }            
        } 
        
        System.out.println("Lista de Animais Cadastrados");
        for (Animal anim : animais){
            System.out.println(anim.exibirDados());
            System.out.println(anim.emitirSom());
        }
    }
}
