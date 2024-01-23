package Resources.Magazines;

import Resources.Asset;

public class BikeMag extends Asset {

	private int motorbike;

	public int getMotorbike() {
		return motorbike;
	}

	public void setMotorbike(int motorbike) {
		this.motorbike = motorbike;
	}

	public BikeMag() {
		super();
	}

	public BikeMag(String author, String publisher, String genre, String publication_time, int page_count) {
		super(author, publisher, genre, publication_time, page_count);
	}

	@Override
	public String toString() {
		return "Author: " + getAuthor() + ", Publisher: " + getPublisher() + ", Genre: " + getGenre()
				+ ", Publication Date: " + getPublication_time() + ", Page Count: " + getPage_count() + ", Get ID: "
				+ getId() + ", Available: " + isAvailable() + "]";
	}

}
