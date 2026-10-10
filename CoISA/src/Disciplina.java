import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horas;
    private double[] notas;

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[] {0.0, 0.0, 0.0, 0.0};
    }
    private double media(){
        double som = 0;
        int cont = 0;
        for (int i = 0; i < this.notas.length; i++){
            cont +=1;
            som += this.notas[i];
        }
        return som/cont;
    }
    public void cadastraHoras(int horas){
        this.horas += horas;
    }
    public void cadastraNota(int nota, double valorNota){
        this.notas[nota - 1] = valorNota;
    }
    public boolean aprovado(){
        return media() >= 7.0;
    }
    @Override
    public String toString(){
       return this.nomeDisciplina + " " + this.horas + " " + media() + " " + Arrays.toString(this.notas);
    }
}


