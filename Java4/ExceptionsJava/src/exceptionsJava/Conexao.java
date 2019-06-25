package exceptionsJava;

public class Conexao {
		
	public Conexao() {
		System.out.println("Abrindo a conexão");
	}
	
	public void leDados() {
		System.out.println("Recebendo Dados");
		throw new IllegalStateException();
	}
	
	public void fecha() {
		System.out.println("Fechando conexão");
	}


}
