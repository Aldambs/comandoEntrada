package Entrada_Saida;

import java.util.Scanner;

public class Poligonio_quest_22 {
    /**
     * Faça um programa que receba o número de lados de um polígono convexo, 
     * calcule e mostre o número de diagonais desse polígono, onde N é o número 
     * de lados do polígono. Sabe-se que ND = N(N -3)/2.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o número de lados de um poligono: ");
        float n = ler.nextFloat();
        
        float nd = n * (n-3) / 2;
        System.out.println("Diagonais é = " +nd);
    }
    
}
