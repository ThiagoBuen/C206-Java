package ExemploAula8;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public void fazerAniversario() {
		
	}

	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public double recebeSalario() {
		return 1000;
	}

	public void mostraInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
	}
	
	public String getNome() {
		return nome;
	}


	public int getIdade() {
		return idade;
	}


	public String getSexo() {
		return sexo;
	}

	
	
}
