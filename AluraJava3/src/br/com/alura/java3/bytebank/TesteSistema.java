package br.com.alura.java3.bytebank;

public class TesteSistema {
	public static void main(String[] args) {
	
		Autenticavel g = new Gerente();
		
		g.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		Autenticavel a = new Administrador();
		
		a.setSenha(222);
		
		
		si.autentica(a);
	}
}
