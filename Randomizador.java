import java.util.Random;

public class Randomizador {
    private Random aleatorio = new Random();
    private String[] nomes = {
            "Andrey", "Lucas", "Pedro", "João", "Maria", "Ana", "José", "Carlos",
            "Fernando", "Ricardo", "Gabriel", "Rafael", "Bruno", "Thiago", "Matheus",
            "Felipe", "Gustavo", "Rodrigo", "Alexandre", "Marcelo", "Leandro", "Vinicius",
            "Igor", "Henrique", "Vitor", "Eduardo", "Jorge", "Claudio", "Marcos", "Daniel",
            "Sofia", "Beatriz", "Larissa", "Isabella", "Camila", "Julia", "Mariana",
            "Renata", "Patricia", "Amanda", "Roberta", "Tatiana", "Fernanda", "Paula",
            "Carla", "Vanessa", "Juliana", "Cristina", "Gabriela", "Monica", "Flavia",
            "Simone", "Aline", "Eliane", "Tania", "Luciana", "Elaine", "Veronica", "Tatiane",
            "Clara", "Helena", "Isabel", "Nathalia", "Giovana", "Yasmin", "Bruna", "Nicole",
            "Benedito", "Sebastião", "Manoel", "Lourdes", "Olga", "Ines", "Elisa",
            "Ivone", "Marta", "Teresa", "Alzira", "Leonardo", "Giovanni", "Mauro",
            "Rita", "Alex", "Erick", "Cristiano", "Caio", "Claudio", "Diego", "Edson",
            "Rosa", "Leticia", "Joana", "Cecilia", "Silvio", "Sergio", "Clarice", "Fatima"
    };

    private String[] sobrenomes = {
            "Silva", "Santos", "Oliveira", "Souza", "Pereira", "Ferreira", "Almeida",
            "Costa", "Carvalho", "Rodrigues", "Moraes", "Martins", "Barbosa", "Rocha",
            "Correia", "Moreira", "Melo", "Mendes", "Teixeira", "Lima", "Gomes",
            "Vieira", "Nogueira", "Ramos", "Reis", "Duarte", "Tavares", "Araujo",
            "Cardoso", "Fonseca", "Pacheco", "Miranda", "Batista", "Farias", "Campos",
            "Furtado", "Guimarães", "Lopes", "Magalhães", "Monteiro", "Moura",
            "Nunes", "Pinto", "Queiroz", "Ribeiro", "Siqueira", "Viana", "Xavier",
            "Amorim", "Barros", "Borges", "Coelho", "Cavalcante", "Domingues",
            "Esteves", "Figueiredo", "Garcia", "Gonçalves", "Henriques", "Lacerda",
            "Lemos", "Maciel", "Neves", "Peixoto", "Quintana", "Rezende", "Saraiva",
            "Tavares", "Uchoa", "Valente", "Ximenes", "Zanetti", "Bittencourt",
            "Camargo", "Diniz", "Espindola", "Fagundes", "Guerra", "Homem",
            "Imperial", "Junqueira", "Lacerda", "Macedo", "Negreiros", "Ortiz",
            "Pinto", "Queirós", "Ribeirinho", "Santana", "Trindade", "Vargas",
            "Zambrano", "Albuquerque", "Castro", "Dias", "Evangelista", "Franco"
    };

    private String[] atendimentos = {
            "Dúvida sobre produto", "Reclamação de serviço", "Solicitação de reembolso", "Informações de entrega",
            "Agendamento de visita",
            "Alteração de pedido", "Cancelamento de contrato", "Renovação de assinatura", "Suporte para instalação",
            "Pedido de orçamento",
            "Consulta de saldo", "Atualização de cadastro", "Troca de produto", "Ativação de serviço",
            "Desativação de serviço",
            "Solicitação de nota fiscal", "Reagendamento de visita", "Consulta de fatura", "Correção de endereço",
            "Suporte técnico",
            "Informações sobre promoções", "Cancelamento de assinatura", "Reembolso de taxa", "Reclamação de produto",
            "Sugestão de melhoria",
            "Informações sobre garantia", "Solicitação de suporte remoto", "Pedido de segunda via de documento",
            "Consulta de pontos de fidelidade",
            "Registro de feedback", "Consulta de contrato", "Informações sobre políticas de devolução",
            "Solicitação de troca de titularidade",
            "Desbloqueio de conta", "Bloqueio de cartão", "Solicitação de segunda via de cartão",
            "Consulta de limite de crédito", "Pedido de alteração de senha",
            "Atualização de informações de pagamento", "Consulta de disponibilidade de produto",
            "Suporte para configuração de dispositivo",
            "Informações sobre planos de serviço", "Pedido de extensão de garantia", "Consulta de histórico de compras",
            "Ativação de conta",
            "Solicitação de reembolso parcial", "Informações sobre parceria", "Consulta de status de pedido",
            "Informações sobre entrega expressa",
            "Registro de reclamação formal", "Consulta de horário de funcionamento"
    };

    private String[] historicos = {
            "Instalação de software", "Manutenção preventiva", "Atualização de sistema", "Suporte técnico",
            "Troca de equipamento",
            "Consulta de garantia", "Reparo de impressora", "Configuração de rede", "Restauração de dados",
            "Consulta técnica",
            "Backup de dados", "Instalação de antivírus", "Recuperação de senha", "Instalação de hardware",
            "Reparo de servidor",
            "Diagnóstico de problemas", "Desinstalação de software", "Teste de conectividade",
            "Monitoramento de sistema", "Otimização de desempenho",
            "Configuração de e-mail", "Atualização de firmware", "Instalação de sistema operacional",
            "Reparação de falha de segurança", "Migração de dados",
            "Gerenciamento de rede", "Instalação de dispositivo de segurança", "Limpeza de malware",
            "Configuração de firewall", "Assistência remota",
            "Treinamento de usuário", "Consulta de especificações técnicas", "Revisão de infraestrutura",
            "Instalação de aplicativo móvel", "Monitoramento de backup",
            "Revisão de compliance de segurança", "Desbloqueio de dispositivo",
            "Instalação de software de gerenciamento", "Criação de imagem de disco", "Configuração de VPN",
            "Implementação de política de segurança", "Atualização de driver", "Configuração de armazenamento em nuvem",
            "Auditoria de sistema", "Reparo de dispositivo móvel",
            "Instalação de patch de segurança", "Configuração de servidor web", "Gerenciamento de patch de software",
            "Implementação de solução de recuperação de desastres",
            "Atualização de licenciamento de software", "Revisão de contrato de serviço"
    };

    public String atendimentoAleatorio() {
        return atendimentos[aleatorio.nextInt(tamanhoArray(atendimentos))];
    }

    public int tamanhoArray(String[] array) {
        int tamanho = 0;
        try {
            while (array[tamanho] != null) {
                tamanho++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return tamanho;
        }
        return tamanho;
    }

    public String historicoAleatorio() {
        return historicos[aleatorio.nextInt(tamanhoArray(historicos))];
    }

    public String nomeAleatorio() {
        return nomes[aleatorio.nextInt(tamanhoArray(nomes))] + " "
                + sobrenomes[aleatorio.nextInt(tamanhoArray(sobrenomes))];
    }

    public void telefoneAleatorio(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println("(" + (aleatorio.nextInt(90) + 10) + ") " + 9 + (aleatorio.nextInt(9000) + 1000) + "-"
                    + (aleatorio.nextInt(9000) + 1000));
        }
    }

    public String datahoraAleatorio() {
        return "2024-" + (aleatorio.nextInt(12) + 1) + "-" + (aleatorio.nextInt(28) + 1) + " " + aleatorio.nextInt(24)
                + ":"
                + aleatorio.nextInt(60) + ":" + aleatorio.nextInt(60);
    }
}
