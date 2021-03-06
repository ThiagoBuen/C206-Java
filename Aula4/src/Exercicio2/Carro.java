package Exercicio2;

public class Carro {

	public String cor;
	public String marca;
	public String modelo;
	public double velocidadeMax;
	public double velocidadeAtual;
	
	//Instanciação
	
	public Motor motor;
	
	
	public Carro(String cor, String marca, String modelo, double velocidadeMax, double velocidadeAtual, Motor motor) {
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadeMax = velocidadeMax;
		this.velocidadeAtual = velocidadeAtual;
		this.motor = motor;
	}


	public void ligar()
	{
		System.out.println("O carro " + modelo + " ligou");
	}
	
	public void acelerar()
	{
		System.out.println("O carro " + modelo + " acelerou");
	}


	@Override
	public String toString() {
		return "Carro [cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + ", velocidadeMax=" + velocidadeMax
				+ ", velocidadeAtual=" + velocidadeAtual + ", motor=" + motor + "]";
	}
	
	
	
}
