package com.iftm.pooatv03;

public class PooAtv03 {

    public static void main(String[] args) {
        ItensLojaInformática itens = new ItensLojaInformática("0","0",0, 0.0);
        
        itens.setNumero("111111");
        itens.setDescricao("mouse");
        itens.setPreco(50.00);
        itens.setQtd(1);
        
        
        System.out.println("Numero: " + itens.getNumero());
        System.out.println("Descticao: " + itens.getDescricao());
        System.out.println("Preco: R$ " + itens.getPreco());
        System.out.println("Quantidade: " + itens.getQtd());
        System.out.println("Valor Total: " + itens.getTotalItens());
        
        itens.aumentarQuantidade(2);
        System.out.println("Quantidade atualizada: " + itens.getQtd());
        System.out.println("Valor Total atualizado: " + itens.getTotalItens());
        
        itens.diminuirQuantidade(10);
        System.out.println("Quantidade atualizada: " + itens.getQtd());
        System.out.println("Valor Total atualizado: " + itens.getTotalItens());
        
        System.out.println("\n\n");
        
        itens.setNumero("2222");
        itens.setDescricao("Teclado");
        itens.setPreco(180.00);
        itens.setQtd(-1);
        
        System.out.println("Numero: " + itens.getNumero());
        System.out.println("Descticao: " + itens.getDescricao());
        System.out.println("Preco: R$ " + itens.getPreco());
        System.out.println("Quantidade: " + itens.getQtd());
        System.out.println("Valor Total: " + itens.getTotalItens());
        
        itens.aumentarQuantidade(2);
        System.out.println("Quantidade atualizada: " + itens.getQtd());
        System.out.println("Valor Total atualizado: " + itens.getTotalItens());
        
        itens.diminuirQuantidade(1);
        System.out.println("Quantidade atualizada: " + itens.getQtd());
        System.out.println("Valor Total atualizado: " + itens.getTotalItens());
        
        System.out.println("\n\n");
        
        itens.setNumero("3333");
        itens.setDescricao("Monitor");
        itens.setPreco(580.00);
        itens.setQtd(2);
        
        System.out.println("Numero: " + itens.getNumero());
        System.out.println("Descticao: " + itens.getDescricao());
        System.out.println("Preco: R$ " + itens.getPreco());
        System.out.println("Quantidade: " + itens.getQtd());
        System.out.println("Valor Total: " + itens.getTotalItens());
        
        itens.aumentarQuantidade(5);
        System.out.println("Quantidade atualizada: " + itens.getQtd());
        System.out.println("Valor Total atualizado: " + itens.getTotalItens());
        
        itens.diminuirQuantidade(7);
        System.out.println("Quantidade atualizada: " + itens.getQtd());
        System.out.println("Valor Total atualizado: " + itens.getTotalItens());
        
        
        
        
    }
}
