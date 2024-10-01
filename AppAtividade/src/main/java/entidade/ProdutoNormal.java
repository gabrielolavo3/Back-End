package entidade;

public class ProdutoNormal extends Produto 
{    
    public ProdutoNormal(String nome, float preco) 
    {
        // Informa quais atributos deve ser herdados!
        super(nome, preco);        
    }
    
    @Override // Subescreve o metodo da Class Principal
    public String etiquetaPreco()
    {
        return "Produto Normal: " + nome 
                + "\nPreco: R$" + String.format("%.2f", preco);
    }
}
