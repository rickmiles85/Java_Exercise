package Resources.Books;

import Resources.Asset;

public class Bible extends Asset {

	public Bible(String author, String publisher, String genre, String publication_time, int page_count) {
		super(author, publisher, genre, publication_time, page_count);
	}

	private boolean Jesus;

	public boolean getJesus() {
		return Jesus;
	}

	public void setJesus(boolean jesus) {
		Jesus = jesus;
	}

	@Override
	public String toString() {
		return "Author: " + getAuthor() + ", Publisher: " + getPublisher() + ", Genre: " + getGenre()
				+ ", Publication Date: " + getPublication_time() + ", Page Count: " + getPage_count() + ", Get ID: "
				+ getId() + ", Available: " + isAvailable() + "]";

	}
}
