import java.util.Arrays;

public class RegistroResumos {
    private Resumo[] resumosO;
    private int id = 0;

    public RegistroResumos(int qResumos){
        this.resumosO = new Resumo[qResumos];
    }
    public boolean temResumo(String tema){
        for (int i = 0; i < this.resumosO.length; i++){
            if (resumosO[i] != null && tema.equals(this.resumosO[i].getTema())) {
                    return true;
            }
        }
        return false;
    }

    public void adiciona(String tema, String resumo){
        if (!temResumo(tema)){
            this.resumosO[id] = new Resumo(tema, resumo);
            id += 1;
            if (id >= this.resumosO.length){
                id = 0;
            }
        }
    }
    public String[] pegaResumos(){
        String[] todosResumos = new String[conta()];
        for (int i = 0; todosResumos.length > i; i++ ){
            todosResumos[i] =this.resumosO[i].getTema() + ": " + this.resumosO[i].getResumo();
        }
        return todosResumos;
     }
    public int conta(){
        int cont = 0;
        for (int i = 0; i < this.resumosO.length; i++){
            if (this.resumosO[i] != null){
                cont += 1;
            }
        }
        return cont;
    }
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

