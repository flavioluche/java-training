package br.com.alura.aula6;

public class CalculoDeAliquota {
		public static void main(String[] args) {
			double salario = 3345.0;
			
			if (salario <= 1899.99) {
				System.out.println("Não possui aliquota ou dedução");
			} else if (salario >= 1900.0 && salario <= 2800.0) {
				System.out.println("A aliquota é 7.5% e a dedução na declaração é de até R$142,00");
			} else if ( salario >= 2800.01 && salario <= 3751.0){
				System.out.println("A aliquota é 15% e a dedução na declaração é de até R$350,00");
			} else if ( salario >= 3751.01 && salario <= 4664.0) {
				System.out.println("A aliquota é 22.5% e a dedução na declaração é de até R$636,00");
			} else if ( salario > 4664.0) {
				System.out.println("A aliquota é mais do que imagina...");
			}
		}
}
