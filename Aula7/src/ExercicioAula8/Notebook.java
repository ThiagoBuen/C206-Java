package ExercicioAula8;

public class Notebook extends Produto{
	
	private double armazenamento;
	private String gpu;
	private String processador;
	
	public Notebook(String nome, double preco, double armazenamento, String gpu, String processador) {
		super(nome, preco);
		this.armazenamento = armazenamento;
		this.gpu = gpu;
		this.processador = processador;
	}
	
	@Override
	public String etiquetaPreco() {
		return super.etiquetaPreco() + "\n" + "Armazenamento: " + armazenamento + 
				"\n" +  "GPU: " + gpu + "\n" +  "Processador: " + processador;
		
		
	}

	public void setArmazenamento(double armazenamento) {
		this.armazenamento = armazenamento;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	

}
