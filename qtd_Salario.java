package Entrada_Saida;

import java.util.Scanner;

public class qtd_Salario {
    /**
     * Faça um programa que receba o valor do salário mínimo e o valor do salário 
     * de um funcionário, calcule e mostre a quantidade de salários mínimos que 
     * ganha esse funcionário.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o valor do salário do funcionário: ");
        double sal_fun = ler.nextDouble();
        System.out.print("Informe o valor do salário mínimo: ");
        double sal_min = ler.nextDouble();
        
        double qtd = sal_fun / sal_min;
        System.out.println("A quantidade ganha de salário minimo é = " +qtd);
    }
    
}
