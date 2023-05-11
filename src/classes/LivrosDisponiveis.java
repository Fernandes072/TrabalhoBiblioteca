package classes;

import java.util.Objects;

public class LivrosDisponiveis {
	
	private int codigoLivro;
	
	private int codigoExemplar;
	
	private String titulo;
	
	public LivrosDisponiveis () {
		
	}
	
	public LivrosDisponiveis (int codigoLivro, int codigoExemplar, String titulo) {
		setCodigoLivro(codigoLivro);
		setCodigoExemplar(codigoExemplar);
		setTitulo(titulo);
	}

	public int getCodigoLivro() {
		return codigoLivro;
	}

	public void setCodigoLivro(int codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

	public int getCodigoExemplar() {
		return codigoExemplar;
	}

	public void setCodigoExemplar(int codigoExemplar) {
		this.codigoExemplar = codigoExemplar;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigoLivro);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean retorno = false;
		if ((obj != null) && (obj instanceof LivrosDisponiveis)) {
			LivrosDisponiveis ld = (LivrosDisponiveis) obj;
			if ((ld.getCodigoLivro() == getCodigoLivro())) {
				retorno = true;
			}
		}
		return retorno;
	}
	
	
}