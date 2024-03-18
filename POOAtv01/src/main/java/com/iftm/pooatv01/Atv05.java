/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iftm.pooatv01;
import java.util.Scanner;

public class Atv05 {
    public static void main(String[] args){
        /*5)Faça um algoritmo que carregue um vetor com 15 posições, calcule e mostre o  maior elemento do vetor e 
        em que posição esse elemento se encontra e o menor  elemento do vetor e em que posição esse elemento se encontra.*/
        
        Scanner scan = new Scanner(System.in);
        
        int[] vetor = new int[15];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for (int i = 0; i < 15 ; i++) {
            System.out.printf("Digite o valor da posição " + i + ": ");
            vetor[i] = scan.nextInt();

            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Posição do maior valor: " + posicaoMaior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Posição do menor valor: " + posicaoMenor);
    }
    
}

