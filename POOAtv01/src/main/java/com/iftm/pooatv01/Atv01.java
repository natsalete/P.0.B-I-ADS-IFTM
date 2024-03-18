/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iftm.pooatv01;
import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args) {
        
        /*1) Escreva um algoritmo que solicite ao usuário a entrada de 10 números, e que exiba  o somatório desses números na tela.
        Após exibir a soma, o programa deve mostrar  também os números que o usuário digitou, um por linha.*/
        
        Scanner scan = new Scanner(System.in);
        
 
        int vetor[] = new int[10];
        int soma = 0;
     
         for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero: ");
            int num = scan.nextInt();
            vetor[i] = num;
            soma += num;
        }
        
        System.out.println("Soma = " + soma);
        
        for(int i = 0; i < 10; i++){
            System.out.println(vetor[i]);
        }
        
        
    }
     
}
