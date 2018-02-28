package Entrada_Saida;

import java.util.Scanner;

public class hipotenusa_quest16 {

    /**
     * Faça um programa que receba o valor dos catetos de um triângulo, calcule 
     * e mostre o valor da hipotenusa.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor do 1º cateto: ");
        float a = ler.nextFloat();
        System.out.print("Digite o valor do 2º cateto: ");
        float b = ler.nextFloat();
        
        float h;
        h = (a*a) + (b*b);
        
        System.out.println("O valor da Hipotenusa é = " +Math.sqrt(h));
    }
    
}
