package br.fundatec.classes;

public class BookFactory {
//FACTORY
	public Book buildBook(String title, String isbn, int pages, int publicationYear, int editionNumber,
					      String name, String email, String website,
					      String namePh, String emailPh, String Telephone, String websitePh) {
		
		Book b = new Book();
		b.setTitle(title);
		b.setIsbn(isbn);
		b.setPages(pages);
		b.setEditionNumber(editionNumber);
		b.setPublicationYear(publicationYear);
		
		Author a = new Author();
		a.setName(name);
		a.setEmail(email);
		a.setWebsite(website);
		b.setAuthor(a);
		
		PublishingHouse ph =  new PublishingHouse();
		ph.setNamePh(namePh);
		ph.setTelephone(Telephone);
		ph.setWebsitePh(websitePh);
		b.setPhouse(ph);
		
		return b;
	}
}
