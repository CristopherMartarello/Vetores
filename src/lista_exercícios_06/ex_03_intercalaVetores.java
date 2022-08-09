
package lista_exercícios_06;

import java.util.Scanner;


public class ex_03_intercalaVetores {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] vetA = new int [10];
        int[] vetB = new int [10];
        int[] vetC = new int [20];
        
        int  j = 0;
        
        System.out.println("~~VETOR A~~");
        for(int i = 0; i < 10; i++){
            System.out.print("["+i+"]: ");
            vetA[i] = Integer.valueOf(input.nextLine());
        }
        
        System.out.println("~~VETOR B~~");
        for(int i = 0; i < 10; i++){
            System.out.print("["+i+"]: ");
            vetB[i] = Integer.valueOf(input.nextLine());
        }
        
        System.out.println("~~VETOR C~~");
        for(int i = 0; i < 10; i++){
            vetC[j] = vetA[i];
            j++;
            vetC[j] = vetB[i];
            j++;
        }
        
        for(int i = 0; i < 20; i++){
            System.out.println("["+i+"]: " + vetC[i]);
        }
    }
    
}
