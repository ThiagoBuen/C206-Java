package Exercicio2;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Contato c1 = new Contato("Joao Pedro", "joao@gmail.com", "3599760853", "20/12/1996");
		Contato c2 = new Contato("Gustavo Pessa", "gustavo@gmail.com", "1231858", "18/11/1997");
		
		Empresa empresa = new Empresa("12395814", "Rua Quito Carneiro, 282");
		empresa.contatos = new Contato[5];
		
		empresa.contatos[0] = c1;
		empresa.contatos[1] = c2;
		
		empresa.exibirInfos();
		
	}

}
