package airport;



public class Arrivals implements FlightDetails{	
	
	
	public void ArrivingFlights(){
		System.out.println("Flight No:AI 696 arriving soon");
		System.out.println("Flight No:6E 5304 arriving soon");
		System.out.println("Flight No:UK 1696 arriving soon");
	}
	
	public void DepartingFlights() {
		
	}
	
	public static void main(String[] args) {
		Arrivals Info1 = new Arrivals();
		Info1.ArrivingFlights();
	}
}


