## Desafio Controle de Fluxo

### Descrição
O projeto Contador é um programa Java que solicita ao usuário dois parâmetros inteiros positivos via terminal. O programa verifica se os parâmetros atendem às condições estabelecidas e, se válidos, conta e imprime os números entre os dois parâmetros fornecidos. Caso contrário, o sistema fornece mensagens de erro apropriadas

### Funcionalidades
- Solicita dois parâmetros inteiros do usuário.
- Verifica se os parâmetros são positivos e se o segundo é maior que o primeiro.
- Imprime números incrementados entre os parâmetros fornecidos, se as condições forem atendidas.
- Lança uma exceção personalizada se o segundo parâmetro não for maior que o primeiro.

### Como executar
1. Compile as classes.

Compile os arquivos Java com o seguinte comando:

```javac Contador.java ParametrosInvalidosException.java```

2. Execute o Programa:

```java Contador```

3. Digite os Parâmetros:

O programa solicitará que você insira dois números inteiros positivos. Siga as instruções abaixo:

- Se algum dos parâmetros for diferente de um número inteiro positivo e o primeiro parâmetro for um número maior ou igual ao segundo, o programa exibirá uma mensagem de erro e pedirá novos valores.
- Se a entrada for válida, o programa exibirá uma lista de números incrementados entre os dois valores fornecidos.
