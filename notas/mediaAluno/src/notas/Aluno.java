package notas;

public class Aluno 
{
    public float primeiroTrimestre;
    public float segundoTrimestre;
    public float terceiroTrimestre;
    public float media;
    public float pontoRestante;

    public float mediaDoAluno() {
        media = (primeiroTrimestre + segundoTrimestre + terceiroTrimestre) / 3;
        return media;
    }

    public void Situacao() 
    {
        if (media >= 60) {
            System.out.println("Aprovado!");
        
        } else {
            System.out.println("Reprovado!");
        }
    }

    public float Pontuacao()
    {
        if (media < 60) {
            pontoRestante = media - 60;         
        }

        return pontoRestante;
    }
}