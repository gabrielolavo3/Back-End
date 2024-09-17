// Autores: Andrei Vieira e Gabriel Olavo

package entidade;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public void addProdutos(int quantidade) {
        this.quantidade += quantidade;
    }
    
    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }
    
    public double valorEmEstoque() {
        return preco * quantidade;
    }
    
    public String toString() {
        double valorEstoque = valorEmEstoque();
        
        return "\nProduto " + nome 
                + " \nPreco: R$ " + preco 
                + " \nQuantidade em Estoque: " 
                + quantidade + "\nValor em Estoque: " + valorEstoque;
    }
}
