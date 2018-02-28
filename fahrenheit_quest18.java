package Entrada_Saida;

import java.util.Scanner;

public class fahrenheit_quest18 {
    /**
     * Faça um programa que receba uma temperatura em Celsius, calcule e mostre 
     * essa temperatura em Fahrenheit. Sabe-se que F = 180(C + 32)/100.s
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe a temperatura em calsius: ");
        double c = ler.nextDouble();
        
        double F = (180 * (c+32)) / 100;
        System.out.println("A temperatura em Fahrenheit = "+F);
    }
    
}
