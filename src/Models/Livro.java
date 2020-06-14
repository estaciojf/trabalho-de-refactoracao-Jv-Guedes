package Models;

public class Livro {
	
	private String titulo;
	private String autor;
	private String genero;
	private int ano;
	private boolean jaLeu;

	
	public Livro(String title, String author, String gender, int year, boolean isRead) {
		this.titulo = title;
		this.autor = author;
		this.genero = gender;
		this.ano = year;
		this.jaLeu = isRead;
	}
	
	public String toString() {
		return "Titulo: " + this.titulo + 
				" Autor: " + this.autor + 
				" Genero: " + this.genero + 
				" Ano: " + this.ano +
				"Lido: " + this.jaLeu;
	}

	public String getTitle() {
		return titulo;
	}

	public void setTitle(String title) {
		this.titulo = title;
	}

	public String getAuthor() {
		return autor;
	}

	public void setAuthor(String author) {
		this.autor = author;
	}

	public String getGender() {
		return genero;
	}

	public void setGender(String gender) {
		this.genero = gender;
	}

	public int getYear() {
		return ano;
	}

	public void setYear(int year) {
		this.ano = year;
	}

	public boolean isRead() {
		return jaLeu;
	}

	public void setRead(boolean isRead) {
		this.jaLeu = isRead;
	}
	
	
}
