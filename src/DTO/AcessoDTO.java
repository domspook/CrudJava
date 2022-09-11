package DTO;


//Classe destinada para setar e receber informações de Login (Usuario e Senha) para entrar no Sistema.
public class AcessoDTO {
    
    private int Id_Usuario;
    private String Nome_Usuario, Senha_Usuario;

    public int getId_Usuario() {
        return Id_Usuario;
    }

    public void setId_Usuario(int Id_Usuario) {
        this.Id_Usuario = Id_Usuario;
    }

    public String getNome_Usuario() {
        return Nome_Usuario;
    }

    public void setNome_Usuario(String Nome_Usuario) {
        this.Nome_Usuario = Nome_Usuario;
    }

    public String getSenha_Usuario() {
        return Senha_Usuario;
    }

    public void setSenha_Usuario(String Senha_Usuario) {
        this.Senha_Usuario = Senha_Usuario;
    }
   
    
    
}
