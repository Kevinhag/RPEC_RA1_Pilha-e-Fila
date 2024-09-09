import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Atendimento extends JFrame implements ActionListener {
    private JButton btnRemoverTick;
    private JButton btnAdicionarTick;
    private JButton btnExibirTick;
    private JButton btnAdicionar;
    private JButton btnRemover;
    private JButton btnExibir;
    private JTextArea painelBotoesAtendimento;
    private JTextArea painelBotoesHistorico;
    private JPanel painel;
    private JPanel painelBotoes;
    private JPanel painelAreaTexto;

    private Pilha pilha;
    private Fila fila;
    private int IDcliente = 0;
    private int IDatendimento = 0;

    public Atendimento() {

        pilha = new Pilha();
        fila = new Fila();

        // UI

        setTitle("Atendimento");
        setSize(1600, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        painel = new JPanel();
        painel.setBorder(new EmptyBorder(5, 5, 5, 5));
        painel.setLayout(new BorderLayout(5, 10));
        setContentPane(painel);

        painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(1, 3, 10, 10));
        painelBotoes.setPreferredSize(new Dimension(1600, 100));
        painelBotoes.setBorder(new EmptyBorder(5, 5, 0, 5));
        painel.add(painelBotoes, BorderLayout.NORTH);

        painelAreaTexto = new JPanel();
        painelAreaTexto.setLayout(new GridLayout(1, 2, 10, 10));
        painelAreaTexto.setBorder(new EmptyBorder(0, 5, 5, 5));
        painel.add(painelAreaTexto, BorderLayout.CENTER);

        painelBotoesAtendimento = new JTextArea();
        painelBotoesAtendimento.setEditable(false);
        JScrollPane textAtendimento = new JScrollPane(painelBotoesAtendimento);

        painelBotoesHistorico = new JTextArea();
        painelBotoesHistorico.setEditable(false);
        JScrollPane textHistorico = new JScrollPane(painelBotoesHistorico);

        JPanel painelTexto = new JPanel();
        painelTexto.setLayout(new GridLayout(1, 2, 10, 10));
        painelTexto.add(textHistorico);
        painelTexto.add(textAtendimento);
        painelAreaTexto.add(painelTexto, BorderLayout.CENTER);

        // Botões Histórico

        JPanel panelHistorico = new JPanel();
        painelBotoes.add(panelHistorico);
        panelHistorico.setLayout(new GridLayout(1, 3, 5, 0));

        btnAdicionarTick = new JButton("Adicionar Ticket");
        panelHistorico.add(btnAdicionarTick);
        btnAdicionarTick.addActionListener(this);

        btnRemoverTick = new JButton("Remover Ticket");
        panelHistorico.add(btnRemoverTick);
        btnRemoverTick.addActionListener(this);

        btnExibirTick = new JButton("Exibir historico");
        panelHistorico.add(btnExibirTick);
        btnExibirTick.addActionListener(this);

        // Botões Atendimento

        JPanel panelAtendimento = new JPanel();
        painelBotoes.add(panelAtendimento);
        panelAtendimento.setLayout(new GridLayout(1, 2, 5, 0));

        btnAdicionar = new JButton("Adicionar cliente");
        panelAtendimento.add(btnAdicionar);
        btnAdicionar.addActionListener(this);

        btnRemover = new JButton("Atender cliente");
        panelAtendimento.add(btnRemover);
        btnRemover.addActionListener(this);

        btnExibir = new JButton("Exibir fila");
        panelAtendimento.add(btnExibir);
        btnExibir.addActionListener(this);

        setVisible(true);
    }

    private void appendToTextArea(JTextArea textArea, String text) {
        textArea.append(text + "\n");
    }

    private int addIDAtendimento() {
        return IDatendimento++;
    }

    private int addIDCliente() {
        return IDcliente++;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Randomizador random = new Randomizador();

        if (e.getSource() == btnAdicionar) {
            Cliente novoCliente = new Cliente(addIDAtendimento(), random.nomeAleatorio(),
                    random.atendimentoAleatorio());
            fila.inserirCliente(novoCliente);
            appendToTextArea(painelBotoesAtendimento, "Cliente adicionado: " + novoCliente.toString());

        } else if (e.getSource() == btnRemover) {
            Cliente clienteAtendido = fila.removerCliente();
            if (clienteAtendido != null) {
                appendToTextArea(painelBotoesAtendimento, "Cliente atendido: " + clienteAtendido.obterCliente());
            } else {
                appendToTextArea(painelBotoesAtendimento, "Nenhum cliente na fila para atender.");
            }
        } else if (e.getSource() == btnExibir) {
            appendToTextArea(painelBotoesAtendimento, "\nClientes na fila:");
            NodeCliente atual = fila.obterFila();
            if (atual == null) {
                appendToTextArea(painelBotoesAtendimento, "Nenhum cliente na fila.");
            }
            while (atual != null) {
                appendToTextArea(painelBotoesAtendimento, atual.obterDadosCliente().toString());
                atual = atual.obterProximaNode();
            }
        } else if (e.getSource() == btnAdicionarTick) {
            Historico novoHistorico = new Historico(addIDCliente(), random.datahoraAleatorio(),
                    random.historicoAleatorio());
            pilha.inserirHistorico(novoHistorico);
            appendToTextArea(painelBotoesHistorico, "Ticket adicionado: " + novoHistorico.toString());

        } else if (e.getSource() == btnExibirTick) {
            appendToTextArea(painelBotoesHistorico, "\nHistórico:");
            NodeHistorico atual = pilha.obterPilha();
            if (atual == null) {
                appendToTextArea(painelBotoesHistorico, "Nenhum ticket para exibir.");
            }
            while (atual != null) {
                appendToTextArea(painelBotoesHistorico, atual.obterDados().toString());
                atual = atual.obterProximaNode();
            }
        } else if (e.getSource() == btnRemoverTick) {
            Historico removido = pilha.removerHistorico();
            if (removido != null) {
                appendToTextArea(painelBotoesHistorico, "Ticket removido: " + removido.toString());
            } else {
                appendToTextArea(painelBotoesHistorico, "Nenhum ticket para remover.");
            }
        }
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            System.out.println("Erro no Look and Feel");
        }

        new Atendimento();
    }
}
