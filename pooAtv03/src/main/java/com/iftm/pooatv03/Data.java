package com.iftm.pooatv03;

/*3) Crie uma classe em Java chamada Data que inclui três informações como variáveis de instância – atributos – mês 
(int), dia (int) e ano (int). A classe deve ter métodos get e set para cada variável e um construtor que inicializa as 
variáveis e assume que os valores fornecidos são corretos. Forneça um método displayData que exibe o dia, o 
mês e o ano separados por barras normais ( / ). Escreva um aplicativo de teste chamado DataTeste que 
demonstra as capacidades da classe Data.*/

public class Data {
    int dia;
    int mes;
    int ano;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public int getDia(){
        return this.dia;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAno(){
        return this.ano;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public String displayData(){
        return this.dia + "/" +
              this.mes + "/" +
              this.ano + "\n";
    }
}

