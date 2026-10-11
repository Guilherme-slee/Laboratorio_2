/**
 * Representação do estado do descanso de um usuario,
 * considerado a relação entre horas de descanso e a quantidade de semanas.
 */
public class Descanso {
    /**
     * Quantidade de horas descansando,sem considerar horas de sono.
     */
    private int hDescanso;
    /**
     * Quantidade de semanas.
     */
    private int nSemana;

    /**
     *Construtor de descanso.
     *
     * Nota: ele não é necessario para o funcionamento,
     * porem decidi deixar por questões de legibilidade.
     */
    public Descanso() {
        this.hDescanso = 0;
        this.nSemana = 0;
    }

    /**
     * Define a quantidade de horas de descanso.
     *
     * @param hDescanso quantidade de horas descansados.
     */
    public void defineHorasDescanso(int hDescanso) {
        this.hDescanso = hDescanso;
    }

    /**
     * Define a quantidade de semanas.
     *
     * @param nSemana numero de semanas.
     */
    public void defineNumeroSemanas(int nSemana){
        this.nSemana = nSemana;
    }

    /**
     * Retorna o estado geral de descanso do usuario.
     *
     * @return "cansado" para a razão menor que 26, "descansado" para maior ou igual a 26,
     * "cansado" se semanas ou horas de descanso não forem definidos(iguais a zero).
     */

    public String getStatusGeral(){
        if (nSemana == 0 || hDescanso == 0){
            return "cansado";
        }
        else if ( this.hDescanso/this.nSemana >=26){
            return "descansado";
        }
        else {
            return "cansado";
        }
    }
}
