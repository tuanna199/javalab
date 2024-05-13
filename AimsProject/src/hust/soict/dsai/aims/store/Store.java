package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
	
	private DigitalVideoDisc[] itemsInStore;
	private int count; // Number of DVDs in store
	
    // Default capacity for the itemsInStore array
    private static final int DEFAULT_CAPACITY = 50;

    // Constructor with default capacity
    public Store() {
        this.itemsInStore = new DigitalVideoDisc[DEFAULT_CAPACITY];
        this.count = 0;
    }

    // Method to add a DVD to the store
    public void addDVD(DigitalVideoDisc dvd) {
        if (count < itemsInStore.length) {
            itemsInStore[count++] = dvd; // Add DVD at the current count index and then increment count
            System.out.println("DVD \"" + dvd.getTitle() + "\" added to the store.");
        } else {
            System.out.println("Store is full. Cannot add more DVDs.");
        }
    }

    // Method to remove a DVD from the store
    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (itemsInStore[i].equals(dvd)) {
                // Shift subsequent elements to fill the gap
                for (int j = i; j < count - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                // Set the last element to null and decrement count
                itemsInStore[--count] = null;
                found = true;
                System.out.println("DVD removed from the store.");
                break;
            }
        }
        if (!found) {
            System.out.println("DVD not found in the store.");
        }
    }
    
    // Getter for itemsInStore
    public DigitalVideoDisc[] getItemsInStore() {
        return itemsInStore;
    }
}
