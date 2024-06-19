import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite um número qualquer: ");
        int num = terminal.nextInt();

        for (int i = 0; i <= num; i++){
            if (i % 2 == 1)
                continue;
            System.out.println("Imprimindo pares: " + i);
        }
        
    }
}
