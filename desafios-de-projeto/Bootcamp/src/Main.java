import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Backend");
		curso1.setCargaHoraria(80);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Python");
		curso2.setDescricao("Analise de Dados");
		curso2.setCargaHoraria(60);
		
		Curso curso3 = new Curso();
		curso3.setTitulo("Cobol");
		curso3.setDescricao("Backend");
		curso3.setCargaHoraria(120);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Java Basico");
		mentoria1.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(curso3);
		System.out.println(mentoria1);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		bootcamp.getConteudos().add(mentoria1);
		
		
		Dev dev1 = new Dev();
		dev1.setNome("isadora");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudo Inscritos de Isadora " + dev1.getConteudosInscritos());
		dev1.progredir();
		System.out.println("Conteudo Concluidos de Isadora " + dev1.getConteudosConcluidos());
		System.out.println("-");
		System.out.println("Conteudo Inscritos de Isadora " + dev1.getConteudosInscritos());
		System.out.println("-");
		
		Dev dev2 = new Dev();
		dev2.setNome("joao");
		dev2.inscreverBootcamp(bootcamp);
		//dev2.getConteudosConcluidos().add(curso1);
		//dev2.getConteudosConcluidos().add(curso3);
		System.out.println("Conteudo Inscritos de Joao " + dev2.getConteudosInscritos());
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		dev2.progredir();
		System.out.println("Conteudo Concluidos de Joao " + dev2.getConteudosConcluidos());
		System.out.println("-");
		System.out.println("Conteudo Inscritos de Joao " + dev2.getConteudosInscritos());
	}
}
