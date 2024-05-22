import java.util.Scanner;
import java.util.InputMismatchException;


public class ExemploTryCatch {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try{
            System.out.println("Digite seu nome: ");
            terminal.next();
            
            System.out.println("Digite sua idade: ");
            terminal.nextInt();
            
            System.out.println("Digite sua Altura: ");
            terminal.nextInt();
            terminal.close();


        }
        catch(InputMismatchException e){
            System.out.println("A idade e altura precisa ser um numero!");

        }
    }

}
