package Entrada_Saida;

import java.util.Scanner;

public class Subtração {
    /**
     * Faça um programa que receba dois números, calcule e mostre a subtração do 
     * primeiro número pelo segundo.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o 1º número: ");
        int n1 = input.nextInt();
        System.out.print("Digite o 2º número: ");
        int n2 = input.nextInt();
        
        double sub = n1 - n2;
        
        System.out.println("A subtração é = " +sub);
        
    }
    
}
