public class Cliente extends Solicitacao {

    String nome;

    public Cliente(int novoID, String novoNome, String novoTipo) {
        super(novoID, novoTipo);
        this.nome = novoNome;
    }

    public void definirNome(String novoNome) {
        this.nome = novoNome;
    }

    public String obterNome() {
        return this.nome;
    }

    public String obterCliente() {
        return "ID: CLI" + String.format("%03d", id) + " - Nome: " + nome + " - Motivo: " + tipo;
    }

    @Override
    public String toString() {
        return obterCliente();
    }
}
