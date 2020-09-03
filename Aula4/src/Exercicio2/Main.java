package Exercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor m1 = new Motor("50 cv", "flex");
		Carro c1 = new Carro("Preto", "Ford", "Fiest", 200, 0, m1);
		
		Carro c2 = new Carro("Branca", "Audi", "TT", 150, 0, new Motor("150cv", "flex"));
		
		
		c1.acelerar();
		
		c2.acelerar();
	}

}
