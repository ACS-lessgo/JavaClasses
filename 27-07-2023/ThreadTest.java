
public class ThreadTest 
{
	public static void main(String[] args) 
	{
		Car car1 = new Car("Innova Hybrid",100);
		Car car2 = new Car("\t Swift", 100);
		
		System.out.println("<----------------------->");
		car1.start();
		car2.start();
		System.out.println("<----------------------->");
	}
}


class Car extends Thread
{
	String model;
	int delay;
	
	public Car(String model, int delay) 
	{
		super();
		this.model = model;
		this.delay = delay;
	}
	
	public void run ()
	{
		for (int i=0;i<=20;i++)
		{
			System.out.println(model+"  is running   "+i);
			try 
			{
				Thread.sleep(delay);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}