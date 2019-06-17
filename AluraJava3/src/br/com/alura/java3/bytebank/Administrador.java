package br.com.alura.java3.bytebank;

public class Administrador extends Funcionario implements Autenticavel {

	@Override
	public double getBonificacao() {
		
		return 200;
	}
	
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

}
