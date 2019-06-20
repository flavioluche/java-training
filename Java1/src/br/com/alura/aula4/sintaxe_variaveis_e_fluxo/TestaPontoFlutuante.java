package br.com.alura.aula4.sintaxe_variaveis_e_fluxo;

public class TestaPontoFlutuante {
	
	public static void main (String[] args) {
		double salario;
		salario = 432.40;
		System.out.println("Seu salário mensal é: " + salario);
		
		//int idade = 3.0;  NÃO COMPILA
		
		//inicialização e declaração na mesma linha
		int calculo = 5/2;
		//resultado de divisão de inteiros é inteiro
		System.out.println(calculo);
		
		double calculo2 = 5/2;
		System.out.println(calculo2); 
		//divisão de números inteiros, o resultado é inteiro
		
		double calculo3 = 5.0/2;
		System.out.println(calculo3);
		//divisão com número decimal, resultado com decimal
		
	}
	
}
