package Entidade;

public class funcionario {
    public String nome;
    public float salario;
    public float imposto;

    public float salarioLiquido () {
        return salario - imposto;
    };
    
    public float aumentoSalario (float percentual) {
        return salario += salario * (percentual/100);
    };

    public String toString() {
        return nome + ", R$" + String.format("%.2f", salarioLiquido());
    };
}