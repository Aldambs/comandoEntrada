package Entrada_Saida;

import java.util.Scanner;

public class converteH_quest_25 {

    /**
     * Faça um programa que receba uma hora (uma variável pra hora e outra para
     * minutos), calcule e mostre:
       a) a hora digitada convertida em minutos;
       b) o total dos minutos, ou seja, os minutos digitados mais a conversão anterior;
       c) o total dos minutos convertido em segundos.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float hora, min, hm, mc, ms;
        System.out.print("Digite a hora: ");
        hora = ler.nextFloat();
        System.out.print("Digite o minuto: ");
        min = ler.nextFloat();
        
        hm = hora * 60;
        mc = min + hm;
        ms = min * 60;
        
        System.out.println("Horas em minutos: " +hm);
        System.out.println("Total de minutos: " +mc);
        System.out.println("Total de seguntos:" +ms);
        
    }
    
}
