/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iftm.pooatv01;
import java.security.SecureRandom;
//import java.util.concurrent.ThreadLocalRandom;

public class Atv07 {
    public static void main(String[] args){
        /*7)Gerar 100 números aleatórios e armazená-los em um vetor. Exibir o vetor.*/

        int vetor[] = new int[100];
        
        SecureRandom rand = new SecureRandom();

        for(int i = 0; i < 100; i++){
            vetor[i] = rand.nextInt();
        }
      
        for(int i = 0; i < 100; i++){
           System.out.println("Numero: " + vetor[i]);
       }
        
        /*int min = 0;
        int max = 100;
    
        int vetor2[] = new int[100];
        
        for(int i = 0; i < 100; i++){
            vetor2[i] = ThreadLocalRandom.current().nextInt(min, max);
        }
        
        for(int i = 0; i < 100; i++){
           System.out.println("Inteiro aleatório entre " + min + " e " + max + " : " + vetor2[i]);
       }*/
        
    }
}
