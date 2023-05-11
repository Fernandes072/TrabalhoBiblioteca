package testes;

import java.util.HashMap;
import java.util.Map;

public class a {

	public static void main(String[] args) {
		Map<Integer,String[]> livros = new HashMap<Integer,String[]>();
		String[] informacoes = {"endereco","cnpj","cidade","estado"};
		livros.put(100, informacoes);
	}
}