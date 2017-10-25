package qa_cinema.Tickets;

public class OAPTicket extends Tickets {

	private int price = 4;
	int total;
	
	public OAPTicket(int numberOfTickets) {
		super(numberOfTickets);
		this.numberOfTickets = numberOfTickets;
	}
	
	public int getCTPrice() {
		return price;
	}
	
	public int getSNTTotal(int numberOfTickets) {
		total = (price * numberOfTickets);
		return total;
	}
}

