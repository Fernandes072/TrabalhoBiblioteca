package classes;

import java.util.Objects;

public class LivrosEmprestados {
	
	private int codigoLivroEm;
	
	private int codigoExemplarEm;
	
	private String tituloEm;
	
	private String dataEmprestimo;
	
	private String dataDevolucao;
	
	public LivrosEmprestados () {
		
	}
	
	public LivrosEmprestados (int codigoLivroEm, int codigoExemplarEm, String tituloEm, String dataEmprestimo, String dataDevolucao) {
		setCodigoLivroEm(codigoLivroEm);
		setCodigoExemplarEm(codigoExemplarEm);
		setTituloEm(tituloEm);
		setDataEmprestimo(dataEmprestimo);
		setDataDevolucao(dataDevolucao);
	}

	public int getCodigoLivroEm() {
		return codigoLivroEm;
	}

	public void setCodigoLivroEm(int codigoLivroEm) {
		this.codigoLivroEm = codigoLivroEm;
	}

	public int getCodigoExemplarEm() {
		return codigoExemplarEm;
	}

	public void setCodigoExemplarEm(int codigoExemplarEm) {
		this.codigoExemplarEm = codigoExemplarEm;
	}

	public String getTituloEm() {
		return tituloEm;
	}

	public void setTituloEm(String tituloEm) {
		this.tituloEm = tituloEm;
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

	@Override
	public int hashCode() {
		return Objects.hash(codigoLivroEm);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean retorno = false;
		if ((obj != null) && (obj instanceof LivrosEmprestados)) {
			LivrosEmprestados ld = (LivrosEmprestados) obj;
			if ((ld.getCodigoLivroEm() == getCodigoLivroEm())) {
				retorno = true;
			}
		}
		return retorno;
	}
	
	
}