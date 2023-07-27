
public class WashingMachineTEst {
	public static void main(String[] args) {
		
		
		//////////////////////////////
		WashingPowder washPowder = new WashingPowder(100, "Nirma", "Front Load", true, 10.0f);
        Water water = new Water("Tap", 20, "Cold");
        Electricity electricity = new Electricity("AC", 220.0f, 8, 2, "PowerCo");

        
        Cloth[] clothes = new Cloth[5];
        clothes[0] = new Cloth("Cotton", "Purple", 5.0f, "Shirt", true);
        clothes[1] = new Cloth("Denim", "Blue", 8.0f, "Denim Jacket", true);
        clothes[2] = new Cloth("Polyester", "Red", 6.0f, "T-Shirt", true);
        clothes[3] = new Cloth("Silk", "Black", 12.0f, "Dress", true);
        clothes[4] = new Cloth("Wool", "Grey", 10.0f, "Sweater", true);
        //////////////////////////////////
        
		WashingPowder washPowder2 = new WashingPowder(100, "Surf Excel", "Top Load", true, 10.0f);
        Water water2 = new Water("Tap", 20, "Cold");
        Electricity electricity2 = new Electricity("DC", 120.0f, 2, 4, "Reliance");

        
        Cloth[] clothes2 = new Cloth[5];
        clothes2[0] = new Cloth("Cotton", "White", 5.0f, "Shirt", true);
        clothes2[1] = new Cloth("Denim", "Blue", 8.0f, "Jeans", true);
        clothes2[2] = new Cloth("Polyester", "Red", 6.0f, "T-Shirt", true);
        clothes2[3] = new Cloth("Silk", "Black", 12.0f, "Dress", true);
        clothes2[4] = new Cloth("Wool", "Grey", 10.0f, "Sweater", true);
        
        ////////////////////////////////////////
		WashingPowder washPowder3 = new WashingPowder(100, "Tide", "Front Load", true, 10.0f);
        Water water3 = new Water("Tap", 20, "Cold");
        Electricity electricity3 = new Electricity("AC", 100.0f, 88, 20, "TATA Power");

        
        Cloth[] clothes3 = new Cloth[5];
        clothes3[0] = new Cloth("Cotton", "White", 5.0f, "Turtle neck T-Shirt", true);
        clothes3[1] = new Cloth("Denim", "Blue", 8.0f, "Jeans Pant", true);
        clothes3[2] = new Cloth("Polyester", "Red", 6.0f, "T-Shirt", true);
        clothes3[3] = new Cloth("Silk", "Black", 12.0f, "Dress", true);
        clothes3[4] = new Cloth("Wool", "Grey", 10.0f, "Sweater", true);
        ///////////////////////////////////////

       
        WashingMachine washingMachine1 = new WashingMachine();
        WashingMachine washingMachine2 = new WashingMachine();
        WashingMachine washingMachine3 = new WashingMachine();
       
        washingMachine1.start();
        washingMachine2.start();
        washingMachine3.start();
        

        Laundry laundryResult = null;

		try 
		{
			laundryResult = washingMachine1.wash(washPowder, water, electricity, clothes);
		} catch (LowWaterLevelException e) 
		{
			e.printStackTrace();
		} catch (PowerFailureException e) 
		{
			e.printStackTrace();
		} catch (WrongPowderException e) 
		{
			e.printStackTrace();
		} catch (MotorFailureException e) 
		{
			e.printStackTrace();
		}
        
		if (laundryResult != null)
		{
		//System.out.println("<-------------------------Washing Started---------------------------------------->\n\n");
        System.out.println("Laundry Details:");
        //System.out.println("Washing Machine Number is: "+laundryResult.count);
        System.out.println("Number of clothes: " + laundryResult.getNumberOfCloths());
        System.out.println("Time required: " + laundryResult.getTimeRequired() + " hours");
        System.out.println("Total cost: $" + laundryResult.getTotalCost());
        System.out.println("Water used: " + laundryResult.getWaterUsed() + " liters");
        System.out.println("Electricity used: " + laundryResult.getElectricityUsed() + " watts");
        System.out.println("Cost of washing powder: $" + laundryResult.getCostOfWashingPowder());
        //System.out.println("\n\n<---------------------Washing clothes completed------------------------------->");
		}
		
	}
}

class Machine extends Thread{
	
}
class WashingMachine extends Thread { 
	
	
	
	WashingTub washTub = new WashingTub(100,"steel"); 
		//int count=1;
	
		Laundry wash(WashingPowder washPowder, Water water, Electricity elect, Cloth cloth[]) throws LowWaterLevelException,PowerFailureException,WrongPowderException,MotorFailureException 
		{			
			//count++;
			boolean waterLevel = false;
			boolean powerLevel = false;
			boolean motorHealth = false;
			boolean powderType = false;
		
				double value = Math.random()%10;
				
				if(value>=0.1)
				{
					waterLevel=true;
				}
				else
				{
					throw new LowWaterLevelException("Please fill water again");
				}
				if(value>0.15 && value<0.66)
				{
					powerLevel=true;
				}
				else
				{
					throw new PowerFailureException("No power to run machine");
				}
				if(value>=0.20 && value<=0.9)
				{
					motorHealth=true;
				}
				else
				{
					throw new MotorFailureException("Motor Failure please contact service");
				}
				if(value>=0.25 && value<=0.88)
				{
					powderType=true;
				}
				else
				{
					throw new WrongPowderException("WrongPowder used stop immediately");
				}
			
			int numberOfCloths = cloth.length;
	        float waterUsed = water.getQuantity(); 
	        float electricityUsed = elect.getUnitUsed() * elect.getVoltage(); 

	        
	        float costOfWashingPowder = washPowder.getPrice() * washPowder.getQuantity();

	        
	        float totalCost = numberOfCloths * cloth[0].getCost(); 

	       
	        float timeRequired = 1.5f; 

	        Laundry laundryResult = new Laundry(numberOfCloths, timeRequired, totalCost, waterUsed, electricityUsed, costOfWashingPowder);
	        return laundryResult;
		}
		
}
class LowWaterLevelException extends Exception
{
	LowWaterLevelException(String msg) 
	{
		super(msg);
	}
}


class PowerFailureException extends Exception
{
	PowerFailureException(String msg) 
	{
		super(msg);
	}
}

class MotorFailureException extends Exception
{
	MotorFailureException(String msg) 
	{
		super(msg);
	}
}

class WrongPowderException extends Exception
{
	WrongPowderException(String msg) 
	{
		super(msg);
	}
}
class Laundry {
	private int numberOfCloths; //cloth.length
	private float timeRequired;
	private float totalCost ;// cloth.length * price per cloth
	private float waterUsed;
	private float electricityUsed;
	private float costOfWashingPowder; //
	int count=1;
	
	public Laundry(int numberOfCloths, float timeRequired, float totalCost, float waterUsed, float electricityUsed,
			float costOfWashingPowder) {
		super();
		//count++;
		this.numberOfCloths = numberOfCloths;
		this.timeRequired = timeRequired;
		this.totalCost = totalCost;
		this.waterUsed = waterUsed;
		this.electricityUsed = electricityUsed;
		this.costOfWashingPowder = costOfWashingPowder;
	}

	@Override
	public String toString() {
		return "Laundry [numberOfCloths=" + numberOfCloths + ", timeRequired=" + timeRequired + ", totalCost="
				+ totalCost + ", waterUsed=" + waterUsed + ", electricityUsed=" + electricityUsed
				+ ", costOfWashingPowder=" + costOfWashingPowder+ "]";
	}

	public int getNumberOfCloths() {
		return numberOfCloths;
	}

	public void setNumberOfCloths(int numberOfCloths) {
		this.numberOfCloths = numberOfCloths;
	}

	public float getTimeRequired() {
		return timeRequired;
	}

	public void setTimeRequired(float timeRequired) {
		this.timeRequired = timeRequired;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public float getWaterUsed() {
		return waterUsed;
	}

	public void setWaterUsed(float waterUsed) {
		this.waterUsed = waterUsed;
	}

	public float getElectricityUsed() {
		return electricityUsed;
	}

	public void setElectricityUsed(float electricityUsed) {
		this.electricityUsed = electricityUsed;
	}

	public float getCostOfWashingPowder() {
		return costOfWashingPowder;
	}

	public void setCostOfWashingPowder(float costOfWashingPowder) {
		this.costOfWashingPowder = costOfWashingPowder;
	}
	
	
	
	
	
}

class Tub {
	
}

class WashingTub  extends Tub {
	private int capacity;
	private String type; //
	public WashingTub(int capacity, String type) {
		super();
		this.capacity = capacity;
		this.type = type;
	}
	@Override
	public String toString() {
		return "WashingTub [capacity=" + capacity + ", type=" + type + "]";
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}

class Powder {
	
}

class WashingPowder extends Powder { // isA

	private int quantity;
	private String brand;
	private String type;
	private boolean scented;
	private float price;
	
	public WashingPowder(int quantity, String brand, String type, boolean scented, float price) {
		super();
		this.quantity = quantity;
		this.brand = brand;
		this.type = type;
		this.scented = scented;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "WashingPowder [quantity=" + quantity + ", brand=" + brand + ", type=" + type + ", scented=" + scented
				+ ", price=" + price + "]";
	}
	/*public String toString() {
		String str = (scented) ? "Scented" :"Not Scented";
		return str+ " "+brand+" Washing Powder of "+type+ " type quantity used "+quantity+ " grams ";
	}*/

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isScented() {
		return scented;
	}

	public void setScented(boolean scented) {
		this.scented = scented;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

class Water {
	private String type;
	private int quantity;
	private String temperature;
	
	public Water(String type, int quantity, String temperature) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + ", temperature=" + temperature + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

}

class Electricity {
	private String type; //ac dc
	private float voltage; 
	private int costPerUnit;
	private int unitUsed;
	private String supplier;
	public Electricity(String type, float voltage, int costPerUnit, int unitUsed, String supplier) {
		super();
		this.type = type;
		this.voltage = voltage;
		this.costPerUnit = costPerUnit;
		this.unitUsed = unitUsed;
		this.supplier = supplier;
	}
	@Override
	public String toString() {
		return "Electricity [type=" + type + ", voltage=" + voltage + ", costPerUnit=" + costPerUnit + ", unitUsed="
				+ unitUsed + ", supplier=" + supplier + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getVoltage() {
		return voltage;
	}
	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}
	public int getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public int getUnitUsed() {
		return unitUsed;
	}
	public void setUnitUsed(int unitUsed) {
		this.unitUsed = unitUsed;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	
	
}

class Cloth {
	private String material; //
	private String color;
	private float cost;
	private String type;
	private boolean clean; //
	
	public Cloth(String material, String color, float cost, String type, boolean clean) {
		super();
		this.material = material;
		this.color = color;
		this.cost = cost;
		this.type = type;
		this.clean = clean;
	}
	@Override
	public String toString() {
		return "Cloth [material=" + material + ", color=" + color + ", cost=" + cost + ", type=" + type + ", clean="
				+ clean + "]";
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isClean() {
		return clean;
	}
	public void setClean(boolean clean) {
		this.clean = clean;
	}
	

	
}
