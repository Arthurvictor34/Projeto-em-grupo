
public class Plataformas {

    private String NomedaPlataforma;
    private String ResoluçãodeVideo; // maxima resulução suportada pela plataforma
    private String SistemaOperacionalCompativel;
    private String QuanlidadeVideo;
    private String DescriçãodaPlataforma;


    public void SetNomePlataforma( String NomePlataforma ){
        this.NomePlataforma = NomePlataforma;
    }

    public String GetNomePlataforma(){
        return this.NomePlataforma;
    }

    public void SetResoluçãodeVideo( String ResoluçãodeVideo ){
        this.ResoluçãodeVideo = ResoluçãodeVideo;
    }

    public String GetResoluçãodeVideo(){
        return this.ResoluçãodeVideo;
    }

    public void SetSistemaOperacionalCompativel( String SistemaOperacionalCompativel){
        this.SistemaOperacionalCompativel = SistemaOperacionalCompativel;
    }

    public String GetSistemaOperacionalCompativel(){
        return this.SistemaOperacionalCompativel;
    }

    public void SetQualidadeVideo( String QuanlidadeVideo){
        this.QuanlidadeVideo = QuanlidadeVideo;
    }

    public String GetQualidadeVideo(){
        return this.QuanlidadeVideo;
    }

    public void SetDescriçãodaPlataforma( String DescriçãodaPlataforma ){
        this.DescriçãodaPlataforma = DescriçãodaPlataforma;
    }

    public String GetDescriçãodaPlataforma(){
        return this.DescriçãodaPlataforma;
    }
}