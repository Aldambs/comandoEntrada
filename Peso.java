package Entrada_Saida;

import java.util.Scanner;

public class Peso {
    /**
     * Faça um programa que receba o peso de uma pessoa, calcule e mostre : 
     * a) o novo peso se a pessoa engordar 15% sobre o peso digitado; 
     * b) o novo peso se a pessoa emagrecer 20% sobre o peso digitado.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o peso de uma pessoa: ");
        double peso = ler.nextDouble();
        
        double novo_Peso_en = peso + (peso * 15/100);
        double novo_Peso_em = peso - (peso* 20/100);
        
        System.out.println("O novo peso de quem ganhou = " +novo_Peso_en);
        System.out.println("O novo peso de quem perdeu = " +novo_Peso_em);
    }

}
