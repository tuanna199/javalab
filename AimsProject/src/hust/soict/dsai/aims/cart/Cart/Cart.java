package hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Cart {
    
    public static final int MAX_NUMBER_ORDERED = 20;
    
    private DigitalVideoDisc itemsOrdered[] =
            new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    
    private int qtyOrdered;
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println("The disc has been added");
            
        } else {
            System.out.println("The cart is almost full");
        }
    
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].equals(disc)) {
                // Shift subsequent elements to fill the gap
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                // Set the last element to null and decrement qtyOrdered
                itemsOrdered[--qtyOrdered] = null;
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("The disc has been removed");
        } else {
            System.out.println("The disc was not found in the cart");
        }
    }
    
    public double totalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsOrdered[i].getCost();
        }
        return totalCost;
    }
    
    public void printOrderedItems() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". DVD - " + itemsOrdered[i].getTitle() + " - " +
                               itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() +
                               " - " + itemsOrdered[i].getLength() + " minutes: " + itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    
    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                if (!found) {
                    System.out.println("Search results by Title:");
                    found = true;
                }
                System.out.println(itemsOrdered[i]);
            }
        }
        if (!found) {
            System.out.println("No DVDs found with title: " + title);
        }
    }
}
