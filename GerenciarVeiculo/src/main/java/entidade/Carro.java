// Dev: Gabriel S. Olavo

package entidade;

public class Carro extends Veiculo
{
    private byte numeroDePortas;
    
    public Carro(String marca, String modelo, byte numeroDePortas)
    {
        super(marca, modelo);
        this.numeroDePortas = numeroDePortas;
    }
    
    public byte getNumeroDePortas()
    {
        return numeroDePortas;
    }
    
    @Override
    public String digirir()
    {
        return String.format("Digirindo um carro %s %s com %d portas", marca, modelo, numeroDePortas);
    }
    
    @Override
    public String exibirDetalhes()
    {        
        return String.format("\nMarca: %s\nModelo: %s", marca, modelo);
    }
}
