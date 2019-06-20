package br.com.alura.aula6;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		
		int idade = 20;
		int quantidadePessoas = 1;
		boolean acompanhado;
		
		if (quantidadePessoas > 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Bem vindo");
		} else {
			System.out.println("Voce não tem permissão");
		}
	}
}
