package br.com.alura.java2.bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta(1234,1234567,1);
		Conta contaDaMarcela = new Conta(1234,1234567,2);
		
		//contaDoPaulo.titular.nome="Paulo";
		contaDoPaulo.getTitular().setNome("Paulo");
		contaDoPaulo.deposita(30);
		
		contaDaMarcela.getTitular().setNome("Marcela");
		contaDaMarcela.deposita(1000);
		
		//System.out.println("Paulo: " + contaDoPaulo.saldo + "  | Marcela: " + contaDaMarcela.saldo);
		//System.out.println(contaDoPaulo.titular.nome + ": " + contaDoPaulo.getSaldo() + "  |  " + contaDaMarcela.titular.nome + ": " + contaDaMarcela.getSaldo());
		System.out.println(contaDoPaulo.getTitular().getNome()+ ": " + contaDoPaulo.getSaldo() + "  |  " + contaDaMarcela.getTitular().getNome() + ": " + contaDaMarcela.getSaldo());
		
		if(contaDaMarcela.transfere(100, contaDoPaulo)) {
			System.out.println("Transferência concluída com sucesso.");
		} else {
			System.out.println("Transferência não pode ser executada.");
		};
		
		System.out.println(contaDoPaulo.getTitular().getNome()+ ": " + contaDoPaulo.getSaldo() + "  |  " + contaDaMarcela.getTitular().getNome() + ": " + contaDaMarcela.getSaldo());
		
		contaDoPaulo.saca(30);
		
		System.out.println(contaDoPaulo.getTitular().getNome()+ ": " + contaDoPaulo.getSaldo() + "  |  " + contaDaMarcela.getTitular().getNome() + ": " + contaDaMarcela.getSaldo());
		
		
	}
}
