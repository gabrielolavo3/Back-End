package entidade;

public class FuncionarioComum extends Funcionario
{
    public FuncionarioComum(String nome, int horaTrabalhada, float valorHora)
    {
        super(nome, horaTrabalhada, valorHora);
    }
    
    @Override
    public float pagamento()
    {
        return horaTrabalhada * valorHora;
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
