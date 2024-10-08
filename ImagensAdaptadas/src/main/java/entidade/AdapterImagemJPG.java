// Autores: Camile Oliveira e Gabriel Olavo

package entidade;

public class AdapterImagemJPG implements ConversorImagemPNG
{
   // Construct e atributo de acesso para a Class ImagemJPG
   
   private ImagemJPG imagemJPG;
   
   public AdapterImagemJPG(ImagemJPG imagemJPG)
   {
       this.imagemJPG = imagemJPG;
   }
   
   // Subescrevendo o método da Interface
   
   @Override
   public void converterParaPNG(String caminho)
   {
       System.out.printf("Convertendo a imagem em %s para PNG...\n", caminho);
       System.out.println("Imagem convertida com sucesso!");
   }          
}
