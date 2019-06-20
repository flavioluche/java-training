package ExceptionsJava;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        }catch (ArithmeticException | NullPointerException | CustomException ex) {
        	System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws CustomException {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws CustomException {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            Conta c = null;
            //c.deposita();
            throw new CustomException("There is an error!");
        }
        System.out.println("Fim do metodo2");        
    }
}
