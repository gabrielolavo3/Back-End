package entidade;

public class ProdutoUsado extends Produto
{    
    public String dataFabricacao;
    
    public ProdutoUsado(String nome, float preco, String dataFabricacao) 
    {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }
    
    @Override
    public String etiquetaPreco()
    {
         return "Produto Importado: " + nome 
                + "\nPreco: " + String.format("%.2f", preco) 
                + "\nData de fabricação: " + dataFabricacao;
    }
}
