package com.iftm.nsr.minhaempresa;

public class Cliente extends Pessoa {
    private String filiacao;
    private String naturalidade;
    private int numeroDependentes;
    private double renda;
    private static int numeroTotalCliente = 0;

    public Cliente(String nome, String cpf, String filiacao, String naturalidade, int numeroDependentes, double renda) {
        super(nome, cpf);
        this.filiacao = filiacao;
        this.naturalidade = naturalidade;
        this.numeroDependentes = numeroDependentes;
        this.renda = renda;
        numeroTotalCliente++;
    }

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public static int getNumeroTotalCliente() {
        return numeroTotalCliente;
    }

    public static void setNumeroTotalCliente(int numeroTotalCliente) {
        numeroTotalCliente = numeroTotalCliente;
    }
    
    public void imprimirDadosBasicos() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Renda: " + renda);
    }
}
