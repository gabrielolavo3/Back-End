// Autores: Camile Oliveira e Gabriel Olavo

package entidade;

public class AdapterBancoLegado implements Banco
{
    // Adapter - Estabelecendo acesso ao Banco Legado
    
    private BancoLegado bancoLegado;
    
    public AdapterBancoLegado(BancoLegado bancoLegado)
    {
        this.bancoLegado = bancoLegado;
    }
    
    // Sobreescrita de metodos da Interface Banco
    
    @Override
    public void depositar(float quantia) 
    {
        // Chamada de metodo da Class Banco Legado
        bancoLegado.deposito(quantia);
    }

    @Override
    public void sacar(float quantia) 
    {
        bancoLegado.saque(quantia);
    }

    @Override
    public void pix(float quantia, String chavePix) 
    {
        bancoLegado.saque(quantia);        
        System.out.println("\nTransferência realizada para " + chavePix + "!");
    }       
}
