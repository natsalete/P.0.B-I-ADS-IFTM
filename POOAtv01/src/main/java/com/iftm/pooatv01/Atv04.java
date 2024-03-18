/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iftm.pooatv01;
import java.util.Scanner;

public class Atv04 {
    public static void main(String[] args) {
        /*4)Leia um vetor de 8 posições e em seguida um valor X qualquer. Seu programa  deverá fazer uma busca do valor de
        X no vetor lido e informar a posição em que foi  encontrado ou se não foi encontrado.  */
         Scanner scan = new Scanner(System.in);
         
         int vetor[] = new int[8];
         
         for(int i = 0; i < 8; i++){
             System.out.println("Digite o " + (i+1) + " numero: ");
             vetor[i] = scan.nextInt();
         }
         
         int x;
         boolean verifica = false;
         
         System.out.println("Digite um numero para busca no vetor: ");
         x = scan.nextInt();
         
         for(int i = 0; i < 8; i++){
             if(vetor[i] == x){
                 System.out.println("O numero digitado esta na posição " + i + " do vetor");
                 verifica = true;
             }
         }
         
         if(!verifica)
             System.out.println("O numero não foi encontrado!");
    
    }
}
