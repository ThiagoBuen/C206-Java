package aula7_ContaCliente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente("Joao Pedro", 1231415123);
		Conta conta1 = new Conta(c1);
		conta1.deposita(5325);
		conta1.saca(1050);
		c1.alterarNome("JP");
		conta1.extrato();
		
		Cliente c2 = new Cliente("Renzo", 98216132);
		Conta conta2 = new Conta(c2);
		conta2.deposita(10000);
		conta2.saca(82990);
		conta2.extrato();
		
		System.out.println("O banco possui " + Conta.getQtdClientes() + " contas");
	}

}
