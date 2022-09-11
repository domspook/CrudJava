package DAO;

import DTO.CadastroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CadastroDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CadastroDTO> lista = new ArrayList<>();

    public void cadastrarUsuario(CadastroDTO objCadastroDTO) {
        String sql = "insert into cadastro(nome_completo, email, genero, contato, endereco, data_nasc) values(?,?,?,?,?,?)";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadastroDTO.getNome_cad());
            pstm.setString(2, objCadastroDTO.getEmail_cad());
            pstm.setString(3, objCadastroDTO.getGenero_cad());
            pstm.setString(4, objCadastroDTO.getContato_cad());
            pstm.setString(5, objCadastroDTO.getEndereco_cad());
            pstm.setString(6, objCadastroDTO.getData_cad());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "CadastroDAO CADASTRAR: " + erro);
        }

    }

    public ArrayList<CadastroDTO> PesquisarCadastro() throws SQLException {

        String sql = "select * from cadastro";

        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery(sql);

            while (rs.next()) {
                CadastroDTO objCadastroDTO = new CadastroDTO();
                objCadastroDTO.setId_Cadastro(rs.getInt("id"));
                objCadastroDTO.setNome_cad(rs.getString("nome_completo"));
                objCadastroDTO.setEmail_cad(rs.getString("email"));
                objCadastroDTO.setGenero_cad(rs.getString("genero"));
                objCadastroDTO.setContato_cad(rs.getString("contato"));
                objCadastroDTO.setEndereco_cad(rs.getString("endereco"));
                objCadastroDTO.setData_cad(rs.getString("data_nasc"));

                lista.add(objCadastroDTO);
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "CadastroDAO PESQUISAR: " + erro);
        }

        return lista;

    }

    public void AlterarUsuario(CadastroDTO objCadastroDTO) {

        String sql = "UPDATE cadastro SET nome_completo = ?, email = ?, genero= ?, contato = ?, endereco = ?, data_nasc = ? WHERE id = ? ";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objCadastroDTO.getNome_cad());
            pstm.setString(2, objCadastroDTO.getEmail_cad());
            pstm.setString(3, objCadastroDTO.getGenero_cad());
            pstm.setString(4, objCadastroDTO.getContato_cad());
            pstm.setString(5, objCadastroDTO.getEndereco_cad());
            pstm.setString(6, objCadastroDTO.getData_cad());
            pstm.setInt(7, objCadastroDTO.getId_Cadastro());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastro Alterado com Sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "AlterarDAO AlterarUsuario: " + erro);
        }

    }
    
    public void ExcluirUsuarioDAO (CadastroDTO objCadastroDTO){
        String sql = "DELETE FROM cadastro where id = ?";

        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objCadastroDTO.getId_Cadastro());
            

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastro Excluido com Sucesso");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CadastroDAO ExcluirUsuarioDAO: " + erro);
        }
        
    
    
    }

}
