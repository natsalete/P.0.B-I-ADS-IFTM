package com.iftm.pooatv05;

import java.util.Scanner;

public class Dvd extends Item{
    private int duracaoMinutos;

    public Dvd() {
        super();
        this.duracaoMinutos = 0;
    }

    public Dvd(int codigo, String nome, double preco, int duracaoMinutos) {
        super(codigo, nome, preco);
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }
    
    @Override
    public void inserirDados(){
        super.inserirDados();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a duracao em minutos:");
        this.setDuracaoMinutos(scan.nextInt()); 
    }
    
    public void atualizarPreco(){
        double novoPreco = super.getPreco() * 1.1; 
        super.setPreco(novoPreco); 
    }
   
    public void atualizarPreco(int porcentagem){
        if (porcentagem > 0 && porcentagem <= 40) {
            double novoPreco1 = super.getPreco() * (1 + (porcentagem / 100.0));
            super.setPreco(novoPreco1); 
            System.out.println("\nNovo preco com um acrescimo de " + porcentagem + "%:");
            System.out.println("Preco: " + super.getPreco()); 
        } else {
            System.out.println("Erro: Porcentagem invalida. Deve ser entre 0% e 40%.");
        }   
    }
    
}
