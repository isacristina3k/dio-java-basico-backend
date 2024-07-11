import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Integer> agendaContatosMap;

	public AgendaContatos() {
		
		this.agendaContatosMap = new HashMap<>();
	}
	
	public void adcionarContatos (String nome, Integer contatos) {
		agendaContatosMap.put(nome, contatos);
	}
	
	public void removerContatos(String nome) {
		if (!agendaContatosMap.isEmpty()) {
			agendaContatosMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatosMap);
	}
	
	public Integer exibirNumeroPorNome(String nome) {
		Integer numTelefone = null;
		
		if(!agendaContatosMap.isEmpty()) {
			numTelefone = agendaContatosMap.get(nome);
		}
		
		return numTelefone;
	}
	
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		agendaContatos.adcionarContatos("isadora", 61565156);
		agendaContatos.adcionarContatos("isadora", 61564454);
		agendaContatos.adcionarContatos("carlos", 454546);
		agendaContatos.adcionarContatos("marcos", 4548492);
		agendaContatos.exibirContatos();
		
		agendaContatos.removerContatos("marcos");
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.exibirNumeroPorNome("isadora")); 
	
	}
}
