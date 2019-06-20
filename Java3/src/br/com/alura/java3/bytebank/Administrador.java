package br.com.alura.java3.bytebank;

public class Administrador extends Funcionario implements Autenticavel {

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		
		return 200;
	}
	
	private AutenticacaoUtil autenticador;
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		
		return this.autenticador.autentica(senha);
	}

}
