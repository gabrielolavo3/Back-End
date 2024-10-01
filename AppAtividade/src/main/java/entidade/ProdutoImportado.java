package entidade;

public class ProdutoImportado extends Produto
{    
    private float taxa;
    
    public ProdutoImportado(String nome, float preco, float taxa) 
    {
        super(nome, preco);
        this.taxa = taxa;
    }
    
    @Override
    public String etiquetaPreco() 
    {
        float precoFinal = preco * taxa;
        
        return "Produto Importado: " + nome 
                + "\nPreco: " + String.format("%.2f", precoFinal) 
                + "\nTaxa de importação: " + String.format("%.2f", taxa);
    }
    
}
