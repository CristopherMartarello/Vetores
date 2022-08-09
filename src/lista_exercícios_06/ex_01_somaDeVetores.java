
package lista_exercícios_06;

import java.util.Scanner;


public class ex_01_somaDeVetores {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] vetA = new int [10];
        int[] vetB = new int [10];
        int[] vetC = new int [10];
        
        int i;
        
        System.out.println("VETOR A: ");
        for(i = 0; i < 10; i++){
            System.out.print("["+i+"]: ");
            vetA[i] = Integer.valueOf(input.nextLine());
        }
        
        System.out.println("VETOR B: ");
        for(i = 0; i < 10; i++){
            System.out.print("["+i+"]: ");
            vetB[i] = Integer.valueOf(input.nextLine());
        }
        
        System.out.println("VETOR C (soma dos vetores): ");
        for(i = 0; i < 10; i++){
            vetC[i] = vetA[i] + vetB[i];
            System.out.println("["+i+"]: " + vetC[i]);
            
        }
        
        
    }
    
}
