package Entidade;

public class ContaEspecial extends ContaComum {
    private double limiteEmprestimo;

    public ContaEspecial(int numero, String titular, double depInicial, double limiteEmprestimo) {
        super(numero, titular, depInicial);
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    @Override
    public void realizarEmprestimo(double quantia) {
        if (quantia <= limiteEmprestimo) {
            saldo += quantia;
            saldo -= 10;
        } else {
            System.out.println("Empréstimo excede o limite disponível.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Limite de Empréstimo: R$ " + String.format("%.2f", limiteEmprestimo);
    }
}
