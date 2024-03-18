package com.iftm.bank;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Account ccount = new Account(scan);
        
        System.out.println(ccount);
        
        ccount.deposit(scan);
        
        System.out.println(ccount);
        
        ccount.withdraw(scan);
        
        System.out.println(ccount);
    }
}
