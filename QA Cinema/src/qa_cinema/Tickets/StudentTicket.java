package qa_cinema.Tickets;

public class StudentTicket extends Tickets {

	private int price = 6;
	int total;
	
	public StudentTicket(int numberOfTickets) {
		super(numberOfTickets);
		this.numberOfTickets = numberOfTickets;
	}
	
	public int getCTPrice() {
		return price;
	}
	
	public int getSTTotal(int numberOfTickets) {
		total = (price * numberOfTickets);
		return total;
	}
}

