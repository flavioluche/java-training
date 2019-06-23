package br.com.alura.java4.bytebank.herdado_conta;

public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int conta;
	private int dac;
	private static int total = 0;
	private Cliente titular;
	
	public Conta(int agencia, int conta, int dac) {
		
		setAgencia(agencia);
		setConta(conta);
		setDac(dac);
		Conta.total++;
		System.out.println(getTotal() + " Nova conta Criada: " + getAgencia() + " " + getConta()+ "-" + getDac());
	}
	


	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsufucienteException{
		
		if (this.saldo < valor) {
			throw new SaldoInsufucienteException("Ex: Saldo: " + this.saldo + " Valor: " + valor);

		}
		
		this.saldo -= valor;
		
	}

	public void transfere(double valor, Conta destino) throws SaldoInsufucienteException{
		
		if (this.saldo < valor) {
			throw new SaldoInsufucienteException("Ex: Saldo: " + this.saldo + " Valor: " + valor);
		}
		
		this.saca(valor);
		destino.deposita(valor);
		
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