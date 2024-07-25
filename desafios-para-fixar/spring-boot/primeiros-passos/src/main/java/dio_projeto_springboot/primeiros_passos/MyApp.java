package dio_projeto_springboot.primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component //transforma o obj em Bean
public class MyApp implements CommandLineRunner {/*commandLine serve para inicializar a aplicacao realizando um comando e preparar os objetos para uso*/  
	@Autowired
	private Calculadora calculadora;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("o resultado da soma é " + calculadora.somar(10, 45));
		
	}

}
