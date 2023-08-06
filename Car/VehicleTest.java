package assignment;

public class VehicleTest {

	public static void main(String[] args) {
		Car cars[] = {
			new Car("Audi", "A-97", "Blue", 130, 55, 150000),
			new Car("Mercedes", "M-895", "Red", 90, 20, 10000),
			new Car("Land rover", "OIO45", "Black", 150, 27, 130000),
			new Car("TATA","A-0989","Green",160,32,140000),
		};
		
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
			System.out.println(cars[i].speedinkmperhr());
			System.out.println("************************************\n");
		}
	}

}
