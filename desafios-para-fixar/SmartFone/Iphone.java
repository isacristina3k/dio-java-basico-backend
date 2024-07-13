import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
public class Iphone {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int flag = 1;
		System.out.println("Menu das opçoes, digite o numero correspondente a sua escolha:\n 1- telefone\n 2- musica\n 3- browser\n 0- Sair");
		
		do {
			
			
			String opcoes = scanner.next();
			
			if (opcoes.equals("0")) {
				flag = 0;
			}
			
			switch(opcoes) {
			  case "1": //code to be executed
				 
				  while(flag != 0) {
					  System.out.println("\nEscolha o que usar do Telefone:\n 1- Ligar\n 2- Atender\n 3- Chamar Correio de Voz\n 0- Voltar\n ");
					  String telefone = scanner.next();
					  
					  AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
					  if (telefone.equals("1")) {
						  System.out.println("Digite o numero que irá ligar: ");
						  String numero = scanner.next(); 
						  aparelhoTelefonico.ligar(numero);
					  }else if (telefone.equals("2")) {
						  aparelhoTelefonico.atender();
					  }else if (telefone.equals("3")) {
						  aparelhoTelefonico.chamarCorreioVoz();
					  }else if (telefone.equals("0")) {
						  Iphone.main(args);
					  }else {
						  System.out.println("Opcao invalida");
					  }
				  }
			  break; //optional
			  case "2": //code to be executed
				  
					  System.out.println("Digite o nome da Musica ou 0 para voltar");
					  String musica = scanner.next();
					  ReprodutorMusical reprmusical = new ReprodutorMusical();
					  reprmusical.selecionarMusica(musica);
					  
					  if (musica.equals("0")) {
						  Iphone.main(args);
					  }
					  while(flag != 0) {
					  System.out.println("Agora digite a opcao desejada:\n 1- Tocar\n 2- Pausar\n 0- Voltar\n");
					  int opcoesMusica = scanner.nextInt();
					  if (opcoesMusica == 1) {
						  reprmusical.tocar(musica);
					  }else if (opcoesMusica == 2) {
						  reprmusical.pausar(musica);					 
					  }else if (opcoesMusica == 0) {
						  System.out.println("VOLTANDO");
						  Iphone.main(args);
					  }else {
						  System.out.println("Opcao invalida");
					  }
					  
				  }
			  break; //optional
			  
			  case "3": //code to be executed
				  while(flag != 0) {
					  System.out.println("\nEscolha o que usar do Browser:\n 1- URL\n 2- Nova Aba\n 3- Atualizar Pagina\n 0- Voltar\n ");
					  String opcoesBrowser = scanner.next();
					  
					  
					  NavegadorInternet browser = new NavegadorInternet();
					  if (opcoesBrowser.equals("1")) {
						  System.out.println("Digite a URL do site: ");
						  String url = scanner.next(); 
						  browser.exibirPagina(url);
					  }else if (opcoesBrowser.equals("2")) {
						  browser.abrirNovaAba();
					  }else if (opcoesBrowser.equals("3")) {
						  browser.atualizandoPagina();
					  }else if (opcoesBrowser.equals("0")) {
						  Iphone.main(args);
					  }else {
						  System.out.println("Opcao invalida");
					  }
				  }  
			  break; //optional
			  
			  case "0": //code to be executed
				  System.out.println("ADEUS");
				  System.exit(0);
			  break; //optional
			  
			  default: System.out.println("OPCAO INVALIDA");
			}
		}while (flag != 0);
	}
			
	
}
