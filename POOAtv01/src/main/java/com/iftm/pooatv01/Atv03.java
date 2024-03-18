/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iftm.pooatv01;
import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {
       /*3)Crie um programa que solicite a entrada de 10 números pelo usuário,  armazenando-os em um vetor, e então monte outro vetor com 
       os valores do primeiro  multiplicados por 5. Exiba os valores dos dois vetores na tela, simultaneamente, em  duas colunas (um em cada coluna), uma posição por linha.*/
       
       Scanner scan = new Scanner(System.in);
       
       
       int vetor[] = new int[10];
       
       for(int i = 0; i < 10; i++){
           System.out.println("Digite o " + (i+1) + "° numero: ");
           vetor[i] = scan.nextInt();
       }
       
       int vetor2[] = new int [10];
       
 
       for(int i = 0; i < 10; i++){
           vetor2[i] = vetor[i] * 5;
       }
       
   
       for(int i = 0; i < 10; i++){
           System.out.println("Numero: " + vetor[i] + "| " + vetor[i] + " * 5 = " + vetor2[i]);
       }
       
   } 
}
