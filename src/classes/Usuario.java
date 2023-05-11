package classes;

public abstract class Usuario {
	
	private int codigo;
	
	private String nome;
	
	public Usuario() {
		
	}
	
	public Usuario(int codigo, String nome) {
		setCodigo(codigo);
		setNome(nome);
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public abstract int getLimiteDias();
	
	public abstract void setLimiteDias(int limiteDias);
	
	public abstract int getLimiteLivros();
	
	public abstract void setLimiteLivros(int limiteLivros);
	
	public String toString() {
		return "Nome: "+getNome();
	}

}