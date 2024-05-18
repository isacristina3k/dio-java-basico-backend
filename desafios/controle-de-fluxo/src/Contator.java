import java.util.Scanner;

public class Contator {
    public static void main(String[] args) {
        Contagem contagem = new Contagem();

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();

        if(parametroUm > parametroDois){
            System.out.println("O primeiro parametro deve ser menor que o segundo!");
        }
        else{

            int numIntercoes;
            numIntercoes = contagem.retornaNumIteracoes(parametroUm, parametroDois);
    
            for (int i=1; i <= numIntercoes; i++){
                System.out.println("Imprmindo o num: " + i);
            }

        }
    
    }
   
    
}
