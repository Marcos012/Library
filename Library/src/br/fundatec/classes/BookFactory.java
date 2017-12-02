package br.fundatec.classes;

public class BookFactory {
//FACTORY
	public Book buildBook(String title, String isbn, int pages, int publicationYear, int editionNumber,
					      String name, String website, String email,
					      String namePh, String emailPh, String telephone, String websitePh) {
		
		Book b = new Book();
		b.setTitle(title);
		b.setIsbn(isbn);
		b.setPages(pages);
		b.setEditionNumber(editionNumber);
		b.setPublicationYear(publicationYear);
		
		Author a = new Author();
		a.setEmail(email);
		a.setName(name);
		a.setWebsite(website);
		
		b.setAuthor(a);
		
		PublishingHouse ph =  new PublishingHouse();
		ph.setEmailPh(emailPh);
		ph.setNamePh(namePh);
		ph.setTelephone(telephone);
		ph.setWebsitePh(websitePh);
		
		b.setPhouse(ph);
		
		return b;
	}
}
