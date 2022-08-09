
package lista_exercícios_06;

import java.util.Scanner;


public class ex_06 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int qtdAlunos = 0, contAprovados = 0, contReprovados = 0;
        double somaNotas = 0, media = 0, percentualAprovados = 0, percentualReprovados;
        
        System.out.print("Informe a quantidade de alunos que realizaram a POSCOMP: ");
        qtdAlunos = Integer.valueOf(input.nextLine());
        
        double[] aluno = new double[qtdAlunos];
        String[] nome = new String [qtdAlunos];
        double[] nota = new double[qtdAlunos];
        
        for(int i = 0; i < qtdAlunos; i++){
            System.out.print("Olá aluno ["+i+"], digite o seu nome: ");
            nome[i] = input.nextLine();
            System.out.print("Agora, informe a sua nota: ");
            nota[i] = Double.valueOf(input.nextLine());
            
            somaNotas = somaNotas + nota[i];
        }
        
        media = somaNotas / qtdAlunos;
        
        System.out.println("~~LISTA DE APROVADOS~~");
        for(int i = 0; i < qtdAlunos; i++){
            if(nota[i] > media){
                contAprovados++;
                System.out.println(nome[i] + ", nota: " + nota[i]);
            }else{
                contReprovados++;
            }
        }
        
        
        percentualAprovados = (100.0 * contAprovados)/qtdAlunos;
        percentualReprovados = (100.0 * contReprovados)/qtdAlunos;
        
        System.out.println("~~PERCENTUAL DE APROVADOS: " + percentualAprovados);
        System.out.println("~~PERCENTUAL DE REPROVADOS: " + percentualReprovados);
        
    }
    
}
