/* 
Escreva um programa em java que realize a soma dos nu´meros entre 1 e
1000. Utilize uma estrutura de repeti¸c˜ao e apresente o resultado em tela.
 */

public class LeituraNumeros {
    public static void main(String[]args){
        int soma = 0;
        for(int i = 1; i <=1000; i++){
            soma += i;
        }
        System.out.println(soma);
    }
}
