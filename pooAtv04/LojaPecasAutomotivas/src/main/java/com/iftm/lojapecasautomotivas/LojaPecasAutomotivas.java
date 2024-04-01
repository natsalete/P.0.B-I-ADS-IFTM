package com.iftm.lojapecasautomotivas;

public class LojaPecasAutomotivas {

    public static void main(String[] args) {
        
        Peca peca1 = new Peca(0,"nome", 0.00, 0, 0.00 , "marcaVeiculo", "modeloVeiculo",0, 0, "fabricantePeca", 0.00);
        
        peca1.setCodigo(1);
        peca1.setNome("Pneu");
        peca1.setPrecoCusto(300.00);
        peca1.setMargemLucro(10);
        peca1.setMarcaVeiculo("Ford");
        peca1.setModeloVeiculo("Fiesta Sedan");
        peca1.setAnoInicial(2009);
        peca1.setAnoFinal(2032);
        peca1.setFabricantePeca("Pirelli");
        peca1.setTaxaImpostoEstadual(20);
        peca1.calcularPrecoVenda();
        System.out.println(peca1);
        peca1.imprimirValorDetalhado();
        
        System.out.println("======================================================================");
        
        PecaImportada peca2 = new PecaImportada(0,"nome", 0.00, 0, 0.00 , "marcaVeiculo", "modeloVeiculo",0, 0, "revendedor", 0.00, 0.00, 0.00);
        peca2.setCodigo(2);
        peca2.setNome("Banco Traseiro");
        peca2.setPrecoCusto(500.00);
        peca2.setMargemLucro(15);
        peca2.setMarcaVeiculo("Chrysler Town");
        peca2.setModeloVeiculo("Country 2008 3.0");
        peca2.setAnoInicial(2008);
        peca2.setAnoFinal(2045);
        peca2.setRevendedor("Natalia");
        peca2.setValorFrete(150.00);
        peca2.setValorDolar(5.07);
        
        peca2.calcularValorImportacao();
         peca2.calcularPrecoVenda();
        
        System.out.println(peca2);
        peca2.imprimirValorDetalhado();
        peca2.imprimirValorImportacao();
        
    }
} 
