package br.com.alura.aula7;

public class MultiplosTres {
	public static void main(String[] args) {
		
		//for usando módulo
		for (int contador = 1; contador <= 100; contador++) {
			if (contador % 3 == 0) {
				System.out.print(contador);
				System.out.print(" ");
			}
		}
		
		System.out.println();
		
		for(int contador = 3; contador <= 100; contador += 3) {
			System.out.print(contador);
			System.out.print(" ");
		}
	}
}
