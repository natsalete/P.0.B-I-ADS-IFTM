package com.iftm.nsr.minhaempresa;

public abstract class Pessoa {

    private int codigo;
    private String nome;
    private String cpf;
    private static int numeroTotalPessoa = 0;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = numeroTotalPessoa++;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public static int getNumeroTotalPessoa() {
        return numeroTotalPessoa;
    }

    public static void setNumeroTotalPessoa(int aNumeroTotalPessoa) {
        numeroTotalPessoa = aNumeroTotalPessoa;
    }
  
  
    public void imprimir(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
    
    
}

