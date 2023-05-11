package classes;

import java.util.Objects;

public class UsuariosEmprestimos {
	
	private int codigoUsuario;
	
	private String nomeUsuario;
	
	private int codigoLivro;
	
	private String dataEmprestimo;
	
	private String dataDevolucao;
	
	private int codigoExemplarU;
	
	private String situacaoLivro;
	
	public UsuariosEmprestimos() {
		
	}
	
	public UsuariosEmprestimos(int codigoUsuario, String nomeUsuario, int codigoLivro, String dataEmprestimo, String dataDevolucao, int codigoExemplarU, String situacaoLivro) {
		setCodigoUsuario(codigoUsuario);
		setNomeUsuario(nomeUsuario);
		setCodigoLivro(codigoLivro);
		setDataEmprestimo(dataEmprestimo);
		setDataDevolucao(dataDevolucao);
		setCodigoExemplarU(codigoExemplarU);
		setSituacaoLivro(situacaoLivro);
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public int getCodigoLivro() {
		return codigoLivro;
	}

	public void setCodigoLivro(int codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

	public String getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public int getCodigoExemplarU() {
		return codigoExemplarU;
	}

	public void setCodigoExemplarU(int codigoExemplarU) {
		this.codigoExemplarU = codigoExemplarU;
	}

	public String getSituacaoLivro() {
		return situacaoLivro;
	}

	public void setSituacaoLivro(String situacaoLivro) {
		this.situacaoLivro = situacaoLivro;
	}
}