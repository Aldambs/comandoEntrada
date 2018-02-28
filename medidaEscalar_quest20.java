package Entrada_Saida;

import java.util.Scanner;

public class medidaEscalar_quest20 {

    /**
     * Faça um programa que receba a medida do ângulo formado por uma escada 
     * apoiada no chão e a distância que a escada está da parede. Calcule e mostre 
     * a medida da escada para que se possa alcançar a ponta da escada.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float med_Ang, dist, med_Esca;
        System.out.print("Informe a medida do ângulo: ");
        med_Ang = ler.nextFloat();
        System.out.print("Informe a distância: ");
        dist = ler.nextFloat();
        
        med_Esca = med_Ang / dist;
        System.out.println("A medida escalar é = " +med_Esca);
    }
    
}
