import java.util.Scanner;
import java.util.Locale;
import Entidade.funcionario;

public class App {
    public static void main(String[] args) throws Exception {
    
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        funcionario func = new funcionario();

        // Declaração de variáveis

        float percentual;

        // Solicitando dados do usuário

        System.out.print("Insira o nome do funcionário: ");
        func.nome = sc.nextLine();

        System.out.print("Insira o salário do funcionário: ");
        func.salario = sc.nextFloat();

        System.out.print("Insira o imposto do salário do funcionário: ");
        func.imposto = sc.nextFloat();

        System.out.println(func.nome + ", " + func.salario);

        System.out.println("Qual o percentual de aumento: ");
        percentual = sc.nextFloat();
        func.aumentoSalario(percentual);

        System.out.println("Dados atualizados: " + func);

        sc.close();
    }
}
