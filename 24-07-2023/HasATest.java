package dayOne;

public class HasATest 
{
	public static void main(String[] args) 
	{
		Human batman = new Human();
		batman.breathing();
	}
}


class Heart
{
	void pumping()
	{
		System.out.println("Heart is pumping..");
	}
}


class Brain
{
	void thinking() 
	{
		System.out.println("Brain is thinking");
	}
}

class Kidney
{
	void filter(String side) {
		System.out.println(side+" Kidney is filtering blood");
	}
}


class Lung
{
	void oxeganateBlood() {
		System.out.println("Human breathe air");
	}
}



class Mammal
{
	
}

class Human extends Mammal
{
	private Heart myHeart = new Heart();
	private Brain myBrain = new Brain();
	private Kidney rightKidney = new Kidney();
	private Kidney leftKidney = new Kidney();
	private Lung lungs = new Lung();
	
	void breathing() 
	{
		System.out.println("Human is breathing");
		myHeart.pumping();
		myBrain.thinking();
		rightKidney.filter("Right");
		leftKidney.filter("Left");
		lungs.oxeganateBlood();
	}
}