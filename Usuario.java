
public class Usuario {

    private String Nome;
    private String SenhaDoUsuario;
    private String EmailDoUsuario;
    private int IdadeDoUsuario;
    private int Celular;
     
    public void SetNome( String Nome){
        this.Nome = Nome;
    }

    public String GetNome(){
        return this.Nome;
    }

    public void SetSenhaDoUsuario( String SenhaDoUsuario){
        this.SenhaDoUsuario = SenhaDoUsuario;
    }

    public String GetSenhaDoUsuario(){
        return this.SenhaDoUsuario;
    }

    public void SetEmailDoUsuario( String EmailDoUsuario){
        this.EmailDoUsuario = EmailDoUsuario;
    }

    public GetEmailDoUsuario(){
        return this.EmailDoUsuario;
    }

    public void SetIdadeDoUsuario( int IdadeDoUsuario){
        this.IdadeDoUsuario = IdadeDoUsuarioma;
    }

    public int SetIdadeDoUsuario(){
        return this.IdadeDoUsuario;
    }

    public void SetCelular( int Celular ){
        this.Celular = Celular;
    }

    public int GetCelular(){
        return this.Celular;
    }

}