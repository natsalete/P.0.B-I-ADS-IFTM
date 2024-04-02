package com.iftm.trab01;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private int codigo;
    
    public Pessoa(String nome, String endereco, String telefone, int codigo){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.codigo = codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;  
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;  
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;  
    }
    
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Codigo: " + this.codigo);
    }
}
