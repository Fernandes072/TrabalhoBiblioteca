package testes;

public class h {
	public static void main(String[] args) {
		String operacao = "aa/bb";
		String dadosOperacao[] = new String[6];
		dadosOperacao=operacao.split("/");
		try {
			System.out.println(dadosOperacao[2]);
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro");
		}
		
	}
}