// Autores: Camile Oliveira e Gabriel Olavo

package entidade;

public class BancoLegado 
{
    // Class que simula banco legado
    
    private float saldo;
    
    public BancoLegado(float saldo)
    {
        this.saldo = saldo;
    }            
    
    public void saque(float quantia)
    {
        saldo -= quantia;
        System.out.printf("\nValor sacado: R$ %.2f\n", quantia);
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
    
    public void deposito(float quantia)
    {
        if(quantia > 0) 
        {
            saldo += quantia;
            System.out.printf("\nValor depositado: R$ %.2f\n", quantia);
            System.out.printf("Saldo: R$ %.2f\n", saldo);
        }    
    }    
    
    public float saldoAtual()
    {
        return saldo;
    }            
}
