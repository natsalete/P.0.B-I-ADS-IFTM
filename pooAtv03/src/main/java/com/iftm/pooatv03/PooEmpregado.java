package com.iftm.pooatv03;

public class PooEmpregado {
    public static void main(String[] args) {
    
        Empregado emp = new Empregado("0","0",0);
        
        emp.nome = "Natalia";
        emp.sobrenome = "Salete";
        emp.salarioMensal = 1500.00;
        
        System.out.println("Nome do Empregado: " +  emp.getNome());
        System.out.println("Sobrenome do Empregado: " + emp.getSobrenome());
        System.out.println("Salario Mensal: R$ " + emp.getSalarioMensal());
        System.out.println("Salario Anual: R$ " + emp.getsalarioAnual()); 
        emp.AumentoSalario(10);
        System.out.println("Salario Anual com aumento: " + emp.getsalarioAnual());
        
        System.out.println("\n\n");
        
        emp.nome = "Julia";
        emp.sobrenome = "Gabriele";
        emp.salarioMensal = 1200.00;
        
        System.out.println("Nome do Empregado: " +  emp.getNome());
        System.out.println("Sobrenome do Empregado: " + emp.getSobrenome());
        System.out.println("Salario Mensal: R$ " + emp.getSalarioMensal());
        System.out.println("Salario Anual: R$ " + emp.getsalarioAnual()); 
        emp.AumentoSalario(10);
        System.out.println("Salario Anual com aumento: " + emp.getsalarioAnual());
        
    }
}
