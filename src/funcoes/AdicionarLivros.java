package funcoes;

import java.util.Collection;
import classes.Livro;
import classes.LivrosDisponiveis;

public class AdicionarLivros {
	
	public static void adicionarLivros(Collection<Livro> livros,Collection<LivrosDisponiveis> livrosDisponiveis) {
		Livro adicionarLivros = new Livro(100,"Engenharia de Software", "Addison-Wesley", "Ian Sommervile", "6ª", 2000);
		livros.add(adicionarLivros);
		adicionarLivros = new Livro(101, "UML - Guia do Usuário", "Campus", "Grady Booch, James Rumbaugh, Ivar Jacobson", "7ª", 2000);
		livros.add(adicionarLivros);
		adicionarLivros = new Livro(200, "Code Complete", "Microsoft Press", "Steve McConnell", "2ª", 2014);
		livros.add(adicionarLivros);
		adicionarLivros = new Livro(201, "Agile Software Development, Principles, Patterns, and Practices", "Prentice Hall", "Robert Martin", "1ª", 2002);
		livros.add(adicionarLivros);
		adicionarLivros = new Livro(300, "Refactoring: Improving the Design of Existing Code", "Addison-Wesley Professional", "Martin Fowler", "1ª", 1999);
		livros.add(adicionarLivros);
		adicionarLivros = new Livro(301, "Software Metrics: A Rigorous and Practical Approach", "CRC Press", "Norman Fenton, James Bieman", "3ª", 2014);
		livros.add(adicionarLivros);
		adicionarLivros = new Livro(400, "Design Patterns: Elements of Reusable Object-Oriented Software", "Addison-Wesley Professional", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides", "1ª", 1994);
		livros.add(adicionarLivros);
		adicionarLivros = new Livro(401, "UML Distilled: A Brief Guide to the Standard Object Modeling Language", "Addison-Wesley Professional", "Martin Fowler", "3ª", 2003);
		livros.add(adicionarLivros);
		
		LivrosDisponiveis adicionarExemplares = new LivrosDisponiveis(100,1,"Engenharia de Software");
		livrosDisponiveis.add(adicionarExemplares);
		adicionarExemplares = new LivrosDisponiveis(100,2,"Engenharia de Software");
		livrosDisponiveis.add(adicionarExemplares);
		adicionarExemplares = new LivrosDisponiveis(101,3,"UML - Guia do Usuário");
		livrosDisponiveis.add(adicionarExemplares);
		adicionarExemplares = new LivrosDisponiveis(200,4,"Code Complete");
		livrosDisponiveis.add(adicionarExemplares);
		adicionarExemplares = new LivrosDisponiveis(201,5,"Agile Software Development, Principles, Patterns, and Practices");
		livrosDisponiveis.add(adicionarExemplares);
		adicionarExemplares = new LivrosDisponiveis(300,6,"Refactoring: Improving the Design of Existing Code");
		livrosDisponiveis.add(adicionarExemplares);
		adicionarExemplares = new LivrosDisponiveis(300,7,"Refactoring: Improving the Design of Existing Code");
		livrosDisponiveis.add(adicionarExemplares);
		adicionarExemplares = new LivrosDisponiveis(400,8,"Design Patterns: Elements of Reusable Object-Oriented Software");
		livrosDisponiveis.add(adicionarExemplares);
		adicionarExemplares = new LivrosDisponiveis(400,9,"Design Patterns: Elements of Reusable Object-Oriented Software");
		livrosDisponiveis.add(adicionarExemplares);
	}
}