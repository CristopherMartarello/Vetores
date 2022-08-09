
package lista_exercícios_06;

import java.util.Scanner;


public class ex_05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] vet = new int[30];
        int i, maiorNumero = Integer.MIN_VALUE, menorNumero = Integer.MAX_VALUE;
        int diferenca;
        
        for(i = 0; i < 5; i++){
            System.out.print("["+i+"]: ");
            vet[i] = Integer.valueOf(input.nextLine());
            
            if(vet[i] > maiorNumero){
                maiorNumero = vet[i];
            }
            
            if(vet[i] < menorNumero){
                menorNumero = vet[i];
            }
            
            
        }
        
        diferenca = maiorNumero - menorNumero;
        
        System.out.println("O maior numero é: " + maiorNumero);
        System.out.println("O menor numero é: " + menorNumero);
        System.out.println("A diferença entre o maior e o menor é: " + diferenca);
        
        
        
        
        
    }
    
}
