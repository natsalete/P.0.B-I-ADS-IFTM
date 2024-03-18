/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iftm.pooatv01;
import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args){
        //10)Faça um programa que leia duas matrizes A e B de tamanho 3 x 3 e calcule a matriz C = A ∗ B.
        
        Scanner scan = new Scanner(System.in);
        
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor para a Matriz-A da linha " + i + ", coluna " + j + ": ");
                matrizA[i][j] = scan.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor para a Matriz-B da linha " + i + ", coluna " + j + ": ");
                matrizB[i][j] = scan.nextInt();
            }
        }
        
        int[][] matrizC = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizC[i][j] = 0;
                for(int k = 0; k < 3; k++){
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        System.out.println("Matriz C = A * B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
