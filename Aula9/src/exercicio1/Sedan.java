package exercicio1;

public class Sedan extends Carro{

	private int portaMalas;

	public Sedan(double valor, String cor, int ano, int portaMalas) {
		super(valor, cor, ano);
		this.portaMalas = portaMalas;
	}

	@Override
	public void taxa() {
		// TODO Auto-generated method stub
		System.out.println("Taxa de compra de 2%");
	}

	@Override
	public String mostraInfo() {
		// TODO Auto-generated method stub
		System.out.println("-------  [Sedan] --------");
		return super.mostraInfo() + "Porta malas: " + this.portaMalas;
	}
	
	
}
