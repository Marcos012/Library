package br.fundatec.classes;

public class Book {
	private String title;
	private String isbn;
	private int pages;
	private int publicationYear; 
	private int editionNumber;
	private Author author;
	private PublishingHouse phouse;
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public PublishingHouse getPhouse() {
		return phouse;
	}
	public void setPhouse(PublishingHouse phouse) {
		this.phouse = phouse;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public int getEditionNumber() {
		return editionNumber;
	}
	public void setEditionNumber(int editionNumber) {
		this.editionNumber = editionNumber;
	}
}
