package Resources.Maps;

import Resources.Asset;

public class UkMap extends Asset {

	private String nationalDirection;

	public String getNationalDirection() {
		return nationalDirection;
	}

	public void setNationalDirection(String nationalDirection) {
		this.nationalDirection = nationalDirection;
	}

	public UkMap() {
		super();

	}

	public UkMap(String author, String publisher, String genre, String publication_time, int page_count) {
		super(author, publisher, genre, publication_time, page_count);

	}

	@Override
	public String toString() {
		return "Author: " + getAuthor() + ", Publisher: " + getPublisher() + ", Genre: " + getGenre()
				+ ", Publication Date: " + getPublication_time() + ", Page Count: " + getPage_count() + ", Get ID: "
				+ getId() + ", Available: " + isAvailable() + "]";
	}

}
