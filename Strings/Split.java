package Strings;

public class Split {

	public static void main(String[] args) {

		String cars = "Tata,Maruti,BMW,Audi,Tesla,Ferrari,Lamborghini";
		String[] allCars = cars.split(",");
		
		for(String car: allCars)
			System.out.println(car);

	}

}
