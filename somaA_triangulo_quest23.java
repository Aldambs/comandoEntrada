package Entrada_Saida;

import java.util.Scanner;

public class somaA_triangulo_quest23 {
    /**
     * Faça um programa que receba a medida de dois ângulos de um triângulo,
     * calcule e mostre a medida do terceiro ângulo. Sabe-se que a soma dos
     * ângulos de um triângulo é 180.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o 1º ângulo: ");
        double ang1 = ler.nextDouble();
        System.out.print("Digite o º ângulo: ");
        double ang2 = ler.nextDouble();
        
        double soma = (ang1+ang2)/180;
        System.out.println("A soma dos ângulos é = " +soma);
    }
    
}
