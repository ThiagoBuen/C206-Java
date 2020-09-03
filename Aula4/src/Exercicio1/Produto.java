package Exercicio1;

public class Produto {
	
	//Atributos
	public int codigoSerie;
	public String codigoProduto;
	public String nome;
	public String categoria;
	public int quantidade;
	
	//Construtor
	
	public Produto(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade) {
		this.codigoSerie = codigoSerie;
		this.codigoProduto = codigoProduto;
		this.nome = nome;
		this.categoria = categoria;
		this.quantidade = quantidade;
	}
	
	//Metodos
	
	public void mostraInfo()
	{
		System.out.println("Codigo de serie: " + codigoSerie);
		System.out.println("Codigo do produto: " + codigoProduto);
		System.out.println("Nome: " + nome);
		System.out.println("Categora: " + categoria);
		System.out.println("Quantidade: " + quantidade);
		
		System.out.println("--------");
	}
	

}
