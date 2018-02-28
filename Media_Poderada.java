package Entrada_Saida;

import java.util.Scanner;

public class Media_Poderada {
    /**
     * Faça um programa que receba duas notas, calcule e mostre a média ponderada
     * dessas notas, considerando peso 2 para a primeira nota e peso 3 para a 
     * segunda nota.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a 1º nota: ");
        float not1 = ler.nextFloat();
        System.out.print("Digite a 2º nota: ");
        float not2 = ler.nextFloat();
        float med = (not1 * 2 + not2 * 3) / (2 + 3);
        System.out.print("A média poderada é = " +med);
    }
    
}
