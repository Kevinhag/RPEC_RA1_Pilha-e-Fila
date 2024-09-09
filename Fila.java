public class Fila {
    private NodeCliente fila = null;

    Fila() {
        this.fila = null;
    }

    public NodeCliente obterFila() {
        return fila;
    }

    public void inserirCliente(Cliente novosDados) {
        NodeCliente node = new NodeCliente();

        node.definirDados(novosDados);
        if (fila == null) {
            fila = node;
        } else {
            NodeCliente atual = fila;
            while (atual.obterProximaNode() != null) {
                atual = atual.obterProximaNode();
            }
            atual.definirProximaNode(node);
        }
    }

    public Cliente removerCliente() {
        if (fila != null) {
            Cliente clienteRemovido = fila.obterDadosCliente();
            fila = fila.obterProximaNode();
            return clienteRemovido;
        }
        return null;
    }

    public void imprimirCliente() {
        NodeCliente atual = fila;
        while (atual != null) {
            System.out.println(atual.obterDadosCliente());
            atual = atual.obterProximaNode();
        }
    }
}
