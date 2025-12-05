public class Vehicle {
	private String model;
	private int year;
	
	public Vehicle(String model, int year) {
		this.model = model;
		this.year = year;
	}
	
	public void start() {
		System.out.println("Vehicle starting...");
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		if(model == null) {
			System.out.println("Model cannot be empty");
		} else {
			this.model = model;
		}
	}

}