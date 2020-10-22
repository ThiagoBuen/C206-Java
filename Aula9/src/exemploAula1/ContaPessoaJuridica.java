package exemploAula1;

public class ContaPessoaJuridica extends Conta{

	private String razaoSocial;
	private long cnpj;
	private double saldo;
	private double limite;
	
	public ContaPessoaJuridica(int id, int agencia, int senha, String razaoSocial, long cnpj, double saldo,
			double limite) {
		super(id, agencia, senha);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.saldo = saldo;
		this.limite = limite;
	}

	@Override
	public void mostrarInfo() {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
	
}
