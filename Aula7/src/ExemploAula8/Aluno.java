package ExemploAula8;

public class Aluno extends Pessoa{		//Herança
	
	private int matricula;
	private String curso;
	

	public Aluno(String nome, int idade, String sexo, int matricula, String curso) {
		super(nome, idade, sexo);
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public void cancelarMatricula() {
		
	}
	
	
	@Override
	public double recebeSalario() {
		return super.recebeSalario() + 200;
	}
	
	@Override
	public void mostraInfo() {
		super.mostraInfo();
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + curso);
		
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
	
	
}
