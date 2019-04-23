package br.com.alura.java3.bytebank;

public class TestaReferencias {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Adalgiso");
		g1.setSalario(5000.0);
		g1.getBonificacao();
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Kleber");
		f1.setSalario(2000.0);
		f1.getBonificacao();
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Flaviano");
		ev.setSalario(2250.0);
		ev.getBonificacao();
		
		Designer d = new Designer();
		d.setNome("Juca");
		d.setSalario(3000.0);
		d.getBonificacao();
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println("Total: " + controle.getSoma());
		
	}
	
}
