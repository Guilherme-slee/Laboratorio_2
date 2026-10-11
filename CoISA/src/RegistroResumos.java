import java.util.Arrays;

/**
 * Gerencia o cadastro, a busca e a consulta de resumos.
 */
public class RegistroResumos {
    /**
     * Lista de resumos cadastrados(objetos).
     */
    private Resumo[] resumosO;
    /**
     * Indice da próxima posição para adicionar um resumo.
     */
    private int id = 0;
    /**
     * Construtor com objetivo de cria um registro com uma quantidade máxima de resumos.
     *
     * @param qResumos quantidade máxima de resumos.
     */
    public RegistroResumos(int qResumos){
        this.resumosO = new Resumo[qResumos];
    }
    /**
     * Verifica se já existe um resumo com o tema informado.
     *
     * @param tema tema a ser procurado.
     * @return se o tema já estiver cadastrado retorna true, false caso contrario.
     */

    public boolean temResumo(String tema){
        for (int i = 0; i < this.resumosO.length; i++){
            if (resumosO[i] != null && tema.equals(this.resumosO[i].getTema())) {
                    return true;
            }
        }
        return false;
    }
    /**
     * Adiciona um resumo caso ainda não exista outro com o mesmo tema.
     *
     * @param tema tema do resumo.
     * @param resumo conteúdo do resumo.
     */

    public void adiciona(String tema, String resumo){
        if (!temResumo(tema)){
            this.resumosO[id] = new Resumo(tema, resumo);
            id += 1;
            if (id >= this.resumosO.length){
                id = 0;
            }
        }
    }
    /**
     * Obtém os temas e conteúdos dos resumos cadastrados.
     *
     * @return um textos contendo o tema e o conteúdo de cada resumo.
     */

    public String[] pegaResumos(){
        String[] todosResumos = new String[conta()];
        for (int i = 0; todosResumos.length > i; i++ ){
            todosResumos[i] = this.resumosO[i].getTema() + ": " + this.resumosO[i].getResumo();
        }
        return todosResumos;
     }
    /**
     * Conta a quantidade de resumos cadastrados.
     *
     * @return quantidade de resumos cadastrados.
     */
    public int conta(){
        int cont = 0;
        for (int i = 0; i < this.resumosO.length; i++){
            if (this.resumosO[i] != null){
                cont += 1;
            }
        }
        return cont;
    }
    /**
     * Gera uma representação textual dos resumos cadastrados.
     *
     * @return texto contendo a quantidade de resumos e seus temas.
     */
    public String imprimeResumos(){
        String str = "- " + conta() + " " + "resumo(s) cadastrado(s)" + "\n";
        for (int i = 0; i < this.pegaResumos().length; i++){
            if (i == 0){
                str += "- " + this.resumosO[i].getTema();
            }
            else {
                str += " | " + this.resumosO[i].getTema();
            }

        }
        return str;
    }
    /**
     * Busca resumos cujo conteúdo tenha a palavra chave informada.
     *
     * @param chave palavra chave utilizada na busca
     * @return vetor com os temas encontrados, em ordem alfabética
     */
    public String[] busca(String chave){
        int posicao = 0;
        String chaveM = chave.toLowerCase();
        String[] buscaResumo = new String[resumosO.length];

        for (int i = 0; i < this.resumosO.length; i++ ){
                if (resumosO[i] != null && resumosO[i].getResumo().toLowerCase().contains(chaveM)){
                    buscaResumo[posicao] = resumosO[i].getTema();
                    posicao += 1;
            }
        }
        String[] temasDaBusca = new String[posicao];
        for (int i = 0; i < posicao; i++){
            temasDaBusca[i] = buscaResumo[i];
        }
        Arrays.sort(temasDaBusca);
        return temasDaBusca;
    }
}

