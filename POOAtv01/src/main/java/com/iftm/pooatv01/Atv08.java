/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iftm.pooatv01;
import java.util.Scanner;

public class Atv08 {
    public static void main(String[] agrs){
        /*8)Construa uma matriz 8 x 4. Faça um algoritmo que leia valores inteiros para as 2 primeiras colunas da matriz. 
        Ao final da leitura, faça o preenchimento da terceira coluna com a soma dos 2 primeiros valores armazenados na 
        linha e a quarta coluna com a multiplicação dos 2 primeiros valores da linha. */
        
        Scanner scan = new Scanner(System.in);
 
        int[][] matriz = new int[8][4];

        // Leitura das 2 primeiras colunas
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Digite o valor da linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = scan.nextInt();
            }
        }

        // Preenchimento da terceira coluna
        for (int i = 0; i < 8; i++) {
            matriz[i][2] = matriz[i][0] + matriz[i][1];
        }

        // Preenchimento da quarta coluna
        for (int i = 0; i < 8; i++) {
            matriz[i][3] = matriz[i][0] * matriz[i][1];
        }

        // Mostra a matriz
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
