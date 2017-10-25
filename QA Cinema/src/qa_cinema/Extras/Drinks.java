package qa_cinema.Extras;

public class Drinks extends Extras {
	
	private String DrinksType;
	private String DrinksSize;
	private int Price;
	
	public Drinks(String Type, String Size, int amount) {
		super(Type, Size, amount);
		this.DrinksType = Type;
		this.DrinksSize = Size;
		this.Price = amount;
	}
	
	public String getDrinksType() {
		return DrinksType;
	}
	
	public String getDrinksSize() {
		return DrinksSize;
	}
	
	public int GetPrice() {
		return Price;
	}

}
