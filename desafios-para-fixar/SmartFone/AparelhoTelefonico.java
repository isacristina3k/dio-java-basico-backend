
public class AparelhoTelefonico {
	private String numero;
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void ligar(String numero) {
		System.out.println("Ligando para o numero: " + numero);
	}
	
	public void atender() {
		System.out.println("Atendendo");
	}
	
	public void chamarCorreioVoz() {
		System.out.println("Ligando para o correio de voz...");
	}
	
}
