package testes;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import classes.LivrosDisponiveis;

public class d {

	public static void main(String[] args) {
		
		Collection<LivrosDisponiveis> livrosDisponiveis = new ArrayList<LivrosDisponiveis>();
		LivrosDisponiveis adicionar = new LivrosDisponiveis(1,1,"um");
		livrosDisponiveis.add(adicionar);
		adicionar = new LivrosDisponiveis(2,2,"dois");
		livrosDisponiveis.add(adicionar);
		adicionar = new LivrosDisponiveis(3,3,"tres");
		livrosDisponiveis.add(adicionar);
		adicionar = new LivrosDisponiveis(4,4,"quatro");
		livrosDisponiveis.add(adicionar);
		adicionar = new LivrosDisponiveis(3,2,"quatro");
		livrosDisponiveis.add(adicionar);
		//livrosDisponiveis.remove(adicionar);
		//livrosDisponiveis.remove(adicionar);
		/*LivrosDisponiveis remover;
		Iterator<LivrosDisponiveis> itr = livrosDisponiveis.iterator();
		while (itr.hasNext()) {
			remover = itr.next();
			if (remover.getCodigoExemplar()==3) {
				livrosDisponiveis.remove(remover);
			}
		}*/
		
		for (LivrosDisponiveis i: livrosDisponiveis) {
			//	adicionar=new LivrosDisponiveis(i.getCodigoLivro(),i.getCodigoExemplar(),i.getTitulo());
				System.out.println(i.getCodigoLivro()+" "+i.getCodigoExemplar()+" "+i.getTitulo());
     	}
		System.out.println();
		adicionar = new LivrosDisponiveis(3,3,null);
		livrosDisponiveis.remove(adicionar);
		for (LivrosDisponiveis i: livrosDisponiveis) {
		//	adicionar=new LivrosDisponiveis(i.getCodigoLivro(),i.getCodigoExemplar(),i.getTitulo());
			System.out.println(i.getCodigoLivro()+" "+i.getCodigoExemplar()+" "+i.getTitulo());
		}
	}
}