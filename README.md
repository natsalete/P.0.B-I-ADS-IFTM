# Programação Orientada A Objetos I

### Superior De Tecnologia Em Análise E Desenvolvimento De Sistemas - 3° Período - IFTM

Este repositório contém todas as atividades práticas realizadas durante a disciplina de Programação Orientada a Objetos I (POO I) no 3º período do curso Superior de Tecnologia em Análise e Desenvolvimento de Sistemas no IFTM.

##

### Atividade 1
Essas atividades são de execução individual com intuito avaliativo. Todas as atividades devem serem feitas no mesmo projeto.


1)      Escreva um algoritmo que solicite ao usuário a entrada de 10 números, e que exiba  o somatório desses números na tela. Após exibir a soma, o programa deve mostrar  também os números que o usuário digitou, um por linha.

2)      Escreva um algoritmo que solicite ao usuário a entrada de 10 nomes, e que exiba a  lista desses nomes na tela. Após exibir essa lista, o programa deve mostrar também  os nomes na ordem inversa em que o usuário os digitou, um por linha.

3)      Crie um programa que solicite a entrada de 10 números pelo usuário,  armazenando-os em um vetor, e então monte outro vetor com os valores do primeiro  multiplicados por 5. Exiba os valores dos dois vetores na tela, simultaneamente, em  duas colunas (um em cada coluna), uma posição por linha.

4)      Leia um vetor de 8 posições e em seguida um valor X qualquer. Seu programa  deverá fazer uma busca do valor de X no vetor lido e informar a posição em que foi  encontrado ou se não foi encontrado.

5)      Faça um algoritmo que carregue um vetor com 15 posições, calcule e mostre o  maior elemento do vetor e em que posição esse elemento se encontra e o menor  elemento do vetor e em que posição esse elemento se encontra.

6)      Ler um vetor com 20 números inteiros e apresentar o resultado da multiplicação  dos valores pelos seus índices.

7)      Gerar 100 números aleatórios e armazená-los em um vetor. Exibir o vetor.

8)      Construa uma matriz 8 x 4. Faça um algoritmo que leia valores inteiros para as 2 primeiras colunas da matriz. Ao final da leitura, faça o preenchimento da terceira coluna com a soma dos 2 primeiros valores armazenados na linha e a quarta coluna com a multiplicação dos 2 primeiros valores da linha.

9)      Faça um algoritmo que leia uma matriz 5 x 5. Leia também um valor de X. O programa deverá fazer uma busca desse valor na matriz e, ao final, escrever a localização (linha e coluna) ou uma mensagem de “não encontrado”.

10)     Faça um programa que leia duas matrizes A e B de tamanho 3 x 3 e calcule a matriz C = A ∗ B.

O projeto deve ser enviado compactado na atividade. 

As atividades enviadas que não seguirem esse padrão serão desconsideradas.

## 

### Atividade 2

EXERCÍCIOS
1) Construa um projeto de acordo com a seguinte descrição:
Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta,
o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o
nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso.
O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco
cobra uma taxa de $ 5.00. Nota: a conta não pode ficar com saldo negativo se o saldo não for suficiente para
realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando
os dados da conta após cada operação.

- Exemplo 1

Número da conta: 8532 <br />
Titular da conta: Alex Green <br />
Há um depósito inicial (s/n)? s <br />
Digite o valor do depósito inicial: 500,00 <br />

Dados da conta: <br />
Conta 8532, Titular: Alex Green, Saldo: $ 500,00 <br />

Digite o valor do depósito: 200,00

Dados atualizados da conta: <br />
Conta 8532, Titular: Alex Green, Saldo: $ 700,00 <br />

Digite o valor do saque: 300,00

Dados atualizados da conta: <br />
Conta 8532, Titular: Alex Green, Saldo: $ 395,00

- Exemplo 2

Digite o número da conta: 7801 <br />
Digite o titular da conta: Maria Brown <br />
Há um depósito inicial (s/n)? n <br />

Dados da conta: <br />
Conta 7801, Titular: Maria Brown, Saldo: $ 0,00 <br />

Digite o valor do depósito: 200,00

Dados atualizados da conta: <br />
Conta 7801, Titular: Maria Brown, Saldo: $ 200,00 <br />

Digite o valor do saque: 198,00

Operação não realizada. Saldo Insuficiente

Dados atualizados da conta: <br />
Conta 7801, Titular: Maria Brown, Saldo: $ 200,00
