public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoInvestido;
    private int tempoEsperado;

    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoInvestido = 0;
        this.tempoEsperado = 120;
    }
    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoInvestido = 0;
        this.tempoEsperado = tempoEsperado;
    }
    public void adicionaTempoOnline(int tempoInvestido){
        this.tempoInvestido = tempoInvestido;
    }
    public boolean atingiuMetaTempoOnline(){
        if (tempoInvestido >= tempoEsperado){
            return true;
        }
        return false;
    }
    public String toString(){
    return this.nomeDisciplina + this.tempoInvestido + "/" + this.tempoEsperado;
    }
}
