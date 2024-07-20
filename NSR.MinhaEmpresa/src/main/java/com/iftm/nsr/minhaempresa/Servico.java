package com.iftm.nsr.minhaempresa;

public class Servico {
    private Cliente cliente;
    private Funcionario funcionario;
    private double valorMaoDeObra;
    private double valorPecas;
    private static double comissao = 0.03; // Comissão padrão de 3%
    private static double valorMaoDeObraPadrao = 40.0; // Valor padrão de mão de obra

    // Construtor que recebe Cliente e Funcionario
    public Servico(Cliente cliente, Funcionario funcionario, double valorPecas) {
        this(cliente, funcionario, valorPecas, valorMaoDeObraPadrao);
    }

    // Construtor que recebe Cliente, Funcionario, valor das peças e valor da mão de obra
    public Servico(Cliente cliente, Funcionario funcionario, double valorPecas, double valorMaoDeObra) {
        if (valorMaoDeObra < 50.0) {
            valorMaoDeObra = valorMaoDeObraPadrao;
        }
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.valorPecas = valorPecas;
        this.valorMaoDeObra = valorMaoDeObra;
        calcularComissao();
    }

    // Getters e Setters
    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public double getValorMaoDeObra() {
        return valorMaoDeObra;
    }

    public void setValorMaoDeObra(double valorMaoDeObra) {
        if (valorMaoDeObra >= 50.0) {
            this.valorMaoDeObra = valorMaoDeObra;
        } else {
            this.valorMaoDeObra = valorMaoDeObraPadrao;
        }
    }

    public double getValorPecas() {
        return valorPecas;
    }

    public void setValorPecas(double valorPecas) {
        this.valorPecas = valorPecas;
    }

    public static double getComissao() {
        return comissao;
    }

    public static void setComissao(double comissao) {
        Servico.comissao = comissao;
    }

    public static double getValorMaoDeObraPadrao() {
        return valorMaoDeObraPadrao;
    }

    public static void setValorMaoDeObraPadrao(double valorMaoDeObraPadrao) {
        Servico.valorMaoDeObraPadrao = valorMaoDeObraPadrao;
    }

    // Método para imprimir dados do serviço
    public void imprimirDadosServico() {
        System.out.println("Dados do Cliente:");
        cliente.imprimirDadosBasicos();
        System.out.println("Dados do Funcionario:");
        funcionario.imprimir();
        System.out.println("Valor da Mao de Obra: " + valorMaoDeObra);
        System.out.println("Valor das Pecas: " + valorPecas);
        System.out.println("Valor Total do Servico: " + (valorMaoDeObra + valorPecas));
    }

    // Método privado para calcular comissão
    private void calcularComissao() {
        double comissaoCalculada = valorPecas * comissao;
        funcionario.setComissao(funcionario.getComissao() + comissaoCalculada);
    }
}
