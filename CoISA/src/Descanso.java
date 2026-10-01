public class Descanso {
    private int hDescanso;
    private int nSemana;

    public Descanso() {
        this.hDescanso = 0;
        this.nSemana = 1;
    }
    public void defineHorasDescanso(int hDescanso) {
        this.hDescanso = hDescanso;
    }
    public void defineNumeroSemanas(int nSemana){
        this.nSemana = nSemana;
    }
    public String getStatusGeral(){
        if ( this.hDescanso/this.nSemana >=26){
            return "descansado";
        }
        else {
            return "cansado";
        }
    }
}
