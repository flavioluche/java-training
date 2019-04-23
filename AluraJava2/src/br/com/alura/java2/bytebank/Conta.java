package br.com.alura.java2.bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int conta;
	private int dac;
	private static int total = 0;
	private Cliente titular = new Cliente();
	
	public Conta(int agencia, int conta, int dac) {
		
		setAgencia(agencia);
		setConta(conta);
		setDac(dac);
		Conta.total++;
		System.out.println(getTotal() + " Nova conta Criada: " + getAgencia() + " " + getConta()+ "-" + getDac());
	}
	


	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
		
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			//this.saldo -= valor;
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getDac() {
		return dac;
	}

	public void setDac(int dac) {
		this.dac = dac;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return total;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}
}