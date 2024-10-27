
// Dev: Gabriel S. Olavo

package classes;

public class Livro extends ItemBiblioteca
{
    private String autor;
    private int numeroPagina;
    
    public Livro(String titulo, String codigo, String autor, int numeroPagina)
    {
        super(titulo, codigo);
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }
    
    public String getAutor()
    {
        return autor;
    }
    
    public int getNumeroPagina()
    {
        return numeroPagina;
    }
    
    @Override
    public String exibirDetalhes()
    {           
        return String.format("\nObra: %s\nAutor: %s\nCódigo: %s\nNúmero de Páginas: %d", 
                titulo, autor, codigo, numeroPagina);
    }
}
