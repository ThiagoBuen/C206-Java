package Aula5Exercicio1;

public class Carrinho 
{
	public double total;
	public Produto[] produtos;
	
	public Carrinho(Produto[] produtos) 
	{
		this.produtos = produtos;
	}
	
	public void exibirInfos()
	{
		for(int i=0; i < produtos.length; i++)
		{
			if(produtos[i] != null)
			{
				System.out.println("Nome: " + produtos[i].nome);
				System.out.println("Descrição: " + produtos[i].descricao);
				System.out.println("Fabricante: " + produtos[i].fabricante);
				System.out.println("R$ " + produtos[i].preco);
				System.out.println("-------------------------------");
			}
		}
		System.out.println("Total da Compra: " + calculaTotal());
	}
	
	public double calculaTotal()
	{
		for(int i = 0; i < produtos.length; i++)
		{
			if(produtos[i] != null)
			{
				total = total + produtos[i].preco;
			}
		}
		return total;
	}
}
