package airport;


public class OverloadingExample {
	public static void main(String[] args) {
		AirplaneFare person1=new AirplaneFare();
		person1.fare();
		person1.fare(10000);
		person1.fare(6000,30.5f);
		person1.fare(5060.67f, 70);
	}
}


class AirplaneFare{
	void fare() {
		System.out.println("Airplane fare is .....");
	}
	void fare(int price) {
		System.out.println("Airplane fare is..."+price);
	}
	void fare(int price,float gst) {
		System.out.println("Airplane fare is.."+price+"......Taxes are: "+gst);
	}
	void fare(float price,int gst) {
		System.out.println("Airplane fare is.."+price+"......Taxes are: "+gst);
	}
}
