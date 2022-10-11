import java.util.*;
public class Acumulo {
	private static ArrayList<Livro> lista_Livros = new ArrayList<>();
	
	//Método Get
	
	public static ArrayList<Livro> getLista_Livros() {
		return lista_Livros;
	}
	
	//Método adicionar objeto
	
	static public void adicionar(Livro l) {
		lista_Livros.add(l);
	}
	
	
	//Método lista todos os objetos da lista
	
	static public String listar() {
		String saida = "";
		int i = 1;
		
		for(Livro l : lista_Livros) {
			saida += "\n\n\t\t\t\t========== Livro N° " + (i++) + " =========	\n";
			saida += "\n\t\t\t\t" + l.imprimir() + "\n" + "\t\t\t\t=================================\n";
		}
		
		return saida;
	}
	
	//Método pesquisar os livros da lista pelo gênero
	
	static public int pesquisar(String genero) {
		int quantidade = 0;
		
		for(Livro l : lista_Livros) {
			if(l.getGenero().equalsIgnoreCase(genero)) {
				quantidade++;
			}
		}
		
		return quantidade;
	}
	
	//Método pesquisar os livros pela faixa de preço
	
	static public int pesquisar(double valorInicial, double valorFinal) {
		int quantidade = 0;
		
		for(Livro l : lista_Livros) {
			if(l.getPreco() >= valorInicial && l.getPreco() <= valorFinal) {
				quantidade++;
			}
		}
		
		return quantidade;
	}
	
	//Método remover objeto pelo titulo
	
	static public boolean remover(String titulo) {
		for(Livro l : lista_Livros) {
			if(l.getTitulo().equalsIgnoreCase(titulo)) {
				lista_Livros.remove(l);
				return true;
			}
		}
		return false;
	}
	
	
	//Método para calcular o total R$ livros
	
	static double calcularTotalLivros() {
		double total = 0;
		
		for(Livro l : lista_Livros) {
			total += l.getPreco();
		}
		
		return total;
	}
}