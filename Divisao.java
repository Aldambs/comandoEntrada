package Entrada_Saida;

import java.util.Scanner;

public class Divisao {
    /**
     * Faça um programa que receba dois números, calcule e mostre a divisão do 
     * primeiro número pelo segundo. Sabe-se que o segundo número não pode ser 
     * zero, portanto não é necessário se preocupar com validações
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o 1º número: ");
        short n1 = ler.nextShort();
        System.out.print("Digite o 2º número: ");
        short n2 = ler.nextShort();
        double div = n1 / n2;
        
        System.out.print("\nA divisão é = " +div);
    }
    
}
