package StreamingVIdeo;

import java.util.Locale;
import java.util.Scanner;




public class Main 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int option = -1;
		String plataforma1;
		plataforma1 = "0";
		int numSerie = 0;
		String produtoraNome, produtoraDiretor;
		
		Plataforma plataforma = null;
		
		while(option != 0)
		{
			System.out.println("******   Streaming de V�deo   ******");
			System.out.println();
			System.out.println();
			System.out.println("MENU:");
			System.out.println("[1] - Criar servi�o de Streaming ");
			System.out.println("[2] - Cadastrar S�rie ");
			System.out.println("[3] - Mostrar S�ries Cadastradas ");
			System.out.println("[4] - Mostrar a M�dia das Notas das S�ries");
			System.out.println("[5] - Mostrar Todas as Informa��es");
			System.out.println("[0] - Sair ");
			System.out.println();
			System.out.println("***************************");
			System.out.println();
			System.out.println("Entre com uma op��o");
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option)
			{
				case 1:
					System.out.println("******   Cadastrar Servi�o de Streaming   ******");
					String servicoNome, servicoEmpresa, servicoDominio, servicoData, servicoFundador;
					servicoNome = null;
					servicoEmpresa = null;
					servicoDominio = null;
					servicoData = null;
					servicoFundador = null;
					
					while(servicoNome == null)
					{
						System.out.println("Entre com o nome do servi�o de streaming:");
						servicoNome= sc.nextLine();
					}
					
					while(servicoEmpresa == null)
					{
						System.out.println("Entre com o nome da empresa de streaming:");
						servicoEmpresa= sc.nextLine();
					}
					
					while(servicoDominio == null)
					{
						System.out.println("Entre com o nome do dom�nio de streaming:");
						servicoDominio = sc.nextLine();
					}
					
					while(servicoData == null)
					{
						System.out.println("Entre com o a data de funda��o do servi�o de streaming:");
						servicoData= sc.nextLine();
					}
					
					while(servicoFundador == null)
					{
						System.out.println("Entre com o nome do fundador do servi�o de streaming:");
						servicoFundador= sc.nextLine();
					}
					
					plataforma = new Plataforma(servicoNome, servicoEmpresa, servicoDominio, servicoData, servicoFundador);
					System.out.println("Servi�o de streaming criado!");
					plataforma1 = "Criado";
					
				break;
						
				case 2:
					if(plataforma1 != "0")
					{
						System.out.println("******   Cadastrar S�rie de Streaming   ******");
						
						String serieNome, serieCategoria;
						double serieNota;
						int serieTemporadas;
						String[] serieAtores = {"a","b","c"};
						serieNome = null;
						serieCategoria = null;
						serieNota = 0;
						serieTemporadas = 0;
						
						while(serieNome == null)
						{
							System.out.println("Entre com o nome da s�rie:");
							serieNome= sc.nextLine();
						}
						
						while(serieCategoria == null)
						{
							System.out.println("Entre com a categoria da s�rie:");
							serieCategoria= sc.nextLine();
						}
						
						while(serieNota == 0)
						{
							System.out.println("Entre com a nota da s�rie:");
							serieNota = sc.nextDouble();
						}
						
						while(serieTemporadas == 0)
						{
							System.out.println("Entre com a quantidade de temporadas da s�rie:");
							serieTemporadas= sc.nextInt();
							sc.nextLine();
						}
						
						int[] codigos = {0,1,2};
						
						for (int codigo : codigos) 
						{
							System.out.println("Entre com o nome do "+ Integer.toString(codigo+1) + " ator da s�rie:");
							serieAtores[codigo]= sc.nextLine();
						}
						
						produtoraNome = null;
						produtoraDiretor = null;
						
						while(produtoraNome == null)
						{
							System.out.println("Entre com o nome do servi�o de streaming:");
							produtoraNome= sc.nextLine();
						}
						
						while(produtoraDiretor == null)
						{
							System.out.println("Entre com o nome da empresa de streaming:");
							produtoraDiretor= sc.nextLine();
						}
						
						Produtora produtora= new Produtora(produtoraNome, produtoraDiretor);
						

						Serie serie = new Serie(serieNome, serieCategoria, serieNota, serieTemporadas, serieAtores, produtora);
						plataforma.series[numSerie] = serie;
						numSerie += 1;
					}
					else
					{
						System.out.println("Favor cadastrar o servi�o de streaming antes!");
					}
					
				break;
				
				case 3:
					if(plataforma1 != "0")
					{
						plataforma.exibirSeries();
					}
					else
					{
						System.out.println("Favor cadastrar o servi�o de streaming antes!");
					}
					
					
				break;
					
				case 4:
					if(plataforma1 != "0")
					{
						double media;
						media = plataforma.calculaMediaNotas();
						System.out.println("A m�dia das notas das s�ries �: " + Double.toString(media));
					}
					else
					{
						System.out.println("Favor cadastrar o servi�o de streaming antes!");
					}
					
				break;
				
				case 5:
					plataforma.exibirInfos();

				break;	
				
				case 0:
					System.out.println("At� logo!!");
					option = 0;
				break;
			}
			
		}
		
		sc.close();
		
	}

}
