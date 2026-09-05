import java.util.Scanner;

public class Tabuada {
    public static void main(String[]args){
            Scanner num = new Scanner(System.in);
            System.out.println("Digite um valor:");
            int n = num.nextInt();
            System.out.println("Tabuada do " + n);
            for(int i = 1; i <= 10; i++){
                System.out.println(i * n);


            }
        }
    }

