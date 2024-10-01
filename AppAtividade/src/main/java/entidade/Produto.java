package entidade;

public abstract class Produto 
{
    protected String nome;
    protected float preco;
    
    public Produto(String nome, float preco) 
    {
        this.nome = nome;
        this.preco = preco;
    }
    
    public abstract String etiquetaPreco();
}
