package com.iftm.bank;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Account ccount = new Account(scan);
        
        System.out.println(ccount);
        
        System.out.printf("Informe o valor do deposito:");
        ccount.deposit(scan.nextDouble());
        
        System.out.println(ccount);
        
        System.out.printf("Digite o valor do saque: ");
        ccount.withdraw(scan.nextDouble());
        
        System.out.println(ccount);
    }
}
