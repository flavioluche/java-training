package br.com.alura.java4.bytebank.herdado_conta;

public class SaldoInsufucienteException extends Exception {
	
	public SaldoInsufucienteException(String msg) {
		super(msg);
	}

}
