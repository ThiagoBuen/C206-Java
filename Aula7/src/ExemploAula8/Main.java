package ExemploAula8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa aluno = new Aluno("JP", 22, "Masculino", 1227, "Eng. da Computacao");		 // Direto
		
		Pessoa professor = new Professor("Renzo", 31, "Masculino", "Programação", 3500); // Polimorfismo

		System.out.println("Salario Aluno: " + aluno.recebeSalario());
		System.out.println("Salario Professor: " + professor.recebeSalario());
		
		System.out.println("Aluno: ");
		aluno.mostraInfo();
		System.out.println(" Professor: ");
		professor.mostraInfo();
		
		if(aluno instanceof Aluno) {
			Aluno alunoAux = (Aluno)aluno;
			alunoAux.setMatricula(3355);
			alunoAux.mostraInfo();	
		}
		
		if(professor instanceof Professor) {
			Professor professorAux = (Professor)professor;
			professorAux.receberAumento();
		}
	}

}
