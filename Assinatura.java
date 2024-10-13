
public class Assinatura {

    private String NomeDaAssinatura;
    private String DescriçãoDaAssinatura;
    private float PreçoDaAssinatura;
    private int qtDeTelasSimultanea; // Quantidade de telas simultanea
    private String ConteudoAdicional; // 4k, Dolby Vision e etc...

    public void SetNomeDaAssinatura( String NomeDaAssinatura ){
        this.NomeDaAssinatura = NomeDaAssinatura;
    }

    public String GetNomedaAssinatura(){
        return this.NomeDaAssinatura;
    }

    public void SetDescriçãoDaAssinatura( String DescriçãoDaAssinatura ){
        this.DescriçãoDaAssinatura = DescriçãoDaAssinatura
    }

    public String GetDescriçãoDaAssinatura(){
        return this.DescriçãoDaAssinatura;
    }

    public void SetPreçoDaAssinatura( float PreçoDaAssinatura){
        this.PreçoDaAssinatura = PreçoDaAssinatura;
    }

    public float GetPreçoDaAssinatura(){
        return this.PreçoDaAssinatura;
    }

    public void SetqtDeTelasSimultanea( int qtDeTelasSimultanea){
        this.qtDeTelasSimultanea = qtDeTelasSimultanea;
    }

    public int GetqtDeTelasSimultanea(){
        return qtDeTelasSimultanea;
    }

    public void SetConteudoAdicional( String ConteudoAdicional ){
        this.ConteudoAdicional = ConteudoAdicional;
    }

    public String GetConteudoAdicional(){
        return this.ConteudoAdicional;
    }


}