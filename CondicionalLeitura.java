package br.com.condicionalleitura.model;

import java.util.Scanner;

public class CondicionalLeitura {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero,
            valorA,
            valorB;
        float hotDog = 4.00F,
              xSalada = 4.50F,
              xBacon = 5.00F,
              torrada = 2.00F,
              refrigerante = 1.50F;
        
      /*  System.out.print("Digite um número: ");
        numero = sc.nextInt();
        
        if (numero > 0) {
            System.out.println("Número positivo");          
        
        } else {
            System.out.println("Número negativo");
        } */
        
        // Exemplo 02 - Par ou ímpar
        
        /* System.out.print("Digite um número: ");
        numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("Valor par");
        
        } else {
            System.out.println("Valor ímpar");
        } */
        
        // Exemplo 03 - Múltiplos
        
        /*System.out.print("Digite o primeiro valor: ");
        valorA = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        valorB = sc.nextInt();
        
        if (valorA % valorB == 0) {
            System.out.println("Ambos são múltiplos");
        
        } else {
            System.out.println("Não são múltiplos");
        }*/
        
        // Exemplo 04 - 
        
        System.out.println("CODIGO \t ESPECIFICACAO \t PRECO");      
        System.out.print("1 \t Cachorro Quente "+ hotDog);  
        
    }
}
