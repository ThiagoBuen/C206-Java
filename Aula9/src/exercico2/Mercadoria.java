package exercico2;

public abstract class Mercadoria {
	private int codigo;
	private String descricao;
	private String fabricante;
	private double valor;
	
	public Mercadoria(int codigo, String descricao, String fabricante, double valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.fabricante = fabricante;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Mercadoria [codigo=" + codigo + ", descricao=" + descricao + ", fabricante=" + fabricante + ", valor="
				+ valor + "]";
	}
	
	
	
	
	
	
}
