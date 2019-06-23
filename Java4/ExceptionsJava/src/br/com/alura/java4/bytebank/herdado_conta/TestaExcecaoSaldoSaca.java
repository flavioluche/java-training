package br.com.alura.java4.bytebank.herdado_conta;

public class TestaExcecaoSaldoSaca {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1500, 12345, 1);
		
		cc.deposita(200.0);
		
		try {
			cc.saca(210.0);
		} catch (SaldoInsufucienteException ex) {
			System.out.println("Exception: " + ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println(cc.getSaldo());

	}

}
