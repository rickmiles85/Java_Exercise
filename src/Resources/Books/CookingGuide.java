package Resources.Books;

import Resources.Asset;

public class CookingGuide extends Asset {

	private String italianFood;

	public CookingGuide(String author, String publisher, String genre, String publication_time, int page_count) {
		super(author, publisher, genre, publication_time, page_count);
	}

	public String getItalianFood() {
		return italianFood;
	}

	public void setItalian_food(String italianFood) {
		this.italianFood = italianFood;
	}

	@Override
	public String toString() {
		return "Author: " + getAuthor() + ", Publisher: " + getPublisher() + ", Genre: " + getGenre()
				+ ", Publication Date: " + getPublication_time() + ", Page Count: " + getPage_count() + ", Get ID: "
				+ getId() + ", Available: " + isAvailable() + "]";
	}

}
