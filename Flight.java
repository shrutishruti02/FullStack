import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Flight_info")

public class Flight {
	
	@Id
	private int flightNumber;
	private String flightName;
	private String flightSource;
	private String flightDestination;
	private float flightTicketcost;
	private int NoofPassengers;
	private LocalDateTime flightDepartureFromSource;
	private LocalDateTime flightArrivalAtDestination;
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	public float getFlightTicketcost() {
		return flightTicketcost;
	}
	public void setFlightTicketcost(float flightTicketcost) {
		this.flightTicketcost = flightTicketcost;
	}
	public int getNoofPassengers() {
		return NoofPassengers;
	}
	public void setNoofPassengers(int noofPassengers) {
		NoofPassengers = noofPassengers;
	}
	public LocalDateTime getFlightDepartureFromSource() {
		return flightDepartureFromSource;
	}
	public void setFlightDepartureFromSource(LocalDateTime flightDepartureFromSource) {
		this.flightDepartureFromSource = flightDepartureFromSource;
	}
	public LocalDateTime getFlightArrivalAtDestination() {
		return flightArrivalAtDestination;
	}
	public void setFlightArrivalAtDestination(LocalDateTime flightArrivalAtDestination) {
		this.flightArrivalAtDestination = flightArrivalAtDestination;
	}
	
	
	
	
}
