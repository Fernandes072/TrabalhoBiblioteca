package testes;

import java.util.ArrayList;
import java.util.Collection;

import classes.UsuariosEmprestimos;

public class e {

	public static void main(String[] args) {
		
		Collection<UsuariosEmprestimos> usuariosEmprestimos = new ArrayList<UsuariosEmprestimos>();
		UsuariosEmprestimos adicionar = new UsuariosEmprestimos(1,"um",1,"um","um",1,"um");
		usuariosEmprestimos.add(adicionar);
		for (UsuariosEmprestimos i:usuariosEmprestimos) {
			System.out.println(i.getNomeUsuario());
		}
	}

}
