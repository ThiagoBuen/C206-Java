package aula7_ContaCliente;

public class Cliente {
	private String nome;
	private long cpf;
	
	public Cliente(String nome, long cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public void alterarNome(String nome) {
		this.setNome(nome);
	}

	
}
