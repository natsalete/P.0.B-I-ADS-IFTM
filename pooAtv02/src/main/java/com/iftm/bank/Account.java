package com.iftm.bank;
import java.util.Scanner;

public class Account {
    private String name;
    private int numberCcount;
    private double balance;
    
    
   public Account(Scanner scan) {
        System.out.print("Titular da conta: ");
        this.name = scan.nextLine();

        System.out.printf("Numero da conta: ");
        this.numberCcount = scan.nextInt();

        System.out.println("Ha um deposito inicial (s/n)?");
        char checks = scan.next().charAt(0);

        if (checks == 's') {
            System.out.printf("Digite o valor do deposito inicial: ");
            this.balance = scan.nextDouble();
        } else {
            this.balance = 0.00;
        }
    }
        
    @Override
    public String toString(){
        return "Dados da conta:\n" +
                "Conta: " + this.numberCcount +
              ", Titular: " + this.name +
              ", Saldo: $ " + this.balance;
    }
    
    public void deposit(Scanner scan){
        System.out.printf("Digite o valor do deposito:");
        double depositMoney = scan.nextDouble();
        this.balance += depositMoney;
    }
    
    public void withdraw(Scanner scan) {
        System.out.printf("Digite o valor do saque: ");
        double withdrawMoney = scan.nextDouble();

        if (this.balance - withdrawMoney - 5.00 < 0) {
            System.out.println("Operacao nao realizada. Saldo Insuficiente!");
        } else {  
            this.balance -= withdrawMoney + 5.00;
        }
    }
}
