
public class Conteudo {
 
    private String Titulo; // Titulo da serie, filme, documentario e etc...
    private String Genero; // Genero do filme, serie, documentario e etc...
    private int ClassificacaoIndicada; //o filme, serie, documentario entre outros é pra maiores de 18, para maiores de 16 e etc..
    private String Idioma; // escolher o audio em Portugues, ingles, espanhol e etc...
    private String Legenda; // escolher a lengenda em Portugues, ingles, espanhol e etc...
    
    public void SetTitulo( String Titulo ){
        this.Titulo = Titulo;
    }

    public String GetTitulo(){
        return this.Titulo;
    }

    public void SetGenero( String Genero ){
        this.Genero = Genero;
    }

    public String GetGenero(){
        return this.Genero;
    }

    public void SetClassificacaoIndicada( int ClassificacaoIndicada){
        this.ClassificacaoIndicada = ClassificacaoIndicada;
    }

    public int GetClassificacaoIndicada(){
        return this.ClassificacaoIndicada;
    }

    public void SetIdioma( String Idioma){
        this.Idioma = Idioma;
    }

    public String GetIdioma(){
        return this.Idioma;
    }

    public void SetLegenda( String Legenda ){
        this.Legenda = Legenda;
    }

    public String GetLegenda(){
        return this.Legenda;
    }

}