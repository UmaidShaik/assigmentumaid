package assignment;

public class VehicleTest {

	public static void main(String[] args) {
		Car cars[] = {
			new Car("Qwerty", "BK186", "Blue", 120, 25, 120000),
			new Car("Budgri", "618-RHR", "Red", 90, 20, 10000),
			new Car("Lamonson", "OIO45", "Black", 150, 27, 190000),
		};
		
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
			System.out.println(cars[i].speedinkmperhr());
			System.out.println("************************************\n");
		}
	}

}
