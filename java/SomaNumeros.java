/* 
 * Escreva um programa em java que receba um inteiro. Realize a soma do
 * nu´mero 1 at´e o valor informado pelo usu´ario. Apresente o resultado em
 * tela.
 */

import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = num.nextInt();
        int soma = 0;
        for(int i = 1; i <= n ; i++){
            soma += i;
        }
        System.out.println(soma);
    }
}
