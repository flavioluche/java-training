package br.com.alura.java4.bytebank.herdado_conta;

public class SeguroDeVida implements Tributavel{

	@Override
	public double getValorImposto() {
		return 42.0;
	}

}
