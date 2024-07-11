package Biblioteca;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livroList;

	public CatalogoLivros() {
		this.livroList = new ArrayList<>();
	}
	
	public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
		
	}
	
	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
		}
		
		return livrosPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
		
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloAnos.add(l);
				}
			}
		}
		
		return livrosPorIntervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String titulo) {
		Livro livroPorTitulo = null;
		if (!livroList.isEmpty()) {
			for (Livro l : livroList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
		}
		
		return livroPorTitulo;
	}
	
	public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		catalogoLivros.adicionarLivros("harry potter","j.k. rolling", 1998);
		catalogoLivros.adicionarLivros("os sete maridos de evelyn hugo ","taylor swift", 1998);
		catalogoLivros.adicionarLivros("as cronicas de gelo e fogo","g. r. r. martin", 2002);
		catalogoLivros.adicionarLivros("a tormenta das espadas","g. r. r. martin", 2008);
		catalogoLivros.adicionarLivros("a dança dos dragoes","g. r. r. martin", 2012);
		catalogoLivros.adicionarLivros("jogos vorazes","suzanne collins", 2013);
		catalogoLivros.adicionarLivros("em chamas","suzanne collins", 2012);
		catalogoLivros.adicionarLivros("a esperança","suzanne collins", 2015);
		catalogoLivros.adicionarLivros("a cantiga dos passaros e das serpentes","suzanne collins", 2016);
		
		
		//System.out.println(catalogoLivros.pesquisarPorAutor("g. r. r. martin"));
		//System.out.println(catalogoLivros.pesquisarPorAutor("suzanne collins"));
		
		//System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2013, 2015));
		
		System.out.println(catalogoLivros.pesquisarPorTitulo("harry potter"));
		
		
		
		
	}
}
