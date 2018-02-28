package Entrada_Saida;

import java.util.Scanner;

public class horaExperienciaB_09 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       byte h, m, s, drS, hF, mF, sF, inic, term;
       
       System.out.print("Digite o horário: ");
       h = ler.nextByte();
       m = ler.nextByte();
       s = ler.nextByte();
       System.out.print("Digite quanto tempo durou a experiência: ");
       drS = ler.nextByte(); 
       
       inic = (byte) (h * 60 + m * 60 + s);
       term = (byte) (inic + drS);
       
       hF = (byte) (term / 60);
       mF = (byte) (term % 60);
       sF = (byte) (term % 60);  
      
       
       System.out.println("Tempo final da experiência: " +hF+ ":" +mF+ ":" +sF+ "");
       
    }
    
}
