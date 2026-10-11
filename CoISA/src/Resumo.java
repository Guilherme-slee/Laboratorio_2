public class Resumo {
    private String resumo;
    private String tema;

    public Resumo(String tema, String resumo){
        this.tema = tema;
        this.resumo = resumo;
    }
    public String getResumo(){
        return this.resumo;
    }
    public String getTema(){
        return this.tema;
    }
}
