package Entrada_Saida;

import java.util.Scanner;

public class hora_Trab_Quest21 {

    /**
     * Faça um programa que receba o número de horas trabalhadas, o valor do 
     * salário mínimo e o número de horas extras trabalhadas. Calcule e mostre o 
     * salário a receber seguindo as regras a seguir:
     a) a hora trabalhada vale 1/8 do salário mínimo;
     b) a hora extra vale ¼ do salário mínimo;
     c) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo 
     * valor da hora trabalhada;
     d) a quantia a receber pelas horas extras equivale ao número de horas extras
     * trabalhadas multiplicado pelo valor da hora extra;
     e) o salário a receber equivale ao salário bruto mais a quantia a receber pelas 
     * hora extras.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float hr_Trab, sal_Min, hrEx_Trab;
        
        System.out.print("Informe as horas trabalhadas: ");
        hr_Trab = ler.nextFloat();
        System.out.print("Informe o valor do salário mínimo: ");
        sal_Min = ler.nextFloat();
        System.out.println("Informe o número de horas extras: ");
        hrEx_Trab = ler.nextFloat();
        
        /*a*/float h_trab = sal_Min / 8;
        /*b*/float h_extra = sal_Min / 4;
        /*c*/float sal_Brt = hr_Trab * h_trab;
        /*d*/float qtd_rec = hrEx_Trab * h_extra;
        /*e*/float sal_rec = sal_Brt + qtd_rec;
        
        System.out.println("A hora tabalhada foi = " +h_trab);
        System.out.println("O valor da hora extra foi = " +h_extra);
        System.out.println("O salário bruto foi = " +sal_Brt);
        System.out.println("A quantidade a receber pelas hora extras foi = " +qtd_rec);
        System.out.println("O salário a recebe é de = " +sal_rec);
    }
    
}
