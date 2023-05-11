package classes;

public class Professor extends Usuario {
	
	private int limiteLivros;
	
	private int limiteDias;
	
	public Professor() {
		
	}
	
	public Professor(int codigo, String nome, int limiteDias) {
		super(codigo, nome);
		setLimiteDias(limiteDias);
	}
	
	public int getLimiteLivros() {
		return limiteLivros;
	}

	public void setLimiteLivros(int limiteLivros) {
		this.limiteLivros = limiteLivros;
	}
	
	public int getLimiteDias() {
		return limiteDias;
	}
	
	public void setLimiteDias(int limiteDias) {
		this.limiteDias=limiteDias;
	}
	
	public String toString() {
		return "Nome: "+getNome()+" / Código: "+getCodigo()+" / Limite de dias: "+getLimiteDias();
	}
}