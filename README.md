# <p align="center">Resolução de Problemas Estruturados em Computação</p>
# <p align="center">RA1 - Pilha e Fila</p>

## Sistema de Gerenciamento de Atendimento

Este projeto implementa um sistema de gerenciamento de atendimentos, no qual clientes podem fazer solicitações, que são processadas e gerenciadas por meio de filas e pilhas. O sistema registra históricos de atendimento e realiza a priorização dos atendimentos com base em regras de negócio específicas.

## Estrutura do Projeto

O projeto é composto por várias classes que trabalham juntas para implementar o sistema. Abaixo estão as descrições de cada classe:

### Classes Principais

- **Atendimento.java**: Gerencia o atendimento dos clientes, vinculando solicitações a atendentes e registrando informações relevantes.
  
- **Solicitacao.java**: Representa uma solicitação feita por um cliente, contendo informações detalhadas sobre a necessidade do cliente.
  
- **Cliente.java**: Representa um cliente no sistema, contendo dados como nome, ID, e outras informações relevantes para o atendimento.
  
- **Fila.java**: Implementa uma estrutura de fila para gerenciar a ordem de atendimento dos clientes. As solicitações entram na fila e são processadas de acordo com sua prioridade.

- **Pilha.java**: Implementa uma estrutura de pilha para gerenciar dados que precisam ser tratados de maneira LIFO (Last In, First Out), como o histórico de atendimentos ou outras informações temporárias.

### Classes Auxiliares

- **Historico.java**: Mantém o registro de todos os atendimentos realizados para um cliente, permitindo um acompanhamento detalhado do serviço prestado.

- **NodeCliente.java**: Estrutura de nó que facilita o armazenamento de dados relacionados a clientes em listas encadeadas.
  
- **NodeHistorico.java**: Estrutura de nó que facilita o armazenamento de dados históricos em listas encadeadas.

- **Randomizador.java**: Classe auxiliar para gerar dados aleatórios, como números de identificação ou ordens de atendimento, para simulação e testes.

## Funcionalidades

- **Gerenciamento de Solicitações**: Os clientes podem criar solicitações que são inseridas em uma fila para serem processadas pelos atendentes.
  
- **Acompanhamento de Atendimentos**: A cada atendimento realizado, os detalhes são registrados no histórico do cliente.
  
- **Estruturas de Dados**: O projeto utiliza estruturas de dados como filas e pilhas para gerenciar o fluxo de atendimentos e a ordem de processamento.
