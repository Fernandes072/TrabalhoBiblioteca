package programaPrincipal;

import java.util.Date;
import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import classes.Usuario;
import classes.Livro;
import classes.LivrosDisponiveis;
import classes.LivrosEmprestados;
import classes.UsuariosEmprestimos;
import funcoes.Cadastro;
import funcoes.OpcaoLivro;
import funcoes.AdicionarLivros;
import funcoes.Emprestimo;
import funcoes.Devolucao;
import funcoes.ExibirUsuario;

public class Execucao {
	
	public static void main(String[]args) {
		
		//Crindo e adicionando os livros
		Collection<Livro> livros = new ArrayList<Livro>();
		Collection<LivrosDisponiveis> livrosDisponiveis = new ArrayList<LivrosDisponiveis>();
		Collection<LivrosEmprestados> livrosEmprestados = new ArrayList<LivrosEmprestados>();
		AdicionarLivros.adicionarLivros(livros,livrosDisponiveis);
		
		Scanner ler = new Scanner(System.in);
		Collection<Usuario> usuarios = new ArrayList<Usuario>();
		Collection<UsuariosEmprestimos> usuariosEmprestimos = new ArrayList<UsuariosEmprestimos>();
		
		System.out.print("Operação: ");
		String operacao = ler.nextLine();
		while (operacao.equals("sai")==false) {
			try {
				String dadosOperacao[] = new String[6];
				dadosOperacao = operacao.split("/");
				String passar = dadosOperacao[1]; //Para exibir alguma coisa quando não digita nada
				if (dadosOperacao[0].equals("usu")==true && dadosOperacao.length==5) {
					Cadastro.cadastro(dadosOperacao, usuarios);
				} else if(dadosOperacao[0].equals("emp")==true) {
					Emprestimo.emprestimo(dadosOperacao, usuarios, livrosDisponiveis, livrosEmprestados, usuariosEmprestimos);
				} else if(dadosOperacao[0].equals("dev")==true) {
					Devolucao.devolucao(dadosOperacao, usuarios, livrosDisponiveis, livrosEmprestados, usuariosEmprestimos);
				} else if(dadosOperacao[0].equals("liv")==true) {
					OpcaoLivro.imprimirLivros(dadosOperacao, livros, livrosDisponiveis, livrosEmprestados, usuariosEmprestimos);
				} else if (dadosOperacao[0].equals("usu")==true && dadosOperacao.length==2) {
					ExibirUsuario.exibirUsuario(dadosOperacao, usuarios, usuariosEmprestimos, livros);
				}
			} catch (java.lang.ArrayIndexOutOfBoundsException e){
				System.out.println("Erro: Informações insuficientes para operação");
			}
			System.out.println();
			System.out.print("Operação: ");
			operacao = ler.nextLine();
		} 
		System.out.println("Programa Finalizado");
		ler.close();
	}
}