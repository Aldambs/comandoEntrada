package Entrada_Saida;

import java.util.Scanner;

public class id_pessoa {
    /**
     * Faça um programa que receba o ano de nascimento de uma pessoa e o ano 
     * atual, calcule e mostre:
     a) a idade dessa pessoa em anos;
     b) a idade dessa pessoa em meses;
     c) a idade dessa pessoa em dias;
     d) a idade dessa pessoa em semanas.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o ano de nascimento da pessoa: ");
        int ano_nasc = ler.nextInt();
        System.out.print("Informe o ano atual: ");
        int ano_atual = ler.nextInt();
        
        int id_ano = ano_atual - ano_nasc;
        int id_mes = id_ano * 12;
        int id_dias = id_ano * 365;
        int id_semana = id_ano * 48;
        
        System.out.println("Idade em anos = " +id_ano);
        System.out.println("Idade em mês = " +id_mes);
        System.out.println("Idade em dias = " +id_dias);
        System.out.println("Idade em semanas = " +id_semana);
    }
    
}
