public class Descanso {
    private int hDescanso;
    private int nSemana;

    public Descanso() {
        this.hDescanso = 0;
        this.nSemana = 0;
    }
    public void defineHorasDescanso(int hDescanso) {
        this.hDescanso = hDescanso;
    }
    public void defineNumeroSemana(int nSemana){
        this.nSemana = nSemana;
    }
    public String getStatusGeral(){
        return "Descanso: " + this.hDescanso + "\n" + "Semanas: " + this.nSemana;
    }
}
