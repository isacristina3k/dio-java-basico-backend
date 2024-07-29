package dio.spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;


@Component
public class StartApp implements CommandLineRunner {
	@Autowired
	private UsuarioRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Usuario user = new Usuario();
		user.setName("isadora");
		user.setUsername("isa");
		user.setPassword("123");
		repository.save(user);

		for (Usuario u : repository.findAll()) {
			System.out.println(u);
		}

	}

}
