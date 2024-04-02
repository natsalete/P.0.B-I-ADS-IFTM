package com.iftm.trab01;
import java.util.Date;

public class Trab01 {

    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica("Natalia Salete Rodrigues", "Rua Geraldo Elias Rosa, 382 - Irai de Minas - Mg", "+55 34 997304612", 1, "Eduardo Martins de Lima", "Elsiane Maria da Silva", 'F',  new Date(1980, 1, 1) , "10776289608", "MG-145585", "Brasileira", "Pedrinopolis", 1500.00);
        
        pessoa1.imprimirDados();
        pessoa1.exibirSalarioAnual();
        pessoa1.aumentarSalario(15);
        System.out.println("Salaria com Aumento de % : R$" + pessoa1.getSalario());
        pessoa1.aumentarSalario(450);
        System.out.println("Salaria com Aumento : R$" + pessoa1.getSalario());
        pessoa1.temQuePagarIR(pessoa1.getSalario()*12);
        pessoa1.imprimePrestacaoIR(3,147.375 );
        
        
        System.out.println("=============================================================");
        
        PessoaJuridica pessoa2 = new PessoaJuridica("Eduardo Martins de Lima", "Rua Geraldo Elias Rosa, 382 - Irai de Minas - Mg", "+55 34 920005807", 2, "47.154.594/0001-59", "1478955225", 30000.00, 0, 3);
        
        pessoa2.imprimirDados();
        pessoa2.imprimirFaturamentoAnual();
        pessoa2.alterarFaturamento(-454.00);
        pessoa2.alterarFaturamento(350.00);
        pessoa2.gerarGuiaDePagamento();


        
    }
}
