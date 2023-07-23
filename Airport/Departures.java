package airport;

public class Departures implements FlightDetails{	
	
	public void ArrivingFlights() {
		
	}
	
	
	public void DepartingFlights(){
		System.out.println("Flight No:AI 696 leaving in 30min");
		System.out.println("Flight No:6E 5304 leaving in 30min");
		System.out.println("Flight No:UK 1696 leaving in 30min");
	}
	
	
	public static void main(String[] args) {
		Departures Info2 = new Departures();
		Info2.DepartingFlights();
	}
}

