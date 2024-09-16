package aluno_nota;

import entidade.Student;
import java.util.Scanner;

public class Aluno_nota {

    public static void main(String[] args) {        
        
        // Declaração de Objetos
        
        Scanner scan = new Scanner(System.in);
        Student aluno = new Student();     
        
        // Leitura de dados
        
        System.out.print("Digite o nome do estudante: ");
        aluno.nome = scan.nextLine();  
        
        System.out.print("Insira a primeira nota: ");
        aluno.primeiroTrimestre = scan.nextFloat();
        
        System.out.print("Insira a segunda nota: ");
        aluno.segundoTrimestre = scan.nextFloat();
        
        System.out.print("Insira a terceira nota: ");
        aluno.terceiroTrimestre = scan.nextFloat();
        
        scan.close();
        aluno.consoleFinal();
    }
}
