/*Escreva um programa em java que receba um nu´mero. O programa deve
encerrar quando o usu´ario informar -1. Caso contr´ario o programa dever´a
pedir novamente um nu´mero.*/

import java.util.Scanner;

public class EntradaNumeros {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = num.nextInt();
        while(true){
            if(n == -1){
                System.out.println("Programa encerrado");
                break;
            }
            System.out.println("Continue: ");
            n = num.nextInt();
        }
    }
}
