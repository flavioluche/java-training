package exceptionsJava;

public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {
		Conta c = new Conta();
		
		try {
			c.deposita();
		} catch (CustomException ex) {
			System.out.println("tratamento ...");
		}
	}

}
