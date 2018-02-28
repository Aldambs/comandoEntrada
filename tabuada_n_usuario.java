package Entrada_Saida;

import java.util.Scanner;

public class tabuada_n_usuario {

    /**
     * Faça um programa que calcule e mostre a tabuada de um número digitado
     * pelo usuário.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o número desejado: ");
        int n = ler.nextInt();
        System.out.println("A tabuada de " +n+ " é:");
        for(int i = 1; i <= 10; i++) {           
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
