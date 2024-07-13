package Loja;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroDeProdutos {
	private Set<Produto> produtoSet;

	public CadastroDeProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(cod, nome, preco, quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome() {
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco() {
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}
	
	public void exibirProduto() {
		System.out.println(produtoSet);
	}
	
	
	
	public static void main(String[] args) {
		CadastroDeProdutos cadastroProduto = new CadastroDeProdutos();
		cadastroProduto.adicionarProduto(1, "saia", 20.48, 17);
		cadastroProduto.adicionarProduto(2, "vestido", 15.78, 13);
		cadastroProduto.adicionarProduto(4, "body", 20.48, 17);
		cadastroProduto.adicionarProduto(3, "calça", 17.14, 47);
		
		
		cadastroProduto.exibirProduto();
		
		System.out.println(cadastroProduto.exibirProdutosPorNome());
		
		System.out.println(cadastroProduto.exibirProdutosPorPreco());
		
		
	}
	
}
