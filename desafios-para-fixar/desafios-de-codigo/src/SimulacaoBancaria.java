import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        double saldoAtual = 0;
        double saque = 0;
        boolean continuar = true;

        while (continuar) {
           // System.out.println("Digite sua opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                   // System.out.println("Digite seu depósito: ");
                    saldo = scanner.nextDouble();
                    
                    saldoAtual += saldo;
                    System.out.println(String.format("Saldo atual: %.1f", saldoAtual));
                    
                    break;
                case 2:
                 //   System.out.println("Digite seu saque: ");
                    saque = scanner.nextDouble();
                    if(saque > saldoAtual){
                    
                      System.out.println("Saldo Insuficiente.");
                      
                    }else{
                      saldoAtual = saldoAtual - saque;
                      System.out.println(String.format("Saldo atual: %.1f", saldoAtual));
                    }
                  
                    break;
                case 3:
                    System.out.println(String.format("Saldo atual: %.1f", saldoAtual));
                    break;
                case 0:
                  
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
