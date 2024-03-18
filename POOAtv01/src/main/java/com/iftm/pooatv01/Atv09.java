/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iftm.pooatv01;
import java.util.Scanner;

public class Atv09 {
    public static void main(String[] args){
        /*9)Faça um algoritmo que leia uma matriz 5 x 5. Leia também um valor de X. 
        O programa deverá fazer uma busca desse valor na matriz e, ao final, escrever a localização 
        (linha e coluna) ou uma mensagem de “não encontrado”.*/
        
        Scanner scan = new Scanner(System.in);
        
        int[][] matriz = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Digite o valor da linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scan.nextInt();
            }
        }
        
        int x;
        boolean verifica = false;
        int linha = -1;
        int coluna = -1;
        
        System.out.println("Digite um numero para busca na matriz: ");
        x = scan.nextInt();
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(matriz[i][j] == x){
                    linha = i;
                    coluna = j;
                    verifica = true;
                }
            }
        }
        
        if(verifica){
            System.out.println("O numero foi encontrado na linha: " + linha + " e coluna: " + coluna);
        }else {
            System.out.println("Numero não encontrado!");
        }
        
        
    }
}
