package com.iftm.lojapecasautomotivas;

public abstract class Produto {

    private int codigo;
    private String nome;
    private double precoCusto;
    private int margemLucro;
    private double precoVenda;
    private String marcaVeiculo;
    private String modeloVeiculo;
    private int anoInicial;
    private int anoFinal;
    
    public Produto(int codigo, String nome, double precoCusto, int margemLucro, double precoVenda, String marcaVeiculo, String modeloVeiculo, int anoInicial, int anoFinal){
        this.codigo = codigo;
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
        this.precoVenda = precoVenda;
        this.marcaVeiculo = marcaVeiculo;
        this.modeloVeiculo = modeloVeiculo;
        this.anoInicial = anoInicial;
        this.anoFinal = anoFinal;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    } 
    
     public int getCodigo(){
        return this.codigo;
    }
    
    public void setNome(String nome){
       this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setPrecoCusto(double precoCusto){
       this.precoCusto = precoCusto;
    }
    
    public double getPrecoCusto(){
        return this.precoCusto;
    }
    
    public void setMargemLucro(int margemLucro){
       this.margemLucro = margemLucro;
    }
    
    public int getMargemLucro(){
        return this.margemLucro;
    }
    
    public void setPrecoVenda(double precoVenda){
       this.precoVenda = precoVenda;
    }
    
    public double getPrecoVenda(){
        return this.precoVenda;
    }
    
    public void setMarcaVeiculo(String marcaVeiculo){
       this.marcaVeiculo = marcaVeiculo;
    }
    
    public String getMarcaVeiculo(){
        return this.marcaVeiculo;
    }
    
    public void setModeloVeiculo(String modeloVeiculo){
       this.modeloVeiculo = modeloVeiculo;
    }
    
    public String getModeloVeiculo(){
        return this.modeloVeiculo;
    }
    
    public void setAnoInicial(int anoInicial){
       this.anoInicial = anoInicial;
    }
    
    public int getAnoInicial(){
        return this.anoInicial;
    }
    
    public void setAnoFinal(int anoFinal){
       this.anoFinal = anoFinal;
    }
    
    public int getAnoFinal(){
        return this.anoFinal;
    }
      
    
    @Override
    public String toString() {
        return "\nProduto "
                + "Codigo: " + this.codigo
                + "\nNome: " + this.nome
                + "\nPreco de Custo: " + this.precoCusto
                + "\nMargem de Lucro: " + this.margemLucro + "%"
                + "\nPreco de venda: " + this.precoVenda
                + "\nMarca do Veiculo: " + this.marcaVeiculo
                + "\nModelo do Veiculo: " + this.modeloVeiculo
                + "\nAno Inicial: " + this.anoInicial
                + "\nAno Final: " + this.anoFinal;
    }
    
    public abstract void calcularPrecoVenda();
    
    public abstract void imprimirValorDetalhado();

}
