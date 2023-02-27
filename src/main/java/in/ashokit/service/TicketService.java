package in.ashokit.service;

import in.ashokit.requst.Passenger;
import in.ashokit.response.Ticket;

public interface TicketService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicketDetails(String ticketNum);
	
	

}
