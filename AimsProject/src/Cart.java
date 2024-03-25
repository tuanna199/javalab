
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
		
		
	
		
	}
}
