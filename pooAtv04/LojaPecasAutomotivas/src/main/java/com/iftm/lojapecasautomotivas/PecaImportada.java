package com.iftm.lojapecasautomotivas;

public class PecaImportada extends Produto {

    private String revendedor;
    private double valorFrete;
    private double valorDolar;
    private double valorImportacao;

    public PecaImportada(int codigo, String nome, double precoCusto, int margemLucro, double precoVenda, String marcaVeiculo, String modeloVeiculo, int anoInicial, int anoFinal, String revendedor, double valorFrete, double valorDolar) {
        super(codigo, nome, precoCusto, margemLucro, precoVenda, marcaVeiculo, modeloVeiculo, anoInicial, anoFinal);
        this.revendedor = revendedor;
        this.valorFrete = valorFrete;
        this.valorDolar = valorDolar;
    }

    public String getRevendedor() {
        return this.revendedor;
    }

    public void setRevendedor(String revendedor) {
        this.revendedor = revendedor;
    }

    public double getValorFrete() {
        return this.valorFrete;
    }

    public void setValorFrete(double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public double getValorDolar() {
        return this.valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }

    public double getValorImportacao() {
        return this.valorImportacao;
    }

    public void setValorImportacao(double valorImportacao) {
        this.valorImportacao = valorImportacao;
    }

    @Override
    public String toString() {
        return  "Peca Importada"
                + "\nRevendedor: " + this.revendedor
                + "\nValor do Frete: R$ " + this.valorFrete
                + "\nValor do Dolar: R$ " + this.valorDolar
                + "\nValor de Importacao: R$ " + this.calcularValorImportacao()
                + super.toString();
    }

    private double calcularValorImportacao() {
        if ((super.getPrecoCusto() / this.valorDolar) > 50.00) {
            this.valorImportacao = (super.getPrecoCusto() * 62) / 100;
        } else {
            this.valorImportacao = 0.00;
        }

        return this.valorImportacao;
    }

    public void imprimirValorImportacao() {
        System.out.println("\nValor de importacao");
        System.out.println("Todo produto acima de 50 dolares e taxado em 62% sobre seu valor.");
        System.out.println("Valor de importacao: R$" + this.calcularValorImportacao());
    }

    @Override
    public void calcularPrecoVenda() {
        double precoCalculado = super.getPrecoCusto() + (super.getPrecoCusto() * super.getMargemLucro() / 100) + this.valorFrete + this.valorImportacao;
        super.setPrecoVenda(precoCalculado);
    }

    @Override
    public void imprimirValorDetalhado() {
        System.out.println("\nDetalhamento do Valor");
        System.out.println("O preco de venda e o preco de  custo + % margem de lucro + (frete + valor da importacao)");
        System.out.println("Preco de venda: " + super.getPrecoCusto() + " + " + (super.getPrecoCusto() * super.getMargemLucro() / 100) + " + " + this.valorFrete  + " + " + this.valorImportacao + " = R$" + super.getPrecoVenda());
    }

}
