package br.com.alura.java3.bytebank;

public class FuncionarioAutenticavel extends Funcionario {

	@Override
	public double getBonificacao() {
		return 0;
	}

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
	}
}
