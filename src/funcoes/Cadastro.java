package funcoes;

import java.util.Collection;
import classes.Usuario;
import classes.Aluno;
import classes.AlunoGraduacao;
import classes.Tecnico;
import classes.Professor;


public class Cadastro {
	
	public static void cadastro(String[] dadosOperacao, Collection<Usuario> usuarios) {
		int codigo = Integer.parseInt(dadosOperacao[1]);
		
		boolean veriCodigoUsuario=false;
		for (Usuario i: usuarios) {
			if (i.getCodigo()==codigo) {
				veriCodigoUsuario = true;
			}
		}
		
		boolean veriTipoUsuario=false;
		if (dadosOperacao[3].equals("alu")==true || dadosOperacao[3].equals("pos")==true || dadosOperacao[3].equals("tec")==true || dadosOperacao[3].equals("pro")==true){
			veriTipoUsuario=true;
		} else {
			System.out.println("Erro: Tipo de usuário inválido");
		}
		
		if (veriCodigoUsuario==true){
			System.out.println("Erro: Código de usuário já cadastrado");
		}
		
		if (veriCodigoUsuario==false && veriTipoUsuario==true){
			if(dadosOperacao[3].equals("alu")==true) {
				Aluno adicionar = new Aluno(codigo,dadosOperacao[4],5,3);
				usuarios.add(adicionar);
			} else if(dadosOperacao[3].equals("pos")==true) {
				AlunoGraduacao adicionar = new AlunoGraduacao(codigo,dadosOperacao[4],10,4);
				usuarios.add(adicionar);
			} else if(dadosOperacao[3].equals("tec")==true) {
				Tecnico adicionar = new Tecnico(codigo,dadosOperacao[4],14,5);
				usuarios.add(adicionar);
			} else if(dadosOperacao[3].equals("pro")==true) {
				Professor adicionar = new Professor(codigo,dadosOperacao[4],21);
				usuarios.add(adicionar);
			}
			System.out.println("Cadastro realizado com sucesso");
		}
	}
}