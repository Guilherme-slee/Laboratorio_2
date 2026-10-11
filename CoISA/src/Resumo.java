/**
 * Representa um resumo, contendo seu tema e conteúdo.
 */

public class Resumo {
    /**
     * Conteúdo do resumo.
     */
    private String resumo;
    /**
     * Tema do resumo.
     */
    private String tema;

    /**
     * Construtor com objetivo de definir o tema e o conteúdo do resumo.
     * @param tema define o tema do resumo.
     * @param resumo define o conteúdo do resumo.
     */

    public Resumo(String tema, String resumo){
        this.tema = tema;
        this.resumo = resumo;
    }

    /**
     * Informa o conteúdo do resumo.
      * @return conteúdo do resumo
     */
    public String getResumo(){
        return this.resumo;
    }

    /**
     * Informa o tema do resumo.
     * @return tema do resumo.
     */
    public String getTema(){
        return this.tema;
    }
}
