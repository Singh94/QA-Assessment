package qa_cinema.Tickets;

public class AdultTicket extends Tickets {

	private int price = 4;
	int total;
	
	public AdultTicket(int numberOfTickets) {
		super(numberOfTickets);
		this.numberOfTickets = numberOfTickets;
	}
	
	public int getCTPrice() {
		return price;
	}
	
	public int getATTotal(int numberOfTickets) {
		total = (price * numberOfTickets);
		return total;
	}
}
