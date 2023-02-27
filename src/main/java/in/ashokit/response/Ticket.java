package in.ashokit.response;

import lombok.Data;

@Data
public class Ticket {
	
	private String name;
	private String email;
	private Long phNo;
	private String from;
	private String to;
	private String jDate;
	private Long trainNum;
	private String ticketNum;
	private Double ticketPrice;
	private String trainStatus;

}
