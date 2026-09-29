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
        this.notas[nota] = valorNota;
    }
    public boolean aprovado(){
        if (media() >= 7.0){
            return true;
        }
        return false;
    }
    public String toString(){
       return "Disciplina: " + this.nomeDisciplina + "\n" + "Horas: " + this.horas + "\n" + "Média: " + media() + "\n" + "Notas: " + Arrays.toString(this.notas);
    }
}


