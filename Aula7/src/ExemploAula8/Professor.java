package ExemploAula8;

public class Professor extends Pessoa {
	private String especialidade;
	private int salario;
	
	

	public Professor(String nome, int idade, String sexo, String especialidade, int salario) {
		super(nome, idade, sexo);
		this.especialidade = especialidade;
		this.salario = salario;
	}



	public void receberAumento() {
		
	}
	
	@Override
	public double recebeSalario() {
		return super.recebeSalario() + 1350;
	}
	
	@Override
	public void mostraInfo() {
		super.mostraInfo();
		System.out.println("Especialidade: " + especialidade);
		System.out.println("Salario" + salario);
		
	}
	
	
	
}
