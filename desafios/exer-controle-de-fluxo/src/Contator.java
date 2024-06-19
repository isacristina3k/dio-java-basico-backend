import java.beans.ParameterDescriptor;
import java.util.Scanner;

public class Contator {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidos exeption){
            //retorna a regra de negocio que está dentro da classe
        }
            
    
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidos{
        Contagem contagem = new Contagem();
        ParametrosInvalidos exParametrosInvalidos = new ParametrosInvalidos();
        if (parametroUm > parametroDois){
            exParametrosInvalidos.VerificaParametro(parametroUm, parametroDois);

        }else{
            int numIntercoes;
            numIntercoes = contagem.retornaNumIteracoes(parametroUm, parametroDois);
    
            for (int i=1; i <= numIntercoes; i++){
                System.out.println("Imprmindo o num: " + i);
            }
        }

    }
   
    
}
