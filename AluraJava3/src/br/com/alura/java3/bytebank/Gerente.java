package br.com.alura.java3.bytebank;

public class Gerente extends FuncionarioAutenticavel{
	private int senha;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}
	
	
}
