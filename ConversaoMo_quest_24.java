package Entrada_Saida;

import java.util.Scanner;

public class ConversaoMo_quest_24 {
    /*
     * Faça um programa que receba a quantidade de dinheiro em reais que uma 
     * pessoa que vai viajar possui. Essa pessoa vai passar por vários países e 
     * precisa converter seu dinheiro em dólares, marco alemão e libra esterlina.
     * Sabe-se que a cotação do dólar é de R$ 1,80, do marco alemão é de R$ 2,00
     * e da libra esterlina é de R$ 1,57. O programa deve fazer as conversões e 
     * mostra-las.
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       System.out.print("Digite a quantia em reais que possue: ");
       float din = ler.nextFloat();
       float dolar = din / 1.80f;
       float marco = din / 2.00f;
       float libra = din / 1.57f;
       
        System.out.println("O valor em dólar é = " +dolar);
        System.out.println("O valor em marco é = " +marco);
        System.out.println("O valor em libra é = " +libra);
    }
    
}
