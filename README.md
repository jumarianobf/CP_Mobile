# Calculadora App

Este projeto é um aplicativo Android desenvolvido no Android Studio, seguindo o protótipo especificado para uma aplicação de calculadora com três telas.

## Funcionalidades

- **Tela Home**: Contém botões conforme o protótipo.
  - Botão "Calculadora" para acessar a calculadora.
  - Botão "Conta Telefônica" que abre uma nova tela para cálculo de conta telefônica.
  - Botão "Aluno" que abre um diálogo exibindo informações sobre os alunos que desenvolveram o projeto.
  
- **Calculadora**:
  - Ao pressionar o botão "Calculadora" na tela inicial, o app exibe uma nova tela.
  - Nesta tela, há dois campos de entrada (`EditText`) para o usuário informar os valores e um `RadioGroup` com as opções de operações matemáticas (+, -, *, /).
  - Após a escolha da operação e preenchimento dos valores, o resultado é exibido em um `Toast`.

- **Conta Telefônica**:
  - Ao pressionar o botão "Conta Telefônica", o app abre uma nova tela com três campos de entrada (`EditText`):
    - Um campo de assinatura com valor fixo de R$ 59,90.
    - Um campo para minutos de chamadas locais com valor de R$ 0,04 por minuto.
    - Um campo para minutos de chamadas para celular com valor de R$ 0,20 por minuto.
  - Após preencher os valores e pressionar o botão "Calcular", o resultado será exibido em outra tela.

## Requisitos do Projeto

- **Assinatura do aplicativo**: O aplicativo deve ser assinado conforme a imagem especificada no protótipo.
- **Dark Mode**: O protótipo deve ser visualizado utilizando o modo escuro (Dark Mode) no emulador.
- **Cores**: Utilizar cores em formato hexadecimal conforme as especificações.
- **Versões Utilizadas**:
  - AGP: 8.3.1
  - Kotlin: 1.9.0
  - CoreKtx: 1.13.1
  - JUnit: 4.13.2
  - JUnitVersion: 1.2.1
  - EspressoCore: 3.6.1
  - AppCompat: 1.7.0
  - Material: 1.12.0
  - Activity: 1.9.2
  - ConstraintLayout: 2.1.4

## Tecnologias Utilizadas

- **Android Studio**
- **Kotlin** como linguagem de programação.
- **Emulador Android** para testes.

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone <url-do-repositorio>
