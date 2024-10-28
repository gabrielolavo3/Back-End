// Dev: Gabriel S. Olavo

package classes;

public class Revista extends ItemBiblioteca
{
    private String mesPublicacao;
    private short edicao;
    
    public Revista(String titulo,String codigo, String mesPublicacao, short edicao)
    {
        super(titulo, codigo);
        this.mesPublicacao = mesPublicacao;
        this.edicao = edicao;
    }
    
    public String getMesPublicacao()
    {
        return mesPublicacao;
    }
    
    public short getEdicao()
    {
        return edicao;
    }    
  
    @Override
    public String exibirDetalhes()
    {        
        return String.format("\nObra: %s\nMês de publicação: %s\nCódigo: %s\nEdição: %d", 
                titulo, mesPublicacao, codigo, edicao);
    }
}
