import java.util.Arrays;

/**
 * Representação de uma disciplina no sistema,
 * sendo estruturado na relação entre horas de estudo, notas, peso das notas e por fim o nome da disciplina.
 */
public class Disciplina {
    /**
     * Nome da disciplina.
     */
    private String nomeDisciplina;
    /**
     * Horas estudadas da disciplina.
     */
    private int horas;
    /**
     * Notas da disciplina.
     */
    private double[] notas;
    /**
     * O peso de cada nota(sendo 1 caso peso não seja definido).
     */
    private int[] pesos = new int[]{1, 1, 1, 1};

    /**
     * Construtor com objetivo de definir o nome da disciplina,
     * com a quantidade de notas/pesos pre determinadas(cada peso valendo 1).
     * @param nomeDisciplina define qual o nome da disciplina.
     */

    public Disciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[4];
    }

    /**
     * Construtor com objetivo de definir o nome da disciplina, e a quantidade de notas e pesos
     * com pesos pre determinadas(cada peso valendo 1).
     * @param nomeDisciplina define nome da disciplina.
     * @param qNotas define a quantidade de notas e pesos.
     *
     * Arrays.fill serve para define o valor dos pesos em 1.
     */
    public Disciplina(String nomeDisciplina, int qNotas){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[qNotas];
        this.pesos = new int[qNotas];
        Arrays.fill(pesos,1);
    }

    /**
     * Construtor com objetivo de definir o nome da disciplina,quantidade de notas e peso,
     * e o valor de cada peso.
     *
     * @param nomeDisciplina define o nome da disciplina.
     * @param qNotas define a quantidade de notas e pesos.
     * @param pesos define o valor de cada peso.
     */

    public Disciplina(String nomeDisciplina, int qNotas, int[] pesos){
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[qNotas];
        this.pesos = pesos;
    }

    /**
     * Calcula a media com base no calculo de media ponderada(pois assim é possivel fazer os dois
     * tipos de media com o mesmo metodo).
     *
     * @return A razão entre a soma de cada nota com seu respectivo peso(nota multiplicado pelo peso)
     * e a soma de todos os pesos.
     */

    private double media(){
        double soma = 0.0;
        int somaPeso = 0;
        for (int i = 0; i < this.notas.length; i++){
            soma += pesos[i]*notas[i];
            somaPeso += pesos[i];
        }
        return soma/somaPeso;
    }

    /**
     * Quantidade de horas a adicionar no total de horas estudodas na disciplina.
     * @param horas soma horas ao total de horas no estudo da disciplina.
     */

    public void cadastraHoras(int horas){
        this.horas += horas;
    }

    /**
     * Adiciona um valor a uma nota de numeração especifica.
     * @param nota define qual nota sera modificada(primeira nota,segunda nota, etc...).
     * @param valorNota define quanto uma nota vale.
     */
    public void cadastraNota(int nota, double valorNota){
        this.notas[nota - 1] = valorNota;
    }

    /**
     * Testa se um aluno passou de media.
     *
     * @return se a media for maior ou igual que 7,ele retornara true(aprovado),caso contrario,
     * retornara false(reprovado).
     */
    public boolean aprovado(){
        return media() >= 7.0;
    }

    /**
     * Retorna uma representação textual da disciplina.
     *
     * @return retorna um conjutno de informações,sendo elas, nome da disciplina, horas estudadas,
     * media e todas as notas.
     */

    @Override
    public String toString(){
       return this.nomeDisciplina + " " + this.horas + " " + media() + " " + Arrays.toString(this.notas);
    }
}


