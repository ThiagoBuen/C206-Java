package exercicio1;

public class SUV extends Carro implements Modificar{

	private String tracao;

	public SUV(double valor, String cor, int ano, String tracao) {
		super(valor, cor, ano);
		this.tracao = tracao;
	}

	@Override
	public void taxa() {
		// TODO Auto-generated method stub
		System.out.println("Taxa de compra de 8%");
	}

	@Override
	public String mostraInfo() {
		// TODO Auto-generated method stub
		System.out.println("-------  [SUV] --------");
		return super.mostraInfo() + " Tração: " + this.tracao;
	}

	@Override
	public void mudarCor(String cor) {
		// TODO Auto-generated method stub
		setCor(cor);
		
	}
	
	
	
	
}
