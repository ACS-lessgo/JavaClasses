package airport;

public class Traveller{
	
	public String hello(String name){
		return "Hello "+name;
	}
	
	protected void validate() {
		System.out.println("Your ID Proof is Valid");
	}
	
	protected void scan() {
		System.out.println("Your bag was scanned and can be carried");
	}
	
	protected void welcome() {
		System.out.println("Welcome to Airport");
	}
	
	public static void main(String[] args) {
		Traveller John = new Traveller();
		System.out.println(	John.hello("John Doe"));
	}
}
