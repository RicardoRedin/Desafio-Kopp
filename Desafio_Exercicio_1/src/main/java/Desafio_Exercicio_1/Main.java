
package Desafio_Exercicio_1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Lista_Valores listaValores = new Lista_Valores();
        String saida = "", entrada = "";
        
        while(!entrada.equals("3")){
            System.out.println("\n\n-----MENU-----\n Opções: \n1 - Valores Aleatórios\n2 - Inserir Valores Manuais\n3 - Sair");
            entrada = ler.nextLine();
            switch(entrada){
                case "1":
                    saida = listaValores.recebe_valores_aleatorios();
                    System.out.println("\nSaída: " + saida);
                    break;
                case "2":
                    saida = listaValores.recebe_valores_usuario();
                    System.out.println("\nSaída: " + saida);
                    break;
                case "3":
                    System.out.println("Saindo... Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
                   
        }
    }       
}
