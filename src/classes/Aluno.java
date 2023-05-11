package classes;

public class Aluno extends Usuario{
	
	private int limiteLivros;
	
	private int limiteDias;
	
	public Aluno() {
		
	}
	
	public Aluno(int codigo, String nome, int limiteDias, int limiteLivros) {
		super(codigo, nome);
		setLimiteLivros(limiteLivros);
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
}