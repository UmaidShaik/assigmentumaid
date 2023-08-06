package assignment;

public class Car extends FourWheeler{

	private int price;
	
	public Car(String companyName, String model, String color, int speed, int mileage, int price) {
		super(companyName, model, color, speed, mileage);
		this.price = price;
	}

	@Override
	public String speedinkmperhr() {
		return "Car is moving at the speed of" + this.speed + "km/hr";
	}

	@Override
	public String toString() {
		return "[Car]\nCompany Name: " + this.companyName + "\nmodel: " + this.model + ",\nNumber of Tyres: " + this.NO_OF_TYRES + ",\nColor: " + this.color + ",\nMile-Age: " + this.mileage + ",\nPrice: " + this.price;
	}
	
	

}