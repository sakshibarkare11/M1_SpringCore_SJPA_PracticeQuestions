class Book {
    private String title;
    private String author;
    private String genre;
    private double price;
    private int yearPublished;
    
    public Book(){
        super();
    }
    
    public Book(String title, String author, String genre, double price, int yearPublished) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.yearPublished = yearPublished;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

   
}

