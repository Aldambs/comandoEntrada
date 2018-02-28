package Entrada_Saida;

import java.util.Scanner;

public class area_Losango {
    /**
     * Faça um programa que calcule e mostre a área de um losango.
       Sabe-se que: A = (diagonal maior * diagonal menor) / 2
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a diagonal maior: ");
        int diagMa = ler.nextInt();
        System.out.print("Digite a diagonal menor: ");
        int diagMe = ler.nextInt();
        
        int area = (diagMa * diagMe) / 2;
        System.out.println("A área do losango é = " +area);
    }
    
}
