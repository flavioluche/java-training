package br.com.alura.java3.bytebank.herdado_conta;

public class ContaCorrente extends Conta implements Tributavel {
	// construtores não são herdados então tenho que criá-los aqui 
	// referenciando a classe mãe
	public ContaCorrente(int agencia, int conta, int dac) {
		super(agencia, conta, dac);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorSacado = valor + 0.2;
		return super.saca(valorSacado);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {

		return super.saldo * 0.01;
		
	}
}
