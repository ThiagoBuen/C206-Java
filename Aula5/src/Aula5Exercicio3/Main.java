package Aula5Exercicio3;

public class Main 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Restaurante restaurante = new Restaurante("Huragano", "Rua Oswaldo", "1230504");
		
		restaurante.fornecedores[0].tipo = "Carnes";
		restaurante.fornecedores[0].quantidade = 200;
		
		restaurante.fornecedores[1].tipo = "Frutos do mar";
		restaurante.fornecedores[1].quantidade = 30;
		
		restaurante.exibirInfos();
	}

}
