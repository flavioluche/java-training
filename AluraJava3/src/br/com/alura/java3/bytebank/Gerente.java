package br.com.alura.java3.bytebank;

public class Gerente extends Funcionario implements Autenticavel{
	private int senha;
	
	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}
	
	
}
