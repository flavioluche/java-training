package br.com.alura.java4.bytebank.herdado_conta;

public class ContaPoupanca extends Conta {
	// construtores não são herdados então tenho que criá-los aqui 
	// referenciando a classe mãe
	public ContaPoupanca(int agencia, int conta, int dac) {
		super(agencia, conta, dac);
	}
	
	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}
}
