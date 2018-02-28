package Entrada_Saida;

import java.util.Scanner;

public class Novo_Preco {
    /**
     *Faça um programa que receba o preço do produto, calcule e mostre o novo
     * preço, sabendo-se que este sofreu um desconto de 10%.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o preço do produto: ");
        double preco = ler.nextDouble();
        
        double desc = preco * 10/100;
        double Novo_pr = preco - desc;
        System.out.println("O novo preço é = " +Novo_pr);
    }
    
}
