package br.com.alura.java4.bytebank.herdado_conta;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente ccorrente = new ContaCorrente(1500, 12345, 4);
		
		ContaPoupanca cpoupanca = new ContaPoupanca(1500, 12345, 500);
		
		ccorrente.deposita(200);
		cpoupanca.deposita(150);
		
		try {
			ccorrente.transfere(210, cpoupanca);
		} catch (SaldoInsufucienteException e) {
			System.out.println("Falha na transferência");
			e.printStackTrace();
		}
		
		System.out.println("Saldo Conta Corrente " + ccorrente.getSaldo());
		System.out.println("Saldo Conta Poupança " + cpoupanca.getSaldo());
		

	}

}
