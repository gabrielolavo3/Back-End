package Entidade;

public class ContaComum 
{
    private String titular;
    private int numero;
    private double saldo;
    
    // Definição de Cons
    
    public int getNumero()
    {
        return numero;
    }
    
    public String getTitular() 
    {
        return titular;
    }
    
    public void setTitular(String titular)
    {
        this.titular = titular;
    }
    
    public double getSaldo ()
    {
        return saldo;
    }
    
    public ContaComum (int numero, String titular, double depIniciaL) 
    {
        this.numero = numero;
        this.titular = titular;

        deposito (depIniciaL);
    }

    public ContaComum(int numero, String titular) 
    {
        this.numero = numero;
        this.titular = titular;
    }
    
    public void deposito(double quantia)
    {
        saldo += quantia;
    }
    
    public void saque(double quantia)
    {
        saldo -= quantia + 5.0;
    }    
    
    public String toString()
    {
        return "Conta "  + numero
               + ", Titular " + titular
               + "Saldo: R$ "
               + String.format("%.2f", saldo);
    }
      
}