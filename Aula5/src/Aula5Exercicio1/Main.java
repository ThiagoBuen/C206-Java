package Aula5Exercicio1;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Produto[] produtos = new Produto[5];
		
		Produto p1 = new Produto("iphone XR", "Celular", "Apple", 2999.90);
		Produto p2 = new Produto("Geladeira", "Eletrodomestico", "Consul", 1550.99);
		Produto p3 = new Produto("Fone de Ouvido", "Periférico", "Beats", 749.90);
		
		produtos[0] = p1;
		produtos[1] = p2;
		produtos[2] = p3;
		
		Carrinho c = new Carrinho(produtos);
		
		c.exibirInfos();
	}

}
