public class VehicleMain {
	public static void main(String[] args) {
		Car myCar = new Car("Tesla Model 3", 2023, 4);
		myCar.start();
		myCar.honk();
		
		Vehicle v = myCar;
		v.start();
		System.out.println(v.getModel());
	}

}