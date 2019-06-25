package exceptionsJava;

public class Conexao implements AutoCloseable {
		
	public Conexao() {
		System.out.println("Abrindo a conexão");
	}
	
	public void leDados() {
		System.out.println("Recebendo Dados");
		throw new IllegalStateException();
	}

	@Override
	public void close() {
		System.out.println("Fechando conexão");
		
	}


}
