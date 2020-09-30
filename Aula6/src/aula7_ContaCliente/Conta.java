package aula7_ContaCliente;

public class Conta {
	private static int qtdClientes;
	
	private double saldo;
	
	private Cliente cliente;

	public Conta(Cliente cliente) {
		this.cliente = cliente;
		this.qtdClientes++;
	}
	
	public void deposita(double valor) {
		saldo += valor;
		System.out.println("Valor depositado: " + valor);
		System.out.println("Saldo total: " + saldo);
	}
	
	public void saca(double valor) {
		if (valor > saldo) {
			System.out.println("Saldo insuficiente");
		}else {
			saldo -= valor;
			System.out.println("Valor sacado: " + valor);
			System.out.println("Saldo total: " + saldo);
			
		}
	}
	
	public void extrato() {
		System.out.println("*********** EXTRATO ***************");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Saldo disponível: " + saldo);
		
	}
	
	
	
	public static int getQtdClientes() {
		return qtdClientes;
	}

	 
}
