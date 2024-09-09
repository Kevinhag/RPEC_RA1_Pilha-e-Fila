public class NodeCliente {
    private Cliente dadosCliente;
    private NodeCliente proximaNode;

    public NodeCliente() {
        this.dadosCliente = null;
        this.proximaNode = null;
    }

    public void definirDados(Cliente novosDados) {
        this.dadosCliente = novosDados;
    }

    public Cliente obterDadosCliente() {
        return this.dadosCliente;
    }

    public NodeCliente obterProximaNode() {
        return proximaNode;
    }

    public void definirProximaNode(NodeCliente novaNode) {
        this.proximaNode = novaNode;
    }

}
