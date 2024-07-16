package com.iftm.pooatv05;

public class PooAtv05 {

    public static void main(String[] args) {
        Cd  cd = new Cd();
        
        cd.inserirDados();
        
        System.out.println("\nDados do Cd:");
        System.out.println("Codigo: " + cd.getCodigo());
        System.out.println("Nome: " + cd.getNome());
        System.out.println("Preco: " + cd.getPreco());
        System.out.println("Marca: " + cd.getNumfaixas());
        
        System.out.println("============================================\n");
        
        Dvd dvd1 = new Dvd();
        
        dvd1.inserirDados();
        
        System.out.println("\nDados do Dvd:");
        System.out.println("Codigo: " + dvd1.getCodigo());
        System.out.println("Nome: " + dvd1.getNome());
        System.out.println("Preco: " + dvd1.getPreco());
        System.out.println("Duracao em minutos: " + dvd1.getDuracaoMinutos());
        
        dvd1.atualizarPreco();
        System.out.println("Novo preco com um acrescimo de 10%.");
        System.out.println("Preco: " + dvd1.getPreco());
        
        System.out.println("============================================\n");
        
        Dvd dvd2 = new Dvd();
        
        dvd2.inserirDados();
        
        System.out.println("\nDados do Dvd:");
        System.out.println("Codigo: " + dvd2.getCodigo());
        System.out.println("Nome: " + dvd2.getNome());
        System.out.println("Preco: " + dvd2.getPreco());
        System.out.println("Duracao em minutos: " + dvd2.getDuracaoMinutos());
        
        dvd2.atualizarPreco();
        System.out.println("\nNovo preco com um acrescimo de 10%.");
        System.out.println("Preco: " + dvd2.getPreco());
        
        dvd2.atualizarPreco(25);
        dvd2.atualizarPreco(56);
        
    }
}
