package com.iftm.trab01;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstadual;
    private double faturaMensal;
    private int faixa;
    private int numeroFuncionarios;
    
    public PessoaJuridica(String nome, String endereco, String telefone, int codigo, String cnpj, String inscricaoEstadual, double faturaMensal, int faixa, int numeroFuncionarios){
        super(nome, endereco, telefone, codigo);
        this.cnpj = cnpj ;
        this.inscricaoEstadual = inscricaoEstadual;
        this.faixa = definirFaixa(faturaMensal*12);
        this.numeroFuncionarios = numeroFuncionarios;
        this.faturaMensal = faturaMensal;
    }
    
    
    public String getCnpj(){
        return this.cnpj;
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getInscricaoEstadual(){
        return this.inscricaoEstadual;
    }
    
    public void setInscricaoEstadual(String inscricaoEstadual){
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public double getFaturaMensal(){
        return this.faturaMensal;
    }
    
    public void setFaturaMensal(double faturaMensal){
        this.faturaMensal = faturaMensal;
    }
    
    public int getFaixa(){
        return this.faixa;
    }
    
    public void setFaixa(int faixa){
        this.faixa = faixa;
    }
    
    public int getNumeroFuncionarios(){
        return this.numeroFuncionarios;
    }
    
    public void setNumeroFuncionarios(int numeroFuncionarios){
        this.numeroFuncionarios = numeroFuncionarios;
    }
    
    
    @Override
    public String toString(){
      return super.toString()
        + "\nCNPJ: " + this.cnpj
        + "\nInscricao Estadual: " + this.inscricaoEstadual 
        + "\nFaixa: " + this.faixa
        + "\nNumero de Funcionarios: " + this.numeroFuncionarios
        + "\nFatura Mensal: R$" + this.faturaMensal;
    }
    
    public void imprimirDados() {
        System.out.println("**Dados da Pessoa Juridica:**");
        super.imprimir();
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Inscricaoo Estadual: " + this.inscricaoEstadual);
        System.out.println("Faixa: " + this.faixa);
        System.out.println("Numero de Funcionarios: " + this.numeroFuncionarios);
        System.out.println("Fatura Mensal: R$" + this.faturaMensal);
    }
    
    private double calcularFaturamentoAnual(){
        return this.faturaMensal * 12;
    }
    
    private int definirFaixa(double faturamentoAnual ){
      if(faturamentoAnual <= 180000.00)
          this.faixa = 1;
      else if(faturamentoAnual > 180000.00 && faturamentoAnual <= 360000.00)
          this.faixa = 2;
      else if(faturamentoAnual > 360000.00 && faturamentoAnual <= 720000.00)
          this.faixa = 3;
      else if(faturamentoAnual > 720000.00 && faturamentoAnual <= 1800000.00)
          this.faixa = 4;
      else if(faturamentoAnual > 1800000.00 && faturamentoAnual <= 3600000.00)
          this.faixa = 5;
      else if(faturamentoAnual > 3600000.00 && faturamentoAnual <= 4800000.00)
          this.faixa = 6;
 
        return this.faixa;
    }
    
    public void imprimirFaturamentoAnual(){
        System.out.println("Fatura Anual: R$" + this.calcularFaturamentoAnual());
    }
    
    public void alterarFaturamento(double valor){
        if(valor > 0)
            this.faturaMensal += valor;
        else if(valor < 0)
           this.faturaMensal -= valor;     
    }
    
    public void gerarGuiaDePagamento(){
        if(this.faixa == 1)
            System.out.println("Valor do imposto a ser pago: R$" + this.calcularFaturamentoAnual() * 0.04);
        else if(this.faixa == 2)
            System.out.println("Valor do imposto a ser pago: R$" + this.calcularFaturamentoAnual() * 0.073);
        else if(this.faixa == 3)
            System.out.println("Valor do imposto a ser pago: R$" + this.calcularFaturamentoAnual() * 0.095);
        else if(this.faixa == 4)
            System.out.println("Valor do imposto a ser pago: R$" + this.calcularFaturamentoAnual() * 0.107);
        else if(this.faixa == 5)
            System.out.println("Valor do imposto a ser pago: R$" + this.calcularFaturamentoAnual() * 0.143);
        else if(this.faixa == 6)
            System.out.println("Valor do imposto a ser pago: R$" + this.calcularFaturamentoAnual() * 0.19);
    }
}
