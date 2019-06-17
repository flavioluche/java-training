package br.com.alura.java3.bytebank;

public class TesteSistema {
	public static void main(String[] args) {
	
		Gerente g = new Gerente();
		
		g.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		
		Administrador a = new Administrador();
		
		a.setSenha(222);
		
		
		si.autentica(a);
	}
}
