package exercicio1;

public class Hatch extends Carro{
	
	private int qtdPortas;

	public Hatch(double valor, String cor, int ano, int qtdPortas) {
		super(valor, cor, ano);
		this.qtdPortas = qtdPortas;
	}

	@Override
	public void taxa() {
		// TODO Auto-generated method stub
		System.out.println("Taxa de compra de 0.5%");
	}

	@Override
	public String mostraInfo() {
		// TODO Auto-generated method stub
		System.out.println("-------  [Hatch] --------");
		return super.mostraInfo() + " Quantidade de portas: " + this.qtdPortas;
	}
	
	

}
