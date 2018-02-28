package Entrada_Saida;

import java.util.Scanner;

public class metrosPotencia_quest19 {
    /**
     * Sabe-se que para iluminar de maneira correta os cômodos, de uma casa, para
     * cada m², deve-se usar 18 W de potência. Faça um programa que receba as duas 
     * dimensões de um cômodo (em metros), calcule e mostre a sua área (em m²) e a
     * potência de iluminação que deverá ser utilizada.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float dim1,dim2, area, ld1, ld2, ld3, ld4, pot;
        System.out.print("Informe o 1º lado: ");
        ld1 = ler.nextFloat();
        System.out.print("Informe o 2º lado: ");
        ld2 = ler.nextFloat();
        System.out.print("Informe o 3º lado: ");
        ld3 = ler.nextFloat();
        System.out.print("Informe o 4º lado: ");
        ld4 = ler.nextFloat();
        
        dim1 = ld1 * ld2;
        dim2 = ld3 * ld4;
        area = dim1 + dim2;
        pot = area * 18;
        
        System.out.println("A área é = " +area);
        System.out.println("A potência é = " +pot);
        
    }
    
}
