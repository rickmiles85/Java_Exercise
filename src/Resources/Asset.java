package Resources;

public abstract class Asset {

	private String author;
	private String publisher;
	private String genre;
	private String publication_time;
	private boolean available;
	private int page_count;
	private int id;
	static int count = 0;

	public Asset() {
		super();
		this.print = ++count;
	}

	public Asset(String author, String publisher, String genre, String publication_time, int page_count) {
		super();
		this.id = ++count;
		this.setAuthor(author);
		this.setPublisher(publisher);
		this.setGenre(genre);
		this.setPublication_time(publication_time);
		this.setPage_count(page_count);
	}

	public

			String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublication_time() {
		return publication_time;
	}

	public void setPublication_time(String publication_time) {
		this.publication_time = publication_time;
	}

	public int getPage_count() {
		return page_count;
	}

	public void setPage_count(int page_count) {
		this.page_count = page_count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Author: " + author + ", Publisher: " + publisher + ", Genre: " + genre + "Publication Date: "
				+ publication_time + ", Page Count: " + page_count + "]";

	}
}