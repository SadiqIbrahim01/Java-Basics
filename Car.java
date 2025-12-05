public class Car extends Vehicle {
	private int doors;
	public Car(String model, int year, int doors) {
		super(model, year);
		this.doors = doors;
	}
	
	@Override
	public void start() {
	System.out.println("Car engine revving up!");
	}
	
	public void honk() {
		System.out.println("Honk honk");
	}

}