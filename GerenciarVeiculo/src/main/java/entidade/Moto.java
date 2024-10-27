// Dev: Gabriel S. Olavo

package entidade;

public class Moto extends Veiculo
{
    private short cilindrada;
    
    public Moto(String marca, String modelo, short cilindrada)
    {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }
    
    public short getCilindrada()
    {
        return cilindrada;
    }
    
    @Override
    public String digirir()
    {
        return String.format("Digirindo uma moto %s %s com %d cilindradas", marca, modelo, cilindrada);
    }
    
    @Override
    public String exibirDetalhes()
    {        
        return String.format("\nMarca: %s\nModelo: %s", marca, modelo);
    }
}
