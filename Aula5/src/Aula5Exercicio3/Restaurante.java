package Aula5Exercicio3;

public class Restaurante
{
	public String nome;
	public String endereco;
	public String cnpj;
	
	public Fornecedor[] fornecedores = new Fornecedor[5];

	public Restaurante(String nome, String endereco, String cnpj) 
	{
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		
		for (int i = 0; i < fornecedores.length; i++) 
		{
			if(fornecedores[i] == null)
			{
				fornecedores[i] = new Fornecedor();
				
			}
		}
	}
	
	
	public void exibirInfos()
	{
		System.out.println("----Restaurante----");
		System.out.println("Nome: " + nome);
		System.out.println("Endereco: " + endereco);
		System.out.println("----{Fornecedores}-----");
		
		for (int i = 0; i < fornecedores.length; i++)
		{
			if(fornecedores[i].tipo != null)
			{
				System.out.println("Tipo: " + fornecedores[i].tipo);
				System.out.println("Quantidade: " + fornecedores[i].quantidade + "Kg");
				
			}
		}
	}
	
	
	
}
