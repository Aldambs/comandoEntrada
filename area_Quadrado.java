package Entrada_Saida;

import java.util.Scanner;

public class area_Quadrado {
    /**
     *Faça um programa que calcule e mostre a área de um quadrado. Sabe-se que: 
     * A = lado * lado 
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o 1º lado: ");
        double ld1 = ler.nextDouble();
        System.out.print("Digite o 2º lado: ");
        double ld2 = ler.nextDouble();
        
        double area = ld1 + ld2;
        System.out.println("A área do quadrado é = " +area);
    }
    
}
