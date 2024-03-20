package com.iftm.pooatv03;

/*1) Crie uma classe em Java chamada Itens para uma loja de suprimentos de informática. A classe deve conter
quatro atributos – o número (String), a descrição (String), a quantidade comprada de um item (int) e o preço por
item (double). A classe deve ter um construtor e um método get e set para cada variável de instância. Além
disso, forneça um método chamado getTotalItens que calcula o valor total do item e depois retorna o valor
como um double. Por padrão inicie os atributos com o valor zero. Forneça os métodos aumentarQuantidade e
diminuirQuantidade. Lembrando que não é possível que a quantidade comprada de um item seja menor que 1 e
que o preço seja negativo. Crie três objetos Item e exiba o valor total de cada item. Faça uso dos métodos
aumentarQuantidade e diminuirQuantidade. Mostre novamente o valor de cada item ao final dessa operação.*/



public class ItensLojaInformática {
    String numero;
    String descricao;
    int qtd;
    double preco;
    double TotalItens;
    
    public ItensLojaInformática(String numero, String descricao, int qtd, double preco){
        this.numero = numero;
        this.descricao = descricao;
        this.qtd = qtd;
        this.preco = preco;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public int getQtd(){
        return this.qtd;
    }
    
    public void setQtd(int qtd){
        if(qtd <= 0){
            System.out.println("A quantidade de items deve ser maior que 0!");
            qtd = 0;
        }
        
        this.qtd = qtd;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public void setPreco(double preco){
        if(preco < 0){
            System.out.println("O preco deve ser maior que 0!");
            preco = 0.0;
        }
        
        this.preco = preco;
    }
    
    
    public double getTotalItens(){
        this.TotalItens = this.qtd * this.preco;
        return this.TotalItens;
    }
    
    public void aumentarQuantidade(int qtd){
        this.qtd += qtd;
    }
    
    public void diminuirQuantidade(int qtd){
        if(this.qtd < qtd)
            System.out.println("Nao a quantidade o suficiente para diminuir!");
        else
            this.qtd -= qtd;
    }
}
