package exercicio1;

public abstract class Carro implements Controle{
	private double valor;
	private String cor;
	private int ano;
	
	public Carro(double valor, String cor, int ano) {
		super();
		this.valor = valor;
		this.cor = cor;
		this.ano = ano;
	}

	@Override
	public void taxa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String mostraInfo() {
		// TODO Auto-generated method stub
		return "cor: " + this.cor + ", valor: " + this.valor + ", ano: " + this.ano;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}


	

}
