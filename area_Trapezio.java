package Entrada_Saida;

import java.util.Scanner;

public class area_Trapezio {
    /**
     * Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que:
     * A = ((base maior + base menor) * altura ) / 2
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a base maior: ");
        int base_Ma = ler.nextInt();
        System.out.print("Digite a base menor: ");
        int base_Me = ler.nextInt();
        System.out.print("Digite a altura: ");
        double alt = ler.nextDouble();
        
        double A = ((base_Ma + base_Me) * alt) / 2;
        System.out.println("A área é = " +A);
    }
    
}
