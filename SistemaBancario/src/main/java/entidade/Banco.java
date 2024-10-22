// Autores: Camile Oliveira e Gabriel Olavo

package entidade;

public interface Banco 
{
    // Target - Interface com método de modalidades de transações 
    
    void depositar(float quantia);
    void sacar(float quantia);
    void pix(float quantia, String chavePix);
}
