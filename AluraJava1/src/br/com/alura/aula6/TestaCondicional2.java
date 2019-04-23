package br.com.alura.aula6;

public class TestaCondicional2 {
	
	public static void main(String[] args) {
		int idade = 20;
		int quantidaDePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Aee garotão");
		} else {
			if (quantidaDePessoas >= 2) {
				System.out.println("Entra pivete");
			} else {
				System.out.println("Vaza pivete");
			}
		}
	}

}
