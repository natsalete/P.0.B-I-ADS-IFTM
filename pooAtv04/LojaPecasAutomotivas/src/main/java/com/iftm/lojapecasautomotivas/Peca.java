package com.iftm.lojapecasautomotivas;

public class Peca extends Produto {

    private String fabricantePeca;
    private double taxaImpostoEstadual;

    public Peca(int codigo, String nome, double precoCusto, int margemLucro, double precoVenda, String marcaVeiculo, String modeloVeiculo, int anoInicial, int anoFinal, String fabricantePeca, double taxaImpostoEstadual) {
        super(codigo, nome, precoCusto, margemLucro, precoVenda, marcaVeiculo, modeloVeiculo, anoInicial, anoFinal);
        this.fabricantePeca = fabricantePeca;
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }

    public String getFabricantePeca() {
        return this.fabricantePeca;
    }

    public void setFabricantePeca(String fabricantePeca) {
        this.fabricantePeca = fabricantePeca;
    }

    public double getTaxaImpostoEstadual() {
        return this.taxaImpostoEstadual;
    }

    public void setTaxaImpostoEstadual(double taxaImpostoEstadual) {
        this.taxaImpostoEstadual = taxaImpostoEstadual;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPeca"
                + "\nFabricante da Peca: " + this.fabricantePeca
                + "\nTaxa de Imposto Estadual: " + this.taxaImpostoEstadual + "%";
    }

    @Override
    public void calcularPrecoVenda() {
        double precoCalculado = super.getPrecoCusto() + (super.getPrecoCusto() * super.getMargemLucro() / 100) + (super.getPrecoCusto() * this.taxaImpostoEstadual / 100);
        super.setPrecoVenda(precoCalculado);
    }

    @Override
    public void imprimirValorDetalhado() {
        System.out.println("\nDetalhamento do Valor");
        System.out.println("O preco de venda e o preco de  custo + % margem de lucro + taxa de imposto de 20% sobre o preco de custo.");
        System.out.println("Preco de venda: " + super.getPrecoCusto() + " + " + (super.getPrecoCusto() * super.getMargemLucro() / 100) + " + " + (super.getPrecoCusto() * this.taxaImpostoEstadual / 100) + " = R$" + super.getPrecoVenda());
    }

}
