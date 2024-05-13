package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc{
	
	private String director;
	private int length;
	
	
	public DigitalVideoDisc(String title) {
		super(title, 0, "");
	}
	
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
    // Accessors
	public String getDirector() {
		return director;
	}
	
	public int getLength() {
		return length;
	}
	
	// Implementing the toString() method
    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + " minutes: " + cost + "$";
    }
	
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }
	


    


	
}
