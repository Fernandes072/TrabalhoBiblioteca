package testes;

public class g {

	public static void main(String[] args) {
		try {
			String operacao = "aa/bb";
		String dadosOperacao[] = new String[6];
		dadosOperacao = operacao.split("/");
		System.out.println(dadosOperacao[2]);
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			
		}
		
	}
}