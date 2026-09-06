import java.util.Scanner;
public class JogoAdivinhacao {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        int numero = (int) Math.floor(Math.random() * 100);
        int tentativas = 0;
        while(tentativas < 10){
            System.out.println("Diugite um  numero: "); 
            int chute = num.nextInt();
            tentativas ++ ;
            


            System.out.println("Tentativa " + tentativas);
            if(chute == numero){
                System.out.println("Parabéns! Você acertou o número.");
                break;
            } else if(chute < numero){
                System.out.println("O número é maior. Tente novamente.");
            } else {
                System.out.println("O número é menor. Tente novamente.");
            }
            
            if(tentativas == 10){
                System.out.println("Suas tentativas acabaram");
            }

        }

        

    }
    
}
