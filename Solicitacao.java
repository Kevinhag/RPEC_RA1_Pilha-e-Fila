public class Solicitacao {

    int id;
    String tipo;

    public Solicitacao(int novoID, String novoTipo) {
        this.id = novoID;
        this.tipo = novoTipo;
    }

    public int obterID() {
        return this.id;
    }

    public void definirID(int novoID) {
        this.id = novoID;
    }

    public String obterTipo() {
        return tipo;
    }

    public void definirTipo(String novoTipo) {
        this.tipo = novoTipo;
    }
}
