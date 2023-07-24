
public class CarFactory {
    public static void main(String[] args) {
        Car model1 = new Car("Breeza", 1500000, 2023, "Black", "Suzuki");
        System.out.println("Car manufacturing Started: " + model1);

        Car model2 = carChangeColor(model1, "White");
        System.out.println("After Modification: " + model2);
    }

    public static Car carChangeColor(Car model1, String newColor) {
        Car model2 = new Car(model1.getCarName(), model1.getCarPrice(), model1.getYearManufacture(), newColor, model1.getCarCompany());
        return model2;
    }
}


class Car
{
    private String carName;
    private int carPrice;
	private int yearManufacture;
    private String carColor;
    private String carCompany;
    public Car(String carName, int carPrice, int yearManufacture, String carColor, String carCompany) 
    {
    	
		super();
		this.carName = carName;
		this.carPrice = carPrice;
		this.yearManufacture = yearManufacture;
		this.carColor = carColor;
		this.carCompany=carCompany;
		
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public int getYearManufacture() {
		return yearManufacture;
	}
	public void setYearManufacture(int yearManufacture) {
		this.yearManufacture = yearManufacture;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public String getCarCompany() {
		return carCompany;
	}
	public void setCarCompany(String carCompany) {
		this.carCompany = carCompany;
	}
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carPrice=" + carPrice + ", yearManufacture=" + yearManufacture
				+ ", carColor=" + carColor + ", carCompany=" + carCompany + "]";
	}
}


//class Engine extends Car
//{
//	private int engineCC;
//	private int horsePower;
//	private int noOfCylinders;
//	public Engine(String carName, int carPrice, int yearManufacture, String carColor, String carCompany, int engineCC,
//			int horsePower, int noOfCylinders) {
//		super(carName, carPrice, yearManufacture, carColor, carCompany);
//		this.engineCC = engineCC;
//		this.horsePower = horsePower;
//		this.noOfCylinders = noOfCylinders;
//	}
//	public int getEngineCC() {
//		return engineCC;
//	}
//	public void setEngineCC(int engineCC) {
//		this.engineCC = engineCC;
//	}
//	public int getHorsePower() {
//		return horsePower;
//	}
//	public void setHorsePower(int horsePower) {
//		this.horsePower = horsePower;
//	}
//	public int getNoOfCylinders() {
//		return noOfCylinders;
//	}
//	public void setNoOfCylinders(int noOfCylinders) {
//		this.noOfCylinders = noOfCylinders;
//	}
//	@Override
//	public String toString() {
//		return "Engine [engineCC=" + engineCC + ", horsePower=" + horsePower + ", noOfCylinders=" + noOfCylinders + "]";
//	}
//}