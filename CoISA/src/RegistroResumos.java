public class RegistroResumos {
    private String[] resumos;
    private String[] temas;
    private int id = 0;

    public RegistroResumos(int qResumos){
        this.resumos = new String[qResumos];
        this.temas = new String[qResumos];
    }
    public boolean temResumo(String tema){
        for (int i = 0; i < this.temas.length; i++){
            if (tema.equals(this.temas[i])){
                return true;
            }
        }
        return false;
    }

    public void adiciona(String tema, String resumo){
        if (id > this.temas.length){
            id = 0;
        }
        if (!temResumo(tema)){
            this.temas[id] = tema;
            this.resumos[id] = tema + ": " + resumo;
            id += 1;
        }
    }
    public String[] pegaResumos(){
        String[] todosResumos = new String[conta()];
        for (int i = 0; todosResumos.length > i; i++ ){
            todosResumos[i] = this.resumos[i];
        }
        return todosResumos;
     }
    public int conta(){
        int cont = 0;
        for (int i = 0; i < this.resumos.length; i++){
            if (this.resumos[i] != null){
                cont += 1;
            }
        }
        return cont;
    }
    public String imprimeResumos(){
        String str = "-" + " " + conta() + " " + "resumo(s) cadastrado(s)" + "\n";
        for (int i = 0; i < this.pegaResumos().length; i++){
            if (i == 0){
                str += "-" + " " + this.temas[i];
            }
            else {
                str += " "+ "|" + " " + this.temas[i];
            }

        }
        return str;
    }
}
