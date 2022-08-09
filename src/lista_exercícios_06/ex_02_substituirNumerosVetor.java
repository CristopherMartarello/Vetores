
package lista_exercícios_06;

import java.util.Scanner;


public class ex_02_substituirNumerosVetor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numeros, i, contSub = 0;
        int[] vetA = new int [10];
        
        System.out.print("Informe quantos números irá digitar: ");
        numeros = Integer.valueOf(input.nextLine());
        
        for(i = 0; i < numeros; i++){
            System.out.print("["+i+"]: ");
            vetA[i] = Integer.valueOf(input.nextLine());
        }
        
        System.out.println("NÚMEROS DIGITADOS: ");
        for(i = 0; i < numeros; i++){
            System.out.println(vetA[i]);
        }
        
        System.out.println("SUBSTITUINDO OS NÚMEROS NEGATIVOS POR ZERO: ");
        for(i = 0; i < numeros; i++){
            if (vetA[i] < 0){
                vetA[i] = 0;
                contSub++;
            }
            System.out.println(vetA[i]);
        }
        
        System.out.println("Foram substituidos " + contSub + " números.");
    }
    
}
