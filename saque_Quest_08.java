package Entrada_Saida;

import java.util.Scanner;

public class saque_Quest_08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("DIGITE O VALOR DO SAQUE: ");
        int saque = ler.nextInt();
        int not100, not50, not20, not5, not1;
        
        not100 = saque / 100;
        saque = saque % 100;
        not50 = saque / 50;
        saque = saque % 50;
        not20 = saque / 20;
        saque = saque % 20;
        not5 = saque / 5;
        saque = saque % 5;
        not1 = saque;
        
        System.out.println("Qtd de notas de 100 reais: " + not100);
        System.out.println("Qtd de notas de 50 reais: " + not50);
        System.out.println("Qtd de notas de 20 reais: " + not20);
        System.out.println("Qtd de notas de 5 real: " + not5);
        System.out.println("Qtd de notas de 1 real: " + not1);
    }
    
}
