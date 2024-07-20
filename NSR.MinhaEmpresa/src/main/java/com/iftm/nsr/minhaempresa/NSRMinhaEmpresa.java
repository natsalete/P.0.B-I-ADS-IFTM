package com.iftm.nsr.minhaempresa;

public class NSRMinhaEmpresa {

    public static void main(String[] args) {
         // Criando objetos do tipo Funcionario
        Funcionario funcionario1 = new Funcionario("Joao", "123.456.789-00", 2000.0, 300.0);
        Funcionario funcionario2 = new Funcionario("Maria", "987.654.321-00", 2500.0, 400.0);

        // Criando objetos do tipo Cliente
        Cliente cliente1 = new Cliente("Natalia", "111.222.333-44", "Joao e Maria", "Brasileiro", 2, 5000.0);
        Cliente cliente2 = new Cliente("Ana", "555.666.777-88", "Pedro e Paula", "Brasileira", 1, 4500.0);

        // Imprimindo dados dos funcionários
        funcionario1.imprimir();
        System.out.println("=============================================================");
        funcionario2.imprimir();

        // Imprimindo dados dos clientes
        System.out.println("==============================================================");
        cliente1.imprimir();
        System.out.println("===============================================================");
        cliente2.imprimir();

        // Exibindo a quantidade de pessoas criadas
        System.out.println("================================================================");
        System.out.println("Total de pessoas: " + Pessoa.getNumeroTotalPessoa());
        System.out.println("===================================================================");
        
        // Aumentando o salário dos funcionários
        funcionario1.aumentarSalario();
        funcionario2.aumentarSalario(30);
        funcionario1.aumentarSalario(60); // Esse aumento deve exibir uma mensagem de erro

        // Imprimindo dados básicos dos clientes criados
        System.out.println("==================================================================");
        cliente1.imprimirDadosBasicos();
        System.out.println("==================================================================");
        cliente2.imprimirDadosBasicos();

        // Exibindo a quantidade de funcionários e clientes criados
        System.out.println("===================================================================");
        System.out.println("Total de funcionarios: " + Funcionario.getNumeroTotalFuncionario());
        System.out.println("Total de clientes: " + Cliente.getNumeroTotalCliente());

        // Definindo a comissão padrão e o valor da mão de obra padrão
        Servico.setComissao(0.03);
        Servico.setValorMaoDeObraPadrao(40.0);

        // Criando objetos do tipo Serviço
        Servico servico1 = new Servico(cliente1, funcionario1, 500.0);
        Servico servico2 = new Servico(cliente2, funcionario2, 700.0, 60.0);
        Servico servico3 = new Servico(cliente1, funcionario2, 300.0, 20.0);

        // Imprimindo dados dos serviços
        System.out.println("=============================================================");
        servico1.imprimirDadosServico();
        System.out.println("=============================================================");
        servico2.imprimirDadosServico();
        System.out.println("==============================================================");
        servico3.imprimirDadosServico();

        // Imprimindo o pagamento dos funcionários
        System.out.println("=================================================================");
        System.out.println("Pagamento dos funcionarios:");
        funcionario1.imprimirValorFinalMes();
        funcionario2.imprimirValorFinalMes();
    }
}
