package qa_cinema.Extras;

public class Popcorn extends Extras {
	
	private String PopcornType;
	private String PopcornSize;
	private int Price;
	
	public Popcorn(String Type, String Size, int amount) {
		super(Type, Size, amount);
		this.PopcornType = Type;
		this.PopcornSize = Size;
		this.Price = amount;
	}
	
	public String getPopcornType() {
		return PopcornType;
	}
	
	public String getPopcornSize() {
		return PopcornSize;
	}
	
	public int GetPrice() {
		return Price;
	}

}
