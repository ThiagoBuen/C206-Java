package exercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro suv = new SUV(7000, "vermelho", 2010, "4x4");
		Carro sedan = new Sedan(50000, "azul", 2012, 30);
		
		
		System.out.println(suv.mostraInfo());
		suv.taxa();
		
		
		System.out.println(sedan.mostraInfo());
		sedan.taxa();
		
		if(suv instanceof SUV) {
			SUV suvAux  = (SUV) suv;
			suvAux.mudarCor("branco");
			System.out.println(suvAux.mostraInfo());
		}
		
		
	}

}
