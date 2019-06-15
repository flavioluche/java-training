package br.com.alura.java3.bytebank.herdado_conta;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente ccorrente = new ContaCorrente(1500, 12345, 4);
		
		ContaPoupanca cpoupanca = new ContaPoupanca(1500, 12345, 500);
		
		ccorrente.deposita(200);
		cpoupanca.deposita(150);
		
		ccorrente.transfere(50, cpoupanca);
		
		System.out.println("Saldo Conta Corrente " + ccorrente.getSaldo());
		System.out.println("Saldo Conta Poupança " + cpoupanca.getSaldo());
		

	}

}
