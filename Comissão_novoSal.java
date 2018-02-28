package Entrada_Saida;

import java.util.Scanner;

public class Comissão_novoSal {
    /**
     * Um funcionário recebe salário fixo mais 4% de comissão sobre as vendas
     * Faça um programa que receba o salário fixo de um funcionário e o valor
     * de suas vendas, calcule e mostre a comissão e o salário final do funcionário.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor do salário fixo: ");
        double sal_Fx = ler.nextDouble();
        System.out.print("Digite o valor da venda: ");
        double venda = ler.nextDouble();
        double sal_Fn, comissao;
        
        comissao = venda * 4/100;
        sal_Fn = sal_Fx + comissao;
        System.out.println("A comissão é = " +comissao+ ", \nSalário final = " +sal_Fn);
    }
    
}
