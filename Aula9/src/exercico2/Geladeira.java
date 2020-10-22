package exercico2;

public class Geladeira extends Mercadoria{
	private int qtdPortas;
	private int tamanho;
	private String tipo;
	
	public Geladeira(int codigo, String descricao, String fabricante, double valor, int qtdPortas, int tamanho,
			String tipo) {
		super(codigo, descricao, fabricante, valor);
		this.qtdPortas = qtdPortas;
		this.tamanho = tamanho;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Geladeira [qtdPortas=" + qtdPortas + ", tamanho=" + tamanho + ", tipo=" + tipo + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}
