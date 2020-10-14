package ExercicioAula8;

public class Produto {

	private String nome;
	private double preco;
	
	
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}



	public String etiquetaPreco() {
		return "Nome: " + nome + "\n" + "Preço: " + preco;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
