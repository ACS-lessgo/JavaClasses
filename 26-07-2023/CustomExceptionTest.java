
public class CustomExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("MAIN started...\n");
		
		try {
			Car myCar = new Car();
			myCar.longDrive();
		}
		catch(CarKeyNotFoundException ex1) {
			System.out.println("Key Issue : "+ex1);
		}
		catch(BatteryProblemException ex2) {
			System.out.println("Issue with: "+ex2);
		}
		catch(FuelTankException ex3) {
			System.out.println("No fuel:"+ex3);
		}
		System.out.println("\nMAIN finished...\n");
		
	}
}

class CarKeyNotFoundException extends Exception
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}

class FuelTankException extends Exception
{
	FuelTankException(String msg)
	{
		super(msg);
	}
}
class BatteryProblemException extends Exception
{
	BatteryProblemException(String msg)
	{
		super(msg);
	}
}
class RedSignalDishnouredException extends RuntimeException
{
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}

class OverSpeedingFineException extends RuntimeException
{
	OverSpeedingFineException(String msg)
	{
		super(msg);
	}
}

class TirePunctureException extends RuntimeException
{
	public TirePunctureException(String msg) 
	{
		super(msg);
	}
}

class Car
{
	boolean keyFound=false;
	boolean batteryHealth=false;
	boolean fueltank=false;
	
	Car() throws CarKeyNotFoundException,BatteryProblemException,FuelTankException
	{
		double value = Math.random()%10;
		
		if(value>=0.10) {
			keyFound=true;
		}
		
		if(keyFound==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarKeyNotFoundException("Hey...Where is the Car Key? im not getting it...");
			
		}
		if(value>0.15 && value<1) {
			batteryHealth=true;
		}
		if(batteryHealth==true)
		{
			System.out.println("Battery Ok");
		}
		else
		{
			throw new BatteryProblemException("Battery down");
		}
		
		if (value>0.11 && value<1) {
			fueltank=true;
		}
		if(fueltank==true)
		{
			System.out.println("Fuel tank full");
		}
		else
		{
			throw new FuelTankException("Fill fuel bro");
		}
	}
	public void longDrive() {
		for (int i = 1; i <=30; i++) {
			System.out.println(i+" kms driven....");
			double value = Math.random()%10;
			if(value>0.75 && value<0.8) {
				RedSignalDishnouredException ex1 = new RedSignalDishnouredException("Oh No!!! Red signal is dishonoured....");
				throw ex1;
			}
			if(value>0.8 && value<0.9) {
				OverSpeedingFineException ex2 = new OverSpeedingFineException("Slow down son..");
				throw ex2;
			}
			if(value>0.6 && value<0.65) {
				TirePunctureException ex3 = new TirePunctureException("Tire puncture park aside and check your tire or replace");
				throw ex3;
			}
		}
	}
}