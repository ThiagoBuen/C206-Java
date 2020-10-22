package exemploAula1;

public abstract class Conta implements ControleAcesso{

	private int id;
	private int agencia;
	private int senha;
	
	
	
	public Conta(int id, int agencia, int senha) {
		this.id = id;
		this.agencia = agencia;
		this.senha = senha;
	}



	public abstract void mostrarInfo();



	@Override
	public void validarAcesso() {
		// TODO Auto-generated method stub
		
	}
	
	
}
