package com.iftm.pooatv05;
import java.util.Scanner;

public class Cd extends Item{
    private int numfaixas;

    public Cd() {
        super();
        this.numfaixas = 0;
    }

    public Cd(int codigo, String nome, double preco, int numfaixas) {
        super(codigo, nome, preco);
        this.numfaixas = numfaixas;
    }
    
    public int getNumfaixas() {
        return numfaixas;
    }

    public void setNumfaixas(int numfaixas) {
        this.numfaixas = numfaixas;
    }
    
   
    @Override
    public void inserirDados(){
       super.inserirDados();
       Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero de faixas:");
        this.setNumfaixas(scan.nextInt());
    }
    
}
