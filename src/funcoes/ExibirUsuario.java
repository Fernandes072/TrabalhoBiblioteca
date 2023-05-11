package funcoes;

import java.util.Collection;
import java.util.ArrayList;
import classes.UsuariosEmprestimos;
import classes.Usuario;
import classes.Aluno;
import classes.AlunoGraduacao;
import classes.Tecnico;
import classes.Professor;
import classes.Livro;

public class ExibirUsuario {

	public static void exibirUsuario(String[] dadosOperacao, Collection<Usuario> usuarios,
			Collection<UsuariosEmprestimos> usuariosEmprestimos, Collection<Livro> livros) {

		boolean veriUsuario = false;
		String tipoUsuario = "";
		try {
			int codigoUsuario = Integer.parseInt(dadosOperacao[1]);
			for (Usuario i : usuarios) {
				if (codigoUsuario == i.getCodigo()) {
					veriUsuario = true;
					if (i instanceof Aluno) {
						tipoUsuario = "Aluno";
					} else if (i instanceof AlunoGraduacao) {
						tipoUsuario = "Aluno pós-graduação";
					} else if (i instanceof Tecnico) {
						tipoUsuario = "Técnico Administrativo";
					} else if (i instanceof Professor) {
						tipoUsuario = "Professor";
					}
					System.out.println(
							"Código usuário: " + i.getCodigo() + " / Nome: " + i.getNome() + " / Tipo: " + tipoUsuario);
				}
			}
			if (veriUsuario == false) {
				System.out.println("Erro: Código de usuário inválido");
			}
			if (veriUsuario == true) {
				for (UsuariosEmprestimos i : usuariosEmprestimos) {
					if (codigoUsuario == i.getCodigoUsuario()) {
						for (Livro l : livros) {
							if (i.getCodigoLivro() == l.getCodigo()) {
								System.out.println("Título: " + l.getTitulo() + " / Data Empréstimo: "
										+ i.getDataEmprestimo() + " / Data Devolução: " + i.getDataDevolucao()
										+ " / Status: " + i.getSituacaoLivro());
							}
						}
					}
				}
			}
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Erro: Código de usuário inválido");
		}
	}
}