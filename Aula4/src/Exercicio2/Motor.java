package Exercicio2;

public class Motor {

	public String potencia;
	public String tipo;
	
	
	public Motor(String potencia, String tipo) {
		this.potencia = potencia;
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Motor [potencia=" + potencia + ", tipo=" + tipo + "]";
	}
	
	
	
	
}
