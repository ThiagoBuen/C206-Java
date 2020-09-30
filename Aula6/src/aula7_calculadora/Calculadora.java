package aula7_calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor do raio: ");
		double raio = sc.nextDouble();
		
		System.out.println("Circunferencia: " + CalculadoraModel.circunferencia(raio));
		System.out.println("Volume: " + CalculadoraModel.volume(raio));
		System.out.println("O valor de PI é: " + CalculadoraModel.getPI());
		
	}

}
