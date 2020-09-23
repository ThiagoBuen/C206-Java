package StreamingVIdeo;

public class Plataforma 
{
	public String nome;
	public String empresa;
	public String dominio;
	public String dataFundacao;
	public String fundador;
	public Serie[] series = new Serie[10];
	
	public Plataforma(String nome, String empresa, String dominio, String dataFundacao, String fundador) 
	{
		this.nome = nome;
		this.empresa = empresa;
		this.dominio = dominio;
		this.dataFundacao = dataFundacao;
		this.fundador = fundador;
		for(int i=0; i<10; i++)
		{
			series[i] = null;
		}
	}
	
	public void exibirInfos()
	{
		System.out.println("Nome da plataforma: " + nome);
		System.out.println("Empresa: " + empresa);
		System.out.println("Dominio: " + dominio);
		System.out.println("Data de Fundacao: " + dataFundacao);
		System.out.println("Fundador: " + fundador);
		exibirSeries();
	}
	
	public void exibirSeries()
	{
		for(int i=0; i< series.length; i++)
		{
			System.out.println("Catálogo de Séries:");
			if(series[i] != null)
			{
				series[i].mostrarInfos();
			}
			else
			{
				break;
			}
		}
	}
	
	public double calculaMediaNotas()
	{
		int seriesValidas=0;
		double mediaSeries = 0;
		
		for(int i=0; i<series.length; i++)
		{
			if(series[i] != null)
			{
				mediaSeries += series[i].nota;
				seriesValidas += 1;
			}
			else
			{
				break;
			}
		}
		
		if(seriesValidas>0)
		{
			return (mediaSeries/seriesValidas);
		}
		else
		{
			return 0;
		}
	}
}
