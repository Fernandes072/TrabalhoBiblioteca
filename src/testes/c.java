package testes;

import java.util.Collection;
import java.util.ArrayList;
import classes.Usuario;
import classes.Aluno;

public class c {

	public static void main(String[] args) {
		Collection<Usuario> usuarios = new ArrayList<Usuario>();
		Aluno adicionar = new Aluno(200,"A",5,3);
		usuarios.add(adicionar);
		for (Usuario i:usuarios) {
			System.out.println(i.getLimiteLivros());
			i.setLimiteLivros(i.getLimiteLivros()-1);
			System.out.println(i.getLimiteLivros());
		}
	}

}
