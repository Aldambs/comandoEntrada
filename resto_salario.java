package Entrada_Saida;

import java.util.Scanner;

public class resto_salario {
    /**
     * João recebeu seu salário e preceisa pagar duas contas que estão atrasadas. 
     * Como as contas estão atrasadas, João terá de pagar multa de 2% sobre cada 
     * conta. Faça um programa que calcule e mostre quanto restará do salário do João
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o valor do salário de João: ");
        double sal_fun = ler.nextDouble();
        System.out.print("Digite o valor da 1º conta: ");
        double cont1 = ler.nextDouble();
        System.out.print("Digite o valor da 2º conta: ");
        double cont2 = ler.nextDouble();
        
        double valorAtualconta1 = cont1 + (cont1 * 0.02);
        double valorAtualconta2 = cont2 + (cont2 * 0.02);
        double soma = valorAtualconta1 + valorAtualconta2;
        double rest_sal = sal_fun - soma;
        
        System.out.println("\nValor atual da 1º conta =\n" +valorAtualconta1);
        System.out.println("Valor atual da 2º conta =\n" +valorAtualconta2);
        System.out.println("O total das faturas =\n" +soma);
        System.out.println("Restante do salário =\n" +rest_sal);
    }
    
}
