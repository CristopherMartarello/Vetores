
package lista_exercícios_06;

import java.util.Scanner;


public class ex_07 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int opcao = 0, i = 0, entrevistados, contFundamental = 0, contMedio = 0, contSuperior = 0, contMenosDe2000 = 0;
        int idadeFundamental = 0, idadeMedio = 0, idadeSuperior = 0, contIdadeAcimaDaMedia = 0;
        double mediaFundamental = 0, mediaMedio = 0, mediaSuperior = 0;
        double somaFundamental = 0, somaMedio = 0, somaSuperior = 0;
        double percFundamental = 0, idadeMediaSuperior = 0;
        
        System.out.print("Quantas pessoas foram entrevistadas: ");
        entrevistados = Integer.valueOf(input.nextLine());
        
        int[] idade = new int [entrevistados];
        double[] valorSalario = new double [entrevistados];
        String[] grauEscolaridade = new String [entrevistados];
        
        
        for(i = 0; i < entrevistados; i++){
            System.out.print("["+i+"]"+"Digite a sua idade: ");
            idade[i] = Integer.valueOf(input.nextLine());
            System.out.print("Informe o valor do seu salario: ");
            valorSalario[i] = Double.valueOf(input.nextLine());
            System.out.println("Informe o seu grau de escolaridade (fundamental, medio, superior): ");
            grauEscolaridade[i] = input.nextLine();
            
            if(grauEscolaridade[i].equalsIgnoreCase("fundamental")){
                contFundamental++;
                somaFundamental = somaFundamental + valorSalario[i];
                idadeFundamental = idadeFundamental + idade[i];
            }else if(grauEscolaridade[i].equalsIgnoreCase("medio")){
                contMedio++;
                somaMedio = somaMedio + valorSalario[i];
                idadeMedio = idadeMedio + idade[i];
            }else if(grauEscolaridade[i].equalsIgnoreCase("superior")){
                contSuperior++;
                somaSuperior = somaSuperior + valorSalario[i];
                idadeSuperior = idadeSuperior + idade[i];
            }else{
                do {                    
                    System.out.print("Informe o dado da forma correta: ");
                    grauEscolaridade[i] = input.nextLine();
                    if(grauEscolaridade[i].equalsIgnoreCase("medio")){
                        contMedio++;
                        somaMedio = somaMedio + valorSalario[i];
                        idadeMedio = idadeMedio + idade[i];
                    }
                }while(!(grauEscolaridade[i].equalsIgnoreCase("fundamental") || grauEscolaridade[i].equalsIgnoreCase("medio") || grauEscolaridade[i].equalsIgnoreCase("superior")));
            }
            
            if(grauEscolaridade[i].equalsIgnoreCase("superior") && valorSalario[i] < 2000){
                contMenosDe2000++;
            }

        }
        
        percFundamental = (contFundamental * 100.0) / entrevistados;
        mediaFundamental = somaFundamental / contFundamental;
        mediaMedio = somaMedio / contMedio;
        mediaSuperior = somaSuperior / contSuperior;
        idadeMediaSuperior = (double) (idadeSuperior / contSuperior);
        
        for(i = 0; i < entrevistados; i++){
            if(idade[i] > idadeMediaSuperior && grauEscolaridade[i].equalsIgnoreCase("medio") || idade[i] > idadeMediaSuperior && grauEscolaridade[i].equalsIgnoreCase("fundamental")){
                contIdadeAcimaDaMedia++;
                
            }
        }
        
        System.out.println("============================================");
        System.out.println("Quantidade de pessoas com ensino superior que ganham menos de R$ 2.000: " + contMenosDe2000);
        System.out.println("A média salarial das pessoas com ensino fundamental: " + mediaFundamental);
        System.out.println("A média salarial das pessoas com ensino médio: " + mediaMedio);
        System.out.println("A média salarial das pessoas com ensino superior: " + mediaSuperior);
        System.out.println("A idade média das pessoas com ensino superior: " + idadeMediaSuperior);
        System.out.println("O percentual de pessoas que possuem apenas ensino fundamental: " + percFundamental);
        System.out.println("Quantidade com idade acima da média: " + contIdadeAcimaDaMedia);
        System.out.println("=============================================");
        
    }
}    

