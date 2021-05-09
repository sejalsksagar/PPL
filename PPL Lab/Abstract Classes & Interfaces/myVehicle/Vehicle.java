package myVehicle;

public abstract class Vehicle {

	int reg_no;
	double hp;
	double cost;
	
	Vehicle(){
		reg_no = 0;
		hp = 0;
		cost = 0;
	}
	
	Vehicle(int rn, double p, double c){
		reg_no = rn;
		hp = p;
		cost = c;
	}
	
	//concrete method
	public void reg_vehicle() {
		System.out.println("Registration number: "+reg_no);
		System.out.println("HP: "+hp);
		System.out.println("Cost: "+cost);
	}
	
	//abstract methods
	public abstract void start();
	public abstract void stop();
}
