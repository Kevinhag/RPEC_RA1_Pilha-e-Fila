public class Historico extends Solicitacao {

    String datahora;

    public Historico(int novoID, String novaDataHora, String novoTipo) {
        super(novoID, novoTipo);
        this.datahora = novaDataHora;
    }

    public void definirDataHora(String novaDataHora) {
        this.datahora = novaDataHora;
    }

    public String obterDataHora() {
        return this.datahora;
    }

    public String ObterHistorico() {
        return "ID: REQ" + String.format("%03d", id) + " - Data: " + datahora + " - Tipo: " + tipo;
    }

    @Override
    public String toString() {
        return ObterHistorico();
    }
}
