package com.iftm.pooatv05;
import java.util.Scanner;

public abstract class Item {
    private int codigo;
    private String nome;
    private double preco;
    
    public Item() {
        this.codigo = 0;
        this.nome = "";
        this.preco = 0.0;
    
    }
  
    public Item(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void inserirDados(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o codigo do produto:");
        this.setCodigo(scan.nextInt());
        scan.nextLine();
        System.out.println("Digite o nome do produto:");
        this.setNome(scan.nextLine());
        System.out.println("Digite o preco do produto:");
        this.setPreco(scan.nextDouble());
    }
    
}
