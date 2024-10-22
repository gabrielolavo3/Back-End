// By: Gabriel S. Olavo | Software Developer

package entidade;

public class FuncionarioTerceirizado extends FuncionarioComum
{
    private int bonus = 110;
    private float despesaAdicional;
    
    public FuncionarioTerceirizado(String nome, int horaTrabalhada, float valorHora, float despesaAdicional)
    {
        super(nome, horaTrabalhada, valorHora);        
        this.despesaAdicional = despesaAdicional;
    }
    
    @Override
    public float pagamento()
    {
        float salario = horaTrabalhada * valorHora,
              acrescimo = despesaAdicional * bonus;
        return salario + acrescimo;       
    }
    
    @Override
    public String toString()
    {
        float pagamentoFinal = pagamento();
        
        return "\nNome do funcionaário: " + nome
                + "\nHora trabalhadas: " + horaTrabalhada
                + "\nValor da hora trabalhada: R$ " + String.format("%.2f", valorHora)
                + "\nPagamento final: R$ " + String.format("%.2f", pagamentoFinal);
    }
}



