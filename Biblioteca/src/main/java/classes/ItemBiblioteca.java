// Dev: Gabriel S. Olavo

package classes;

public abstract class ItemBiblioteca 
{
    protected String titulo;
    protected String codigo;
    
    public ItemBiblioteca(String titulo, String codigo)
    {
        this.titulo = titulo;
        this.codigo = codigo;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public String getCodigo()
    {
        return codigo;
    }
        
    public abstract String exibirDetalhes();
}
