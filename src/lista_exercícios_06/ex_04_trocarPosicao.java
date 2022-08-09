
package lista_exercícios_06;

import java.util.Scanner;


public class ex_04_trocarPosicao {
    
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    
    int[] vetA = new int [20];
    int i;
    int j = 19, x = 0;
    
    System.out.println("~~VETOR A~~");
    for(i = 0; i < 20; i++){
        System.out.print("["+i+"]: ");
        vetA[i] = Integer.valueOf(input.nextLine());
    }
    
    for(i = 0; i < 10; i++){
        x = vetA[i];
        vetA[i] = vetA[j];
        vetA[j] = x;
        j--;
    }
    
    for(i = 0; i < 20; i++){
        System.out.println(vetA[i]);
    }
    
        
    }
}
