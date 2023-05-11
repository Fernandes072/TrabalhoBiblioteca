package funcoes;

import java.util.Collection;

import classes.LivrosDisponiveis;
import classes.LivrosEmprestados;
import classes.Professor;
import classes.Usuario;
import classes.UsuariosEmprestimos;

public class Devolucao {

	public static void devolucao(String[] dadosOperacao, Collection<Usuario> usuarios, Collection<LivrosDisponiveis> livrosDisponiveis, Collection<LivrosEmprestados> livrosEmprestados, Collection<UsuariosEmprestimos> usuariosEmprestimos) {

		String nomeUsuario = "";
		boolean veriUsuario = false;
		try {
			int codigoUsuario = Integer.parseInt(dadosOperacao[1]);
			for (Usuario i : usuarios) {
				if (codigoUsuario == i.getCodigo()) {
					veriUsuario = true;
					nomeUsuario = i.getNome();
				}
			}
			if (veriUsuario == false) {
				System.out.println("Erro: Código de usuário não cadastrado");
			}
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Erro: Código de usuário inválido");
		}

		String tituloLivro = "";
		int codigoExem = 0;
		boolean veriLivro = false;
		try {
			int codigoLivro = Integer.parseInt(dadosOperacao[2]);
			for (LivrosEmprestados i : livrosEmprestados) {
				if (codigoLivro == i.getCodigoLivroEm() && veriLivro == false) {
					veriLivro = true;
					codigoExem = i.getCodigoExemplarEm();
					tituloLivro = i.getTituloEm();
				}
			}
			if (veriLivro == false) {
				System.out.println("Erro: Código de livro não encontrado");
			}
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Erro: Código de livro inválido");
		}

		if (veriUsuario == true && veriLivro == true) {
			int codigoUsuario = Integer.parseInt(dadosOperacao[1]);
			int codigoLivro = Integer.parseInt(dadosOperacao[2]);
			for (Usuario i : usuarios) {
				if (codigoUsuario == i.getCodigo()) {
					i.setLimiteLivros(i.getLimiteLivros() + 1);
				}
			}
			LivrosDisponiveis adicionarLivro = new LivrosDisponiveis(codigoLivro, codigoExem, tituloLivro);
			livrosDisponiveis.add(adicionarLivro);
			LivrosEmprestados removerLivro = new LivrosEmprestados(codigoLivro, 0, null,null,null);
			livrosEmprestados.remove(removerLivro);
			for (UsuariosEmprestimos j:usuariosEmprestimos) {
				if (j.getCodigoExemplarU() == codigoExem && j.getSituacaoLivro().equals("Emprestado") == true) {
					j.setSituacaoLivro("Devolvido");
				}
			}
			System.out.println("Devolução realizada com sucesso");
			System.out.println("Nome usuário: " + nomeUsuario);
			System.out.println("Título livro: " + tituloLivro);
		}
	}
}