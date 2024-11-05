
package DAO;

import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class FuncionarioDAO 
{
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarFuncionario(FuncionarioDTO funcinariodto)
    {
        String sql = "insert into tabela(nome, cidade) values (?,?)";
        conn = new ConexaoBD().conectaBD();
        
        try 
        {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcinariodto.getNomeFuncionario());
            pstm.setString(2, funcinariodto.getCidadeFuncionario());
            pstm.execute();
            pstm.close();
        } 
        catch (Exception erro) 
        {
            JOptionPane.showMessageDialog(null, erro + "FuncionarioDAO");
        }
    }
}
