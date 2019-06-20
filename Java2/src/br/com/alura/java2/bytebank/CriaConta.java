package br.com.alura.java2.bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta(1234,1234567,1);
		
		//primeiraConta.saldo = 200.0;
		//primeiraConta.setSaldo(200.0);
		primeiraConta.deposita(200.0);
		
		//System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		System.out.println("Saldo primeira conta: " + primeiraConta.getSaldo());
		
		//primeiraConta.setSaldo(primeiraConta.getSaldo() + 100.0);
		primeiraConta.deposita(primeiraConta.getSaldo() + 100.0);
		
		System.out.println("Saldo primeira conta: " + primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta(1234,1234567,2);
		
		//segundaConta.setSaldo(50.0);
		segundaConta.deposita(50.0);
		
		System.out.println("Saldo segunda conta: " + segundaConta.getSaldo());
		
		//mostrando os valores das referências
		System.out.println(primeiraConta + " | " + segundaConta);
		
	}
}
