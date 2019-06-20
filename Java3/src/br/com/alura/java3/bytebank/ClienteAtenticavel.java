package br.com.alura.java3.bytebank;

public class ClienteAtenticavel implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public ClienteAtenticavel() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		
		return this.autenticador.autentica(senha);
	}
	

}
