package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	
	private List<String> authors; 

	public Book(int id, String title, String category, float cost) {
		
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.authors = new ArrayList<>();
		
	}
	
    // Method to add an author
    public void addAuthor(String author) {
        if (!authors.contains(author)) {
        	authors.add(author);
        	System.out.println("Author '" + author + "' added successfully.");
        	
        } else {
        	System.out.println("Author '" + author + "' already exists for this book.");
        }
    }
    
    public void removeAuthor(String author) {
        if (authors.contains(author)) {
            authors.remove(author);
            System.out.println("Author '" + author + "' removed successfully.");
        } else {
            System.out.println("Author '" + author + "' is not associated with this book.");
        }
    }
    
    // Method to retrieve authors
    public List<String> getAuthors() {
        return authors;
    }

}
