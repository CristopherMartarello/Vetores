
package lista_exercícios_06;

import java.util.Scanner;


public class ex_08 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
         int quantidade, i;
        
        System.out.print("Digite a quantidade de passageiros: ");
        quantidade = Integer.valueOf(input.nextLine());
        
        char[] cidade = new char[5];
        String[] nome = new String[quantidade];
        int contA = 0, contB = 0, contC = 0, contD = 0, contE = 0;
        
        for(i = 0; i < quantidade; i++){
            System.out.print("Informe o nome do passageiro ["+i+"]: ");
            nome[i] = input.nextLine();
            System.out.print("Agora, informe a cidade destino (A, B, C, D ou E): ");
            cidade[i] = input.nextLine().charAt(0);
        }
        
        System.out.println(">CIDADE A<");
        for(i = 0; i < quantidade; i++){
            if(cidade[i] == 'A' || cidade[i] == 'a'){
                contA++;
                System.out.println(nome[i]);
            }
        }
        
        System.out.println(">CIDADE B<");
        for(i = 0; i < quantidade; i++){
            if(cidade[i] == 'B' || cidade[i] == 'b'){
                contB++;
                System.out.println(nome[i]);
            }
        }
        
        System.out.println(">CIDADE C<");
        for(i = 0; i < quantidade; i++){
            if(cidade[i] == 'C' || cidade[i] == 'c'){
                contC++;
                System.out.println(nome[i]);
            }
        }
        
        System.out.println(">CIDADE D<");
        for(i = 0; i < quantidade; i++){
            if(cidade[i] == 'D' || cidade[i] == 'd'){
                contD++;
                System.out.println(nome[i]);
            }
        }
        
        System.out.println(">CIDADE E<");
        for(i = 0; i < quantidade; i++){
            if(cidade[i] == 'E' || cidade[i] == 'e'){
                contE++;
                System.out.println(nome[i]);
            }
        }
        
    }
    
}
