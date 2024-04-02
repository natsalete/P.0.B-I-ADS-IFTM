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

## 

### Atividade 3

EXERCÍCIOS 
1) Crie uma classe em Java chamada Itens para uma loja de suprimentos de informática. A classe deve conter 
quatro atributos – o número (String), a descrição (String), a quantidade comprada de um item (int) e o preço por 
item (double). A classe deve ter um construtor e um método get e set para cada variável de instância. Além 
disso, forneça um método chamado getTotalItens que calcula o valor total do item e depois retorna o valor 
como um double. Por padrão inicie os atributos com o valor zero. Forneça os métodos aumentarQuantidade e 
diminuirQuantidade. Lembrando que não é possível que a quantidade comprada de um item seja menor que 1 e 
que o preço seja negativo. Crie três objetos Item e exiba o valor total de cada item. Faça uso dos métodos 
aumentarQuantidade e diminuirQuantidade. Mostre novamente o valor de cada item ao final dessa operação.

2) Crie uma classe em Java chamada Empregado. Essa classe possui três partes de informações como variáveis de 
instância – atributos – nome (String), sobrenome (String) e um salário mensal (double). A classe deve métodos 
get e set para cada variável de instância. Escreva um aplicativo chamado PooEmpregado e crie dois objetos 
Empregado e exibe o salário anual de cada objeto. Então dê a cada Empregado um aumento de 10% e exiba 
novamente o salário anual de cada Empregado.

4) Crie uma classe em Java chamada Data que inclui três informações como variáveis de instância – atributos – mês 
(int), dia (int) e ano (int). A classe deve ter métodos get e set para cada variável e um construtor que inicializa as 
variáveis e assume que os valores fornecidos são corretos. Forneça um método displayData que exibe o dia, o 
mês e o ano separados por barras normais ( / ). Escreva um aplicativo de teste chamado DataTeste que 
demonstra as capacidades da classe Data.

##

### Atividade 4

EXERCÍCIOS 
1) A empresa XYZ trabalha com revenda de peças automotivas para carros nacionais e importados. Cada peça é 
produzida para um veículo de uma marca e um modelo, considerando que esse mesmo modelo é lançado pela 
montadora por um período de anos. Quando o veículo é nacional, a empresa XYZ busca por peças por todo país 
e quando as encontra em outro estado, tem que pagar um imposto para o estado que está fornecendo a mesma. 
Quando se trata de uma peça para veículo importado o problema se torna um pouco mais complexo pois essas 
peças são encontradas geralmente em outro país. Sendo assim a empresa realiza uma busca pela internet e faz a 
importação das peças solicitadas pelos seus clientes. Além do valor do frete da peça, outro ponto que interfere 
diretamente no preço do produto é a importação, a peça pode ou não ser taxada pela alfandega Brasileira. O 
cálculo do preço de venda das peças importadas é feito através do sistema, a empresa tem lucro somente em 
cima do valor de compra da peça, o restante dos custos de importação é repassado na integra para o cliente 
(frete + valor da importação). Considere que todo produto acima de 50 dólares é taxado em 62% sobre seu valor 
de custo. Utilize a contação do dólar atual para realização do cálculo. Lembre-se o preço de venda e o valor da 
importação devem ser calculados com base nos dados inseridos para a peça. O preço de venda é o preço de 
custo + % margem de lucro. Para as peças nacionais compradas em outro estado, adicione ao preço de venda a 
taxa de imposto de 20% sobre o preço de custo. Para peças importadas, junto ao preço de venda deve ser 
adicionado o valor do frete + valor importação. Todos os métodos abstratos (em itálico) devem ser 
implementados pelas subclasses.

![image](https://github.com/natsalete/P.O.O-I-ADS-IFTM/assets/135389319/9ca8d3a6-d678-431c-8be5-1c9346f582e2)

2) Implemente Construtores, Encapsulamento, Herança e Abstração. 
Para a instanciação dos objetos utilize somente construtores com parâmetros/assinatura, é vedado o uso de 
construtores vazios para instanciar objetos. 
3) Implemente objetos e faça uso de todos os métodos.

![Captura de tela 2024-03-27 164655](https://github.com/natsalete/P.O.O-I-ADS-IFTM/assets/135389319/df10e67d-6d14-4838-9f96-71f5c5c30a54)

##

### TRABALHO 1

![image](https://github.com/natsalete/P.O.O-I-ADS-IFTM/assets/135389319/d4a4e59e-af07-4adb-b438-add516a4c6dc) ![image](https://github.com/natsalete/P.O.O-I-ADS-IFTM/assets/135389319/bdd1e32f-31c1-4639-9ede-dfe6988bb401)


