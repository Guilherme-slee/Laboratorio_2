/**
 * Registra o tempo dedicado pelo aluno a uma disciplina remota.
 */
public class RegistroTempoOnline {
    /**
     * Nome da disciplina remota.
     * */
    private String nomeDisciplina;
    /**
     * Quantidade de horas dedicadas na disciplina remota.
     */
    private int tempoInvestido;
    /**
     * Quantidade de horas mínimas que devem ser utilizadas na disciplina remota.
     */
    private int tempoEsperado;

    /**
     * Construtor com objetivo de definir o nome da disciplina remota,
     * com quantidade de horas minimas definidos para 120 horas(tempo esperado).
     * @param nomeDisciplina define o nome da disciplina remota.
     */
    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoInvestido = 0;
        this.tempoEsperado = 120;
    }

    /**
     * Construtor com objetivo de definir o nome da disciplina remota,
     * e a quantidade de horas minimas (tempo esperado).
     * @param nomeDisciplina define o nome da disciplina remota.
     * @param tempoEsperado define quantidade mínima de horas esperados.
     */

    public RegistroTempoOnline(String nomeDisciplina, int tempoEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoInvestido = 0;
        this.tempoEsperado = tempoEsperado;
    }

    /**
     * Quantidade de horas a adicionar no total de horas estudadas na disciplina remota.
     * @param tempoInvestido define a quantidade de horas que sera somado ao total de horas estudodas
     * na disciplina remota.
     */
    public void adicionaTempoOnline(int tempoInvestido){
        this.tempoInvestido += tempoInvestido;
    }

    /**
     * Verifica se o aluno atingiu a meta minima de horas na disciplina remota
     * @return se a quantidade de horas estudadas for maior ou igual ao tempo minimo ele retornara true,
     * caso contrario, retorna false.
     * */
    public boolean atingiuMetaTempoOnline(){
       return tempoInvestido >= tempoEsperado;
    }

    /**
     * Retorna uma representação textual da disciplina remota.
     * @return nome da disciplina, tempo investidos e o tempo esperado.
     */

    @Override
    public String toString(){
    return this.nomeDisciplina + " " + this.tempoInvestido + "/" + this.tempoEsperado;
    }
}
