package funcoes;

import java.util.Collection;
import classes.Livro;
import classes.LivrosDisponiveis;
import classes.LivrosEmprestados;
import classes.UsuariosEmprestimos;


public class OpcaoLivro {
		
	public static void imprimirLivros(String[] dadosOperacao, Collection<Livro> livros, Collection<LivrosDisponiveis> livrosDisponiveis, Collection<LivrosEmprestados> livrosEmprestados, Collection<UsuariosEmprestimos> usuariosEmprestimos) {
		try {
			if (dadosOperacao[1].equals("*")==true) {
				for (Livro i:livros) {
					System.out.println(i.toString());
				}
			} else if (dadosOperacao[1].equals("*")==false) {
				boolean veriLivro = false;
				int codigo = Integer.parseInt(dadosOperacao[1]);
				for (LivrosDisponiveis i:livrosDisponiveis) {
					if (codigo==i.getCodigoLivro()) {
						veriLivro = true;
						System.out.println("Título: "+i.getTitulo()+" / Exemplar "+i.getCodigoExemplar()+": Disponível");
					}
				}
				for (LivrosEmprestados i:livrosEmprestados) {
					if (codigo==i.getCodigoLivroEm()) {
						int codigoExem = i.getCodigoExemplarEm();
						veriLivro = true;
						boolean veriUnico=false;
						for (UsuariosEmprestimos j: usuariosEmprestimos) {
							if (codigoExem==j.getCodigoExemplarU() && veriUnico==false) {
								veriUnico=true;
								System.out.println("Título: "+i.getTituloEm()+" / Exemplar "+i.getCodigoExemplarEm()+": Emprestado"+" / Nome Usuário: "+j.getNomeUsuario()+" / Data Empréstimo: "+j.getDataEmprestimo()+" / Data Devolução: "+j.getDataDevolucao());
							}
						}
					}
				}
				if (veriLivro==false) {
					System.out.println("Erro: Código de livro inválido");
				}
			}
		} catch(java.lang.NumberFormatException e) {
			System.out.println("Erro: Código de livro inválido");
		}
	}
}