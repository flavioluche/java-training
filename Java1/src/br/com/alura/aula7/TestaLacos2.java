package br.com.alura.aula7;

public class TestaLacos2 {
	public static void main(String[] args) {
		for (int linha = 0; linha < 5; linha ++) {
			for (int coluna =0; coluna <= linha; coluna++) {
				//if (coluna > linha) {
				//	break;
				//}
				System.out.print(coluna + 1);
			}
		System.out.println();
		}
	}
}
