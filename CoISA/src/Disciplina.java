import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horas;
    private double[] notas;
    private int[] pesos = new int[]{1, 1, 1, 1};

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[4];
    }
    public Disciplina(String nomeDisciplina, int qNotas){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[qNotas];
        this.pesos = new int[qNotas];
        Arrays.fill(pesos,1);
    }
    public Disciplina(String nomeDisciplina, int qNotas, int[] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[qNotas];
        this.pesos = pesos;
    }

    private double media(){
        double soma = 0.0;
        int somaPeso = 0;
        for (int i = 0; i < this.notas.length; i++){
            soma += pesos[i]*notas[i];
            somaPeso += pesos[i];
        }
        return soma/somaPeso;
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


