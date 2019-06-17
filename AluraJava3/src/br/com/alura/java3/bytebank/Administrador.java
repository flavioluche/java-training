package br.com.alura.java3.bytebank;

public class Administrador extends FuncionarioAutenticavel {

	@Override
	public double getBonificacao() {
		
		return 200;
	}
	
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

}
