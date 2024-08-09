package br.com.condicionalleitura.condicional.model;

import java.util.Scanner;

public class CondicionalLeitura {

    public static void main(String[] args) {
        
        // Variaveis e leitor
        
        Scanner sc = new Scanner(System.in);
        
        int numero,
            valorA,
            valorB,
            quantidade;
        float hotDog = 4.00F,
              xSalada = 4.50F,
              xBacon = 5.00F,
              torrada = 2.00F,
              refrigerante = 1.50F,
              salario,
              imposto = 0;
        char codigo;
        
        // Exemplo 01 - Negativo ou positivo
        
        System.out.print("Digite um número: ");
        numero = sc.nextInt();
        
        if (numero > 0) {
            System.out.println("Número positivo");          
        
        } else {
            System.out.println("Número negativo");
        }
        
        // Exemplo 02 - Par ou ímpar
        
        System.out.print("Digite um número: ");
        numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("Valor par");
        
        } else {
            System.out.println("Valor ímpar");
        }
        
        // Exemplo 03 - Múltiplos
        
        System.out.print("Digite o primeiro valor: ");
        valorA = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        valorB = sc.nextInt();
        
        if (valorA % valorB == 0) {
            System.out.println("Ambos são múltiplos");
        
        } else {
            System.out.println("Não são múltiplos");
        }
        
        // Exemplo 04 - Itens
        
        System.out.println("CODIGO \t ESPECIFICACAO \t PRECO");      
        System.out.printf("1 \t Cachorro Quente R$ %.2f\n", hotDog);      
        System.out.printf("2 \t X-Salada \t R$ %.2f\n", xSalada);      
        System.out.printf("3 \t X-Bacon \t R$ %.2f\n", xBacon);      
        System.out.printf("4 \t Torrada Simples R$ %.2f\n", torrada);      
        System.out.printf("5 \t Refrigerante \t R$ %.2f\n\n", refrigerante); 
        
        System.out.print("Digite o codigo do item: ");
        codigo = sc.next().charAt(0);
        System.out.print("Digite a quantidade: ");
        quantidade = sc.nextInt();
        
        switch (codigo) { // Switch Expression Java
            case '1' -> System.out.printf("Total: R$ %.2f", quantidade * hotDog);
            case '2' -> System.out.printf("Total: R$ %.2f", quantidade * xSalada);
            case '3' -> System.out.printf("Total: R$ %.2f", quantidade * xBacon);
            case '4' -> System.out.printf("Total: R$ %.2f", quantidade * torrada);
            case '5' -> System.out.printf("Total: R$ %.2f", quantidade * refrigerante);
            default -> System.out.println("Item não listado"); 
        }
        
        // Exemplo 05 - Imposto
        
        System.out.print("Digite o seu salario: ");
        salario = sc.nextFloat();
        
        if (salario >= 0 && salario <= 2000.00) {
            System.out.println("Isento do imposto");
            
        } else if (salario > 2000.00 && salario <= 3000.00) {
            imposto = (float) (1000.00 * 0.08) + (float) (2 * 0.18);            
            System.out.println("R$ " + imposto);
        
        } else if (salario > 3000.00 && salario <= 4500.00) {
            imposto = (float) (1000.00 * 0.18) + (float) (2 * 0.28);
            System.out.println("R$ " + imposto);
            
        } else {
            imposto = (float) (1000.00 * 0.28) + (float) (2 * 0.38);
            System.out.println("R$ " + imposto);
        }            
    }
}