package exercico2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mercadoria fogao = new Fogao(000, "Um bom fogao", "Eletrolux", 2000, 4, "Automatico");
		Mercadoria geladeira = new Geladeira(001, "Uma boa geladeira", "Brastemp", 2500, 2, 40, "Inox");
		
		System.out.println(fogao.toString());
		System.out.println(geladeira.toString());
	}

}
