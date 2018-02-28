package Entrada_Saida;

import java.util.Scanner;

public class Multiplicação {
    /**
     *Faça um programa que receba três números, calcule e mostre a multiplicação 
     * desses números.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o 1º número: ");
        int n1 = input.nextInt();
        System.out.print("Digite o 2º número: ");
        int n2 = input.nextInt();
        System.out.print("Digite o 3º número: ");
        int n3 = input.nextInt();
        
        int mult = n1 * n2 * n3;
        
        System.out.println("A multiplicação é = " +mult);
    }
    
}
