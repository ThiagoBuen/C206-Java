package StreamingVIdeo;

public class Serie 
{
	public String nome;
	public String categoria;
	public double nota;
	public int temporadas;
	public String[] atores = new String[3];
	public Produtora produtora;
	
	public Serie(String nome, String categoria, double nota, int temporadas, String[] atores, Produtora produtora)
	{
		this.nome = nome;
		this.categoria = categoria;
		this.nota = nota;
		this.temporadas = temporadas;
		this.atores = atores;
		this.produtora = produtora;
		
	}
	
	public void mostrarInfos() {
		System.out.println("Nome da Serie: " + nome);
		System.out.println("Categoria: " + categoria);
		System.out.println("Classificação: " + nota);
		System.out.println("Temporadas: " + temporadas);
		System.out.print("Atores: ");
		for(int i = 0; i < 3; i++) {
			System.out.print(atores[i] + " ");
		}
		System.out.println();
		System.out.println("Produtora: " + produtora);
	}
	
	
}
