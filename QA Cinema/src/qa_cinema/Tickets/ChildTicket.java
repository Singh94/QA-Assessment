package qa_cinema.Tickets;

public class ChildTicket extends Tickets {

	private int price = 4;
	int total;
	
	public ChildTicket(int numberOfTickets) {
		super(numberOfTickets);
		this.numberOfTickets = numberOfTickets;
	}
	
	public int getCTPrice() {
		return price;
	}
	
	public int getCTTotal(int numberOfTickets) {
		total = (price * numberOfTickets);
		return total;
	}
}

