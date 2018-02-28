package Entrada_Saida;

import java.util.Scanner;

public class Peso_grama {
    /**
     *Faça um programa que receba o peso de uma pessoa em quilos, calcule e 
     * mostre esse peso em gramas.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o peso em kg de uma pessoa: ");
        double peso = ler.nextDouble();
        
        double grama = peso * 1000;
        System.out.println("O peso em grama é = " +grama);
    }
    
}
