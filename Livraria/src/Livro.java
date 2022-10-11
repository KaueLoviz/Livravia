import java.util.*;
public class Livro {
	
	//Atributos
	
	private String titulo;
	private String autor;
	private int cod_livro;
	private String genero;
	private float preco;
	
	//Construtores
	
	//Construtor Default (Vazio)
	
	public Livro() {
		
	}
	
	//Construtor Sobrecarregado
	
	public Livro(String titulo, String autor, int cod_livro, String genero, float preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.cod_livro = cod_livro;
		this.genero = genero;
		this.preco = preco;
	}

	
	//Métodos - Get e Set
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getCod_livro() {
		return cod_livro;
	}

	public void setCod_livro(int cod_livro) {
		this.cod_livro = cod_livro;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	//Método imprimir dados
	
	public String imprimir() {
		return "\tTítulo: " + titulo + "\n"
				+ "\n\t\t\t\t\tAutor: " + autor + "\n"
				+ "\n\t\t\t\t\tCódigo Livro: " + cod_livro + "\n"
				+ "\n\t\t\t\t\tGênero: " + genero + "\n"
				+ String.format("\n\t\t\t\t\tPreço: R$ %.2f \n", preco) ;
	}
	
	
}