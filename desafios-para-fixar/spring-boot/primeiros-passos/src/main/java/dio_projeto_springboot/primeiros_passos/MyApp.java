package dio_projeto_springboot.primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component //gerencia a classe pelo conteiner e indica que a mesma é um bean que devera ser administrado pelo spring (instacia automaticamente)
//obs: usar component quando se tem explicito o codigo fonte da aplicacao, ja o Bean é indicado para implementacoes externas (como gson p exemplo)

public class MyApp implements CommandLineRunner {/*commandLine serve para inicializar a aplicacao realizando um comando e preparar os objetos para uso*/  
	@Autowired //realiza uma injecao de dependencia de um component a outro (no caso das classes que possui a anotacao @component)
	private Calculadora calculadora;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("o resultado da soma é " + calculadora.somar(10, 45));
		
	}

}
