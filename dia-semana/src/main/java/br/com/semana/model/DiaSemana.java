// Autor: Gabriel S. Olavo

package br.com.semana.model;

import java.util.Scanner;

public class DiaSemana {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        byte dia;
        
        System.out.print("Insira um numero (1-7) para um dia da semana: ");
        dia = scan.nextByte();
        
        switch (dia) {
            case 1 -> System.out.println("Dia da semana: Domigo");
            case 2 -> System.out.println("Dia da semana: Segunda-feira");
            case 3 -> System.out.println("Dia da semana: Terça-feira");
            case 4 -> System.out.println("Dia da semana: Quarta-feira");
            case 5 -> System.out.println("Dia da semana: Quinta-feira");
            case 6 -> System.out.println("Dia da semana: Sexta-feira");
            case 7 -> System.out.println("Dia da semana: Sábado");
            default -> System.out.println("Valor inválido!");
        }
    }
}