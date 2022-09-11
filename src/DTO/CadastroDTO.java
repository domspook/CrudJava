package DTO;

//Classe destinada para receber as informações cadastradas nos campos do sistema para posteriormente serem salvas na base de dados.
public class CadastroDTO {
    private String nome_cad, endereco_cad,email_cad,contato_cad,genero_cad,data_cad;
    private int Id_Cadastro;

    public String getNome_cad() {
        return nome_cad;
    }

    public void setNome_cad(String nome_cad) {
        this.nome_cad = nome_cad;
    }

    public String getEndereco_cad() {
        return endereco_cad;
    }

    public void setEndereco_cad(String endereco_cad) {
        this.endereco_cad = endereco_cad;
    }

    public String getEmail_cad() {
        return email_cad;
    }

    public void setEmail_cad(String email_cad) {
        this.email_cad = email_cad;
    }

    public String getContato_cad() {
        return contato_cad;
    }

    public void setContato_cad(String contato_cad) {
        this.contato_cad = contato_cad;
    }

    public String getGenero_cad() {
        return genero_cad;
    }

    public void setGenero_cad(String genero_cad) {
        this.genero_cad = genero_cad;
    }

    public String getData_cad() {
        return data_cad;
    }

    public void setData_cad(String data_cad) {
        this.data_cad = data_cad;
    }

    public int getId_Cadastro() {
        return Id_Cadastro;
    }

    public void setId_Cadastro(int Id_Cadastro) {
        this.Id_Cadastro = Id_Cadastro;
    }
    
    
}
