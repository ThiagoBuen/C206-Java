package exemploAula1;

public class ContaPessoaFisica extends Conta{
	private String nome;
	private long cpf;
	private double saldo;
	
	
	
	public ContaPessoaFisica(int id, int agencia, int senha, String nome, long cpf, double saldo) {
		super(id, agencia, senha);
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}



	@Override
	public void mostrarInfo() {
		// TODO Auto-generated method stub
		
	}




	
	
	
	

}
