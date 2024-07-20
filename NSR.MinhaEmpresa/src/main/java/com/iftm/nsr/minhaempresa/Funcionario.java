package com.iftm.nsr.minhaempresa;

public class Funcionario extends Pessoa {
    private int numeroRegistro;
    private double salario;
    private double comissao;
    private static int numeroTotalFuncionario = 0;

    public Funcionario(String nome, String cpf, double salario, double comissao) {
        super(nome, cpf);
        this.salario = salario;
        this.comissao = comissao;
        this.numeroRegistro = numeroTotalFuncionario++;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public static int getNumeroTotalFuncionario() {
        return numeroTotalFuncionario;
    }

    public static void setNumeroTotalFuncionario(int numeroTotalFuncionario) {
        numeroTotalFuncionario = numeroTotalFuncionario;
    }
    
    @Override
    public void imprimir() {
        super.imprimir(); // Imprime dados da superclasse Pessoa
        System.out.println("Numero de Registro: " + numeroRegistro);
        System.out.println("Salario: " + salario);
        System.out.println("Comissao: " + comissao);
    }
    
    public void aumentarSalario(){
        this.salario *= 1.10;
        imprimirMensagem("Salario aumentado em 10%");
    }
    
    public void aumentarSalario(int porcentagem){
        if (porcentagem <= 50) {
            this.salario *= (100 + porcentagem / 100.0);
            imprimirMensagem("Salario aumentado em " + porcentagem + "%");
        } else {
            imprimirMensagem("Erro: Aumento nao pode ser superior a 50%");
        }
    }
    
    private void imprimirMensagem(String mensagem) {
        System.out.println("Numero de Registro: " + this.numeroRegistro);
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + this.salario);
        System.out.println("Mensagem: " + mensagem);
    }
    
     public void imprimirValorFinalMes() {
        double valorFinal = salario + comissao;
        System.out.println("Nome: " + getNome());
        System.out.println("Valor final do mes: " + valorFinal);
    }
    
}
