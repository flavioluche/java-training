package br.com.alura.java3.bytebank;

public class TestaGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Anastacio");
		g1.setCpf("09876543212");
		g1.setSalario(6000.0);
		g1.setSenha(2222);
		
		boolean autenticou = g1.autentica(2222);
		System.out.println("Nome: "+ g1.getNome() + " CPF: "+g1.getCpf()+" Salario: "+g1.getSalario()+" senha válida: "
				+ autenticou + " Bonificação: "+g1.getBonificacao());
	}
	
}
