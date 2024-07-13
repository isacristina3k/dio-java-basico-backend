import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da sua conta: ");
        int conta = terminal.nextInt();

        System.out.println("Por favor, digite o numero da sua agencia: ");
        String agencia = terminal.next();

        System.out.println("Por favor, digite seu nome: ");
        String nome = terminal.next();

        System.out.println("Por favor, digite seu saldo: ");
        double saldo = terminal.nextDouble();

        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + conta + " e seu saldo " + saldo + " ja esta disponivel" );

    }
}
