package testes;

public class f {
	public static void main(String[] args) {
		String operacao = "aa/bb";
		String dadosOperacao[] = new String[6];
		dadosOperacao = operacao.split("/");
		/*
		 * for (String i : dadosOperacao) { System.out.println(i); }
		 */
		System.out.println(dadosOperacao[1]);
		operacao = "aa/bb/cc";
		dadosOperacao = operacao.split("/");
		System.out.println(dadosOperacao.length);
		System.out.println(dadosOperacao[2]);
		operacao = "aa/bb";

		dadosOperacao = operacao.split("/");
		System.out.println(dadosOperacao[1]);
		System.out.println(dadosOperacao.length);

	}
}