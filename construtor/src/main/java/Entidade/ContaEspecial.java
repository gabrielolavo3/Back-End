package Entidade;

public class ContaEspecial extends ContaComum
{
    private double limiteEmprestimo;
    private double limite;

    public ContaEspecial(int numero, String titular, double saldo) 
    {
        super(numero, titular, saldo);
    }
    
    public double setLimite()
    {
        return limite;
    }
    
    public void limiteEmp(double quantia)
    {
        limite -= quantia + 10.0;
    }    
}
