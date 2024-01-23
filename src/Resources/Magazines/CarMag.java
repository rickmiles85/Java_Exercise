package Resources.Magazines;

import Resources.Asset;

public class CarMag extends Asset {

	private int car;

	public int getCar() {
		return car;
	}

	public void setCar(int car) {
		this.car = car;
	}

	public CarMag() {
		super();
	}

	public CarMag(String author, String publisher, String genre, String publication_time, int page_count) {
		super(author, publisher, genre, publication_time, page_count);
	}

	@Override
	public String toString() {
		return "Author: " + getAuthor() + ", Publisher: " + getPublisher() + ", Genre: " + getGenre()
				+ ", Publication Date: " + getPublication_time() + ", Page Count: " + getPage_count() + ", Get ID: "
				+ getId() + ", Available: " + isAvailable() + "]";
	}

}
