package Entidade;

public class ContaComum {
    private String titular;
    private int numero;
    protected double saldo;

    public ContaComum(int numero, String titular, double depInicial) {
        this.numero = numero;
        this.titular = titular;
        deposito(depInicial);
    }

    public ContaComum(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
    
    public void deposito(double quantia) {
        saldo += quantia;
    }

    public void saque(double quantia) {
        saldo -= quantia + 5.0;
    }

    
    public void realizarEmprestimo(double quantia) {
        // Implementado para ContaEspecial
    }

    @Override
    public String toString() {
        return "Conta " + numero 
                + ", Titular: " 
                + titular 
                + ", Saldo: R$ " + String.format("%.2f", saldo);
    }
}
