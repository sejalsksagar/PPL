package myVehicle;

public class Car extends Vehicle {

	int no_gear;
	char ac;
	
	public Car() {
		no_gear = 0;
		ac = 0;
	}
	
	public Car(int ng, char a) {
		no_gear = ng;
		ac = a;
	}
	
	@Override
	public void start() {
		System.out.println("Car has started...");
	}

	@Override
	public void stop() {
		System.out.println("Car has stopped...");
		
	}
	
	public void go_reverse() {
		System.out.println("Car is going in reverse...");
	}
	
	public void start(int gears) {
		System.out.println("Car has started. It is in "+gears+" gears.");
	}

}
