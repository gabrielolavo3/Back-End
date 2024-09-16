package entidade;

public class Student {
    public float primeiroTrimestre;
    public float segundoTrimestre;
    public float terceiroTrimestre;
    public float notaTotal;
    public float pontoRestante;
    public String nome;

    public float somaTrimestre() 
    {
        notaTotal = (primeiroTrimestre + segundoTrimestre + terceiroTrimestre);
        return notaTotal;
    }

    public void Situacao() 
    {
        if (notaTotal >= 60) {
            System.out.println("Aprovado!");
        
        } else {
            System.out.println("Reprovado!");
        }
    }

    public float Pontuacao()
    {
        if (notaTotal < 60) {
            pontoRestante = 60 - notaTotal;         
        }

        return pontoRestante;
    }
    
    public void consoleFinal()
    {
       System.out.println(nome);
       System.out.println(primeiroTrimestre);
       System.out.println(segundoTrimestre);
       System.out.println(terceiroTrimestre);
       System.out.println("Nota Final: " + somaTrimestre());
       Situacao();  
       
       if (notaTotal < 60) {
           System.out.println("Falta " + Pontuacao() + " pontos");
       }
    }
}
