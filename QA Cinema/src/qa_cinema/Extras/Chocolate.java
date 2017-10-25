package qa_cinema.Extras;

public class Chocolate extends Extras {
	
	private String ChocolateType;
	private String ChocolateSize;
	private int Price;
	
	public Chocolate(String Type, String Size, int amount) {
		super(Type, Size, amount);
		this.ChocolateType = Type;
		this.ChocolateSize = Size;
		this.Price = amount;
	}
	
	public String getChocolateType() {
		return ChocolateType;
	}
	
	public String getChocolateSize() {
		return ChocolateSize;
	}
	
	public int GetPrice() {
		return Price;
	}

}
