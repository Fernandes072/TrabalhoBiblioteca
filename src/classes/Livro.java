package classes;

public class Livro {
	
	private int codigo;
	
	private String titulo;
	
	private String editora;
	
	private String autores;
	
	private String edicao;
	
	private int ano;
	
	public Livro() {
		
	}
	
	public Livro(int codigo, String titulo, String editora, String autores, String edicao, int ano) {
		setCodigo(codigo);
		setTitulo(titulo);
		setEditora(editora);
		setAutores(autores);
		setEdicao(edicao);
		setAno(ano);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public String getEdicao() {
		return edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "Código: "+getCodigo()+" / Título: "+getTitulo()+" / Editora: "+getEditora()+" / Autores: "+getAutores()+" / Edição: "+getEdicao()+" / Ano: "+getAno();
	}
}