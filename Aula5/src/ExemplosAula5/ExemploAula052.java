package ExemplosAula5;

public class ExemploAula052 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method 
		
		int[] codigos = {100, 200, 300, 400, 500, 600, 700, 800, 900};
		
		for (int codigo : codigos) 
		{
			System.out.println("Códigos: " + codigo);
		}
		
		Conta[] contas = new Conta[5];
		
		
		Conta c1 = new Conta("Joao Pedro", 1500);
		Conta c2 = new Conta("Renzo", 3500);
		
		contas[0] = c1;
		contas[1] = c2;
		

		for (Conta conta : contas) 
		{
			if(conta != null)
			{
				System.out.println("Nome: " + conta.nome);
				System.out.println("Salario: " + conta.saldo);	
			}
		}
		
		
		
		
		for(int i = 0; i < contas.length; i++)
		{	//TO avoid null exceptions
			contas[i] = new Conta();
		}
		
		for(int i = 0; i < contas.length; i++)
		{
			System.out.println("Nome: " + contas[i].nome);
			System.out.println("Salario: " + contas[i].saldo);
		}
			
	}

}
