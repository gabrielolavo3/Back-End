package entidade;

public class FuncionarioTerceirizado extends FuncionarioComum
{
    private float bonus = 1.1f;
    private float despesaAdicional;
    
    public FuncionarioTerceirizado(String nome, int horaTrabalhada, float valorHora, int bonus, float despesaAdicional)
    {
        super(nome, horaTrabalhada, valorHora);
        this.bonus = bonus;
        this.despesaAdicional = despesaAdicional;
    }
    
    @Override
    public float pagamento()
    {
        return (horaTrabalhada * valorHora) + (despesaAdicional * bonus);       
    }
    
    @Override
    public String toString()
    {
        float pagamentoFinal = pagamento();
        
        return "Nome do funcionaário" + nome
                + "\nHora trabalhadas: " + horaTrabalhada
                + "\nValor da hora trabalhada: R$" + String.format("%.2f", valorHora)
                + "\nPagamento final: " + String.format("%.2f", pagamentoFinal);
    }
}
