package Resources.Maps;

import Resources.Asset;

public class ManchesterMap extends Asset {

	private String localDirection;

	public String getLocalDirection() {
		return localDirection;
	}

	public void setLocalDirection(String localDirection) {
		this.localDirection = localDirection;
	}

	public ManchesterMap() {
		super();

	}

	public ManchesterMap(String author, String publisher, String genre, String publication_time, int page_count) {
		super(author, publisher, genre, publication_time, page_count);

	}

	@Override
	public String toString() {
		return "Author: " + getAuthor() + ", Publisher: " + getPublisher() + ", Genre: " + getGenre()
				+ ", Publication Date: " + getPublication_time() + ", Page Count: " + getPage_count() + ", Get ID: "
				+ getId() + ", Available: " + isAvailable() + "]";
	}

}
