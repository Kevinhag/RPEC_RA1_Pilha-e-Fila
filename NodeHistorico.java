public class NodeHistorico {
    private Historico dadosHistorico;
    private NodeHistorico proximaNode;

    public NodeHistorico() {
        this.dadosHistorico = null;
        this.proximaNode = null;
    }

    public Historico obterDados() {
        return dadosHistorico;
    }

    public void definirDados(Historico novosDados) {
        this.dadosHistorico = novosDados;
    }

    public NodeHistorico obterProximaNode() {
        return proximaNode;
    }

    public void definirProximaNode(NodeHistorico novaNode) {
        this.proximaNode = novaNode;
    }
}
