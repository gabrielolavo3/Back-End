/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.FuncionarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionarioDTO> lista = new ArrayList<>();
    
    public void cadastrarFuncionario(FuncionarioDTO funcionariodto){
        
        String sql = "insert into tabela(nome, cidade)values (?,?)";
        
        conn = new Conexao().conectaBd();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcionariodto.getNomeFuncionario());
            pstm.setString(2, funcionariodto.getCidadeFuncionario());
            pstm.execute();
            pstm.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "FuncionarioDAO");
        }                
        
    }
    
   public ArrayList<FuncionarioDTO> PesquisarFuncionario()
   {
       String sql = "select * from banco.tabela";
       
       conn = new Conexao().conectaBd();
       
       try 
       {
           pstm = conn.prepareStatement(sql);
           rs = pstm.executeQuery();
           
           while(rs.next())
           {
               FuncionarioDTO funcionariodto = new FuncionarioDTO();
               funcionariodto.setId(rs.getInt("id"));
               funcionariodto.setNomeFuncionario(rs.getString("nome"));
               funcionariodto.setCidadeFuncionario(rs.getString("cidade"));
               
               lista.add(funcionariodto);
           }
       } 
       catch (Exception erro) 
       {
           JOptionPane.showMessageDialog(null, erro + "Erro: Pesquisar");
       }
       
       return lista;
   }
}
