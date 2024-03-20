package com.iftm.pooatv03;

/*2) Crie uma classe em Java chamada Empregado. Essa classe possui três partes de informações como variáveis de 
instância – atributos – nome (String), sobrenome (String) e um salário mensal (double). A classe deve métodos 
get e set para cada variável de instância. Escreva um aplicativo chamado PooEmpregado e crie dois objetos 
Empregado e exibe o salário anual de cada objeto. Então dê a cada Empregado um aumento de 10% e exiba 
novamente o salário anual de cada Empregado. */


public class Empregado {
    String nome;
    String sobrenome;
    double salarioMensal;
    
    
    public Empregado(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }
    
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public double getSalarioMensal(){
        return this.salarioMensal;
    }
    
    public void setSalarioMensal(double salarioMensal){
        this.salarioMensal = salarioMensal;
    }
    
    public double getsalarioAnual(){
        return this.salarioMensal * 12;
    }
    
    public void  AumentoSalario(int aumento){
        this.salarioMensal = (this.salarioMensal * 110) / 100;
    }

}
