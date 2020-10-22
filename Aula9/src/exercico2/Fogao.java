package exercico2;

public class Fogao extends Mercadoria{

	private int bocas;
	private String tipoAcendimento;
	
	public Fogao(int codigo, String descricao, String fabricante, double valor, int bocas, String tipoAcendimento) {
		super(codigo, descricao, fabricante, valor);
		this.bocas = bocas;
		this.tipoAcendimento = tipoAcendimento;
	}

	@Override
	public String toString() {
		return super.toString() + "Fogao [bocas=" + bocas + ", tipoAcendimento=" + tipoAcendimento + "]";
	}

	
	
	
}
