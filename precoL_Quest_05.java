package Entrada_Saida;

import java.util.Scanner;

public class precoL_Quest_05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("DIGITE O PREÇO DA COMPRA: ");
        double preco = ler.nextDouble();
        System.out.print("DIGITE A PERCENTUAL DO LUCRO: ");
        double perc = ler.nextDouble();
        
        double precoV = preco + (preco * (perc/100));
        System.out.println("O PREÇO DE VENDA É = " +precoV);
    }
    
}
