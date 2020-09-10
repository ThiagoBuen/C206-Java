package Exercicio2;

public class Empresa 
{
	public String cnpj;
	public String endereco;
	public Contato[] contatos;
	
	public Empresa(String cnpj, String endereco) 
	{
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	public void exibirInfos()
	{
		System.out.println("----- {EMPRESA} ---- ");
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Endereço: " + endereco);
		
		for(int i=0; i< contatos.length; i++)
		{
			if(contatos[i] != null)
			{
				System.out.println("Nome: " + contatos[i].nome);
				System.out.println("Email: " + contatos[i].email);
				System.out.println("Telefone: " + contatos[i].telefone);
				System.out.println("Data de Nascimento: " + contatos[i].dataNascimento);
			}
		}
	}
	
}
