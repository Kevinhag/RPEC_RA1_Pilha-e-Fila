public class Pilha {
    private NodeHistorico pilha;

    Pilha() {
        this.pilha = null;
    }

    public NodeHistorico obterPilha() {
        return pilha;
    }

    public NodeHistorico obterTopo() {
        NodeHistorico atual = pilha;
        while (atual.obterProximaNode() != null) {
            atual = atual.obterProximaNode();
        }
        return atual;
    }

    public void inserirHistorico(Historico historico) {
        NodeHistorico node = new NodeHistorico();
        node.definirDados(historico);

        if (pilha == null) {
            pilha = node;
        } else {
            NodeHistorico atual = pilha;
            while (atual.obterProximaNode() != null) {
                atual = atual.obterProximaNode();
            }
            atual.definirProximaNode(node);
        }
    }

    public Historico removerHistorico() {
        if (pilha == null) {

            return null;
        }

        if (pilha.obterProximaNode() == null) {
            Historico historicoRemovido = pilha.obterDados();
            pilha = null;
            return historicoRemovido;
        } else {
            NodeHistorico atual = pilha;
            while (atual.obterProximaNode().obterProximaNode() != null) {
                atual = atual.obterProximaNode();
            }
            Historico historicoRemovido = atual.obterProximaNode().obterDados();
            atual.definirProximaNode(null);
            return historicoRemovido;
        }
    }

    public void imprimirHistorico() {

        NodeHistorico atual = pilha;
        while (atual != null) {
            System.out.println(atual.obterDados());
            atual = atual.obterProximaNode();
        }
    }
}