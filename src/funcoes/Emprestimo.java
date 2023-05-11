package funcoes;

import java.util.Collection;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import classes.Usuario;
import classes.UsuariosEmprestimos;
import classes.LivrosDisponiveis;
import classes.LivrosEmprestados;
import classes.Aluno;
import classes.AlunoGraduacao;
import classes.Tecnico;
import classes.Professor;

public class Emprestimo {

	public static void emprestimo(String[] dadosOperacao, Collection<Usuario> usuarios,
			Collection<LivrosDisponiveis> livrosDisponiveis, Collection<LivrosEmprestados> livrosEmprestados,
			Collection<UsuariosEmprestimos> usuariosEmprestimos) {

		String nomeUsuario = "";
		boolean veriUsuario = false;
		int limiteDias = 0;
		try {
			int codigoUsuario = Integer.parseInt(dadosOperacao[1]);
			for (Usuario i : usuarios) {
				if (codigoUsuario == i.getCodigo()) {
					veriUsuario = true;
					nomeUsuario = i.getNome();
					limiteDias = i.getLimiteDias();
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
		boolean livroIgual = false;
		try {
			int codigoLivro = Integer.parseInt(dadosOperacao[2]);
			for (LivrosDisponiveis i : livrosDisponiveis) {
				if (codigoLivro == i.getCodigoLivro() && veriLivro == false) {
					veriLivro = true;
					codigoExem = i.getCodigoExemplar();
					tituloLivro = i.getTitulo();
				}
			}
			int codigoUsuario = Integer.parseInt(dadosOperacao[1]);
			for (UsuariosEmprestimos i : usuariosEmprestimos) {
				for (Usuario j : usuarios) {
					if (codigoLivro == i.getCodigoLivro() && codigoUsuario == i.getCodigoUsuario() && j instanceof Professor == false  && codigoExem == i.getCodigoExemplarU() && i.getSituacaoLivro().equals("Emprestado") == true) {
						livroIgual = true;
					}
				}
			}
			if (livroIgual==true) {
				System.out.println("Erro: Usuário com empréstimo de mesmo livro");
			}
			if (veriLivro == false) {
				System.out.println("Erro: Código de livro não encontrado");
			}
		} catch (java.lang.NumberFormatException e) {
			System.out.println("Erro: Código de livro inválido");
		}

		if (veriUsuario == true && veriLivro == true  && livroIgual==false) {
			int codigoUsuario = Integer.parseInt(dadosOperacao[1]);
			int codigoLivro = Integer.parseInt(dadosOperacao[2]);
			int limiteLivros = 0;
			boolean veriProfessor = false;
			for (Usuario i : usuarios) {
				if (codigoUsuario == i.getCodigo()) {
					limiteLivros = i.getLimiteLivros();
					if (i instanceof Professor) {
						veriProfessor = true;
					}
				}
			}
			if (limiteLivros > 0 || veriProfessor == true) {
				for (Usuario i : usuarios) {
					if (codigoUsuario == i.getCodigo()) {
						i.setLimiteLivros(i.getLimiteLivros() - 1);
					}
				}
				LocalDateTime dataEmprestimo = LocalDateTime.now();
				LocalDateTime dataDevolucao = dataEmprestimo.plusDays(limiteDias);
				String dataEmprestimoFormatada = dataEmprestimo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				String dataDevolucaoFormatada = dataDevolucao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				UsuariosEmprestimos adicionar = new UsuariosEmprestimos(codigoUsuario, nomeUsuario, codigoLivro,dataEmprestimoFormatada, dataDevolucaoFormatada, codigoExem,"Emprestado");
				usuariosEmprestimos.add(adicionar);
				LivrosDisponiveis removerLivro = new LivrosDisponiveis(codigoLivro, 0, null);
				livrosDisponiveis.remove(removerLivro);
				LivrosEmprestados adicionarLivro = new LivrosEmprestados(codigoLivro, codigoExem, tituloLivro,dataEmprestimoFormatada, dataDevolucaoFormatada);
				livrosEmprestados.add(adicionarLivro);
				System.out.println("Empréstimo realizado com sucesso");
				System.out.println("Nome usuário: " + nomeUsuario);
				System.out.println("Título livro: " + tituloLivro);
				System.out.println("Data de empréstimo: " + dataEmprestimoFormatada);
				System.out.println("Data de devolução: " + dataDevolucaoFormatada);
			} else {
				System.out.println("Erro: Limite de Livros");
			}
		}
	}
}