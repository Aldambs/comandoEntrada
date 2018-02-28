package Entrada_Saida;

import java.util.Scanner;

public class raio_quest17 {
    /**
     * Faça um programa que receba o raio, calcule e mostre:
       a) o comprimento de uma esfera, sabe-se que C = 1πR;
       b) a área de uma esfera, sabe-se que A = πR²;
       c) o volume de uma esfera, sabe-se que V = 3/4πR³.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double r, c, a, v;
        System.out.print("Digite o valor do raio: ");
        r = ler.nextDouble();
        
        c = 1 *(Math.PI * r);
        a = Math.PI * (Math.pow(r, 2));
        v = 3 / 4 * (Math.pow(r, 3));
        
        System.out.println("O comprimento é = " +c);
        System.out.println("A área é = " +a);
        System.out.println("O volume é = " +v);
    }
    
}
