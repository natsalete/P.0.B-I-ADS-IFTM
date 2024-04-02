package com.iftm.trab01;

import java.util.Date;

public class PessoaFisica extends Pessoa {

    private String nomePai;
    private String nomeMae;
    private char sexo;
    private Date dataDeNascimento;
    private String cpf;
    private String rg;
    private String nacionalidade;
    private String naturalidade;
    private double salario;

    public PessoaFisica(String nome, String endereco, String telefone, int codigo, String nomePai, String nomeMae, char sexo, Date dataDeNascimento, String cpf, String rg, String nacionalidade, String naturalidade, double salario) {
        super(nome, endereco, telefone, codigo);
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.salario = salario;
    }

    public String getNomePai() {
        return this.nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return this.nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNaturalidade() {
        return this.naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

     
    public void imprimirDados() {
        System.out.println("**Dados da Pessoa Fisica:**");
        super.imprimir();
        System.out.println("Nome do Pai: " + this.nomePai);
        System.out.println("Nome da Mae: " + this.nomeMae);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Data de Nascimento: " + this.dataDeNascimento);
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Naturalidade: " + this.naturalidade);
        System.out.println("Salario: R$" + this.salario);
    }

    public void exibirSalarioAnual() {
        System.out.println(super.getNome());
        System.out.println("Salaria Anual: R$" + calcularSalarioAnual());
    }

    public void aumentarSalario(double porcentagem) {
        this.salario = this.salario * ((porcentagem / 100) + 1);
    }

    public void aumentarSalario(int valor) {
        this.salario += valor;
    }

    private double calcularSalarioAnual() { 
        return this.salario * 12;
    }

    public void temQuePagarIR(double salarioAnual) {
        double salarioMensal = salarioAnual / 12;

        if (salarioMensal < 1903.99) {
            System.out.println("Não tem que pagar o Imposto de Renda!");
        } else {
            System.out.println("Valor do IR: R$" + this.calculaIR(salarioAnual));
        }
    }

    private double calculaIR(double salarioAnual) {
        double salarioMensal = salarioAnual / 12;
        if (salarioMensal > 1903.99 && salarioMensal < 2826.65) {
            return salarioMensal * 0.075;
        } else if (salarioMensal >= 2826.65 && salarioMensal < 3751.05) {
            return salarioMensal * 0.15;
        } else if (salarioMensal >= 3751.05 && salarioMensal < 4664.68) {
            return salarioMensal * 0.225;
        } else if (salarioMensal >= 4664.68) {
            return salarioMensal * 0.275;
        } else {
            return 0.00;
        }
    }

    public void imprimePrestacaoIR(int parcelas, double valorImposto) {
        if (parcelas < 2 || parcelas > 8) {
            System.out.println("Numero de parcelas invalido!\nNumero maximo de parcelas e 8 e o minimo e 2.");
        } else {
            System.out.println("Valor de cada parcela: R$" + valorImposto / parcelas);
        }
    }

}
