package entidade;

public abstract class Veiculo 
{
    protected String marca;
    protected String modelo;
    
    public Veiculo(String marca, String modelo) 
    {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMarca()
    {
        return marca;
    }
    
    public String getModelo()
    {
        return modelo;
    }
    
    public abstract void digirir();
    public abstract String exibirDetalhes();
}
