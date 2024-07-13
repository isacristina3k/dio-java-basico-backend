
public class Main {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("isadora");
		
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		cc.depositar(200);
		cc.transferir(200, poupanca);
		cc.imprimirExtrato();
		System.out.println("\n");
		poupanca.imprimirExtrato();
	}
}
