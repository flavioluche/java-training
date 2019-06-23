package br.com.alura.java4.bytebank.herdado_conta;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1500, 12345, 1);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();

        calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());
    }

}
