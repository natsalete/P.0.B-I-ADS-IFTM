/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iftm.pooatv01;
import java.util.Scanner;

public class Atv02 {
   public static void main(String[] args) {
       /*2)Escreva um algoritmo que solicite ao usuário a entrada de 10 nomes, e que exiba a  lista desses nomes na tela.
        Após exibir essa lista, o programa deve mostrar também  os nomes na ordem inversa em que o usuário os digitou, um por linha.*/
       
       Scanner scan = new Scanner(System.in);
       
       
       String nome[] = new String[10];
       
       for(int i = 0; i < 10; i++){
           System.out.println("Digite o " + (i+1) + "° nome: ");
           nome[i] = scan.next();
       }
       System.out.println("Lista de nomes: ");
       for(int i = 0; i < 10; i++){
           System.out.println(nome[i]);
       }
       
       System.out.println("Lista inversa de nomes: ");
       for(int i = 9; i >= 0; i--){
           System.out.println(nome[i]);
       }
       
   } 
}
