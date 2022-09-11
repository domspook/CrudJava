/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO. AcessoDTO;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
/**
 *
 * @author Amori
 */
public class AcessoDAO {
    
    Connection conn; 
    
    public ResultSet autentificacaoUsuario(AcessoDTO objUsuarioDTO){
        
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "Select * from usuario where nome_usuario = ? and senha_usuario = ?";
            
            PreparedStatement pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getNome_Usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_Usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"UsuarioDAO: " + erro);
            return null;
        }
        
    }
    
}   
    

