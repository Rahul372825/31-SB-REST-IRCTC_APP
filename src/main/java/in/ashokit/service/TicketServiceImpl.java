package in.ashokit.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import in.ashokit.requst.Passenger;
import in.ashokit.response.Ticket;


@Service
public class TicketServiceImpl implements TicketService {
	
	Map<String, Ticket> ticketMap = new HashMap<>();
	
	
	

	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		String ticketNum = UUID.randomUUID().toString().replace("-", "");
		
		Ticket tInfo = new Ticket();
		tInfo.setTicketNum(ticketNum);
		tInfo.setTrainStatus("Confirmed");
		tInfo.setTicketPrice(450.00);
		tInfo.setName(passenger.getName());
		tInfo.setEmail(passenger.getEmail());
		tInfo.setPhNo(passenger.getPhNo());
		tInfo.setFrom(passenger.getFrom());
		tInfo.setTo(passenger.getTo());
		tInfo.setJDate(passenger.getJDate());
		tInfo.setTrainNum(passenger.getTrainNum());
		
		ticketMap.put(ticketNum, tInfo);
		
		
		return tInfo;
	}

	@Override
	public Ticket getTicketDetails(String ticketNum) {
		
		if(ticketMap.containsKey(ticketNum)) {
			return ticketMap.get(ticketNum);
		}
		return null;
	}

}
