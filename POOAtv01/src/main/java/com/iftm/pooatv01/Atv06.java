/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iftm.pooatv01;
import java.util.Scanner;

public class Atv06 {
    public static void main(String[] args){
    /*6)Ler um vetor com 20 números inteiros e apresentar o resultado da multiplicação  dos valores pelos seus índices.*/
        
        Scanner scan = new Scanner(System.in);
        
        int vetor[] = new int [20];
        
        for (int i = 0; i < 20 ; i++) {
            System.out.printf("Digite o valor da posição " + i + ": ");
            vetor[i] = scan.nextInt();
        }
        
        for (int i = 0; i < 20 ; i++) {
            System.out.println(vetor[i] + " * " + i + " = " +(vetor[i]*i));
        }
    }
}
