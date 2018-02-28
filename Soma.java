package Entrada_Saida;

import java.util.Scanner;

public class Soma {
    /**
     * Faça um programa que receba quatro número e calcule e mostre a soma dos nº:
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o 1º número: ");
        int n1 = input.nextInt();
        System.out.print("Digite o 2º número: ");
        int n2 = input.nextInt();
        System.out.print("Digite o 3º número: ");
        int n3 = input.nextInt();
        System.out.print("Digite o 4º número: ");
        int n4 = input.nextInt();
        
        int soma = n1 + n2 + n3 + n4;
        
        System.out.println("A soma é = " +soma);
    }
    
}
