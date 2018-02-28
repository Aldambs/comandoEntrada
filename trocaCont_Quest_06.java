package Entrada_Saida;

import java.util.Scanner;

public class trocaCont_Quest_06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        byte n1 = ler.nextByte();
        System.out.print("Dite o segundo valor: ");
        byte n2 = ler.nextByte();
        
        byte aux;
        aux = n1;
        n1 = n2;
        n2 = n1;
        
        System.out.println("A troca é = " +aux+ " " +n1+ " " +n2+ " ");
    }
    
}
