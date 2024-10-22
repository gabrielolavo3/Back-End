
package entidade;

public abstract class Funcionario 
{
    protected String nome;
    protected int horaTrabalhada;
    protected float valorHora;
    
    public Funcionario(String nome, int horaTrabalhada, float valorHora)
    {
        this.nome = nome;
        this.horaTrabalhada = horaTrabalhada;
        this.valorHora = valorHora;
    }
    
    public float pagamento()
    {
        return horaTrabalhada * valorHora;
    }
    
    public abstract String toString();
}
