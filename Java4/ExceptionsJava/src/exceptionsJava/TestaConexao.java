package exceptionsJava;

public class TestaConexao {

	public static void main(String[] args) {
			
		Conexao con = null;
		try {
			con = new Conexao();
			con.leDados();
			con.fecha();
		} catch (IllegalStateException ex) {
			System.out.println("Falha na conexão");
		} finally {
			con.fecha();
		}
			
			

	}

}
