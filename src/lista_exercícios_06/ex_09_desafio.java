
package lista_exercícios_06;

import java.util.Scanner;


public class ex_09_desafio {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int quantidade, maiorPreco = Integer.MIN_VALUE, aux;
        
        System.out.println("Digite a quantidade de produtos: ");
        quantidade = Integer.valueOf(input.nextLine());
        
        int[] precoProduto = new int [quantidade];
        
        for(int i = 0; i < quantidade; i++){
            System.out.print("Digite o preço do produto ["+(i+1)+"]: ");
            precoProduto[i] = Integer.valueOf(input.nextLine());
        }
        
        for(int i = 0; i < quantidade; i++) {
            if(precoProduto[i] > maiorPreco){
                maiorPreco = precoProduto[i];
            }
            System.out.println(precoProduto[i]);
        }
        
        
        
    }
    
}
