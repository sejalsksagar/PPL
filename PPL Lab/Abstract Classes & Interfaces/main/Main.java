package main;

import myVehicle.Car;
import myVehicle.Vehicle;
import myVehicle.Hifi;
import myVehicle.Fly;
import myVehicle.Pos_sys;

public class Main {

	public static void main(String[] args) {
		
		//Vehicle V1 = new Vehicle(); //Cannot instantiate abstract class object
		
		Car C1 = new Car(5, 'a');
		C1.start();
		C1.stop();
		C1.reg_vehicle();
		
		Hifi H1 = new Hifi();
		H1.change_gears(4);
		H1.reg_vehicle();
		H1.ferrari();
		H1.start();
		H1.stop();
		H1.start(3);
		H1.flyfast(80);
		H1.flyslow(20);
		H1.search_location("Moon");
		H1.show_road_ahead();
		
		//runtime polymorphism or dynamic method dispatch
		//- with reference of base class calling methods of derived class
		Vehicle V1[] = new Vehicle[2]; //array of references
		Car C2 = new Car(4, 'n');
		Hifi H2 = new Hifi();
		V1[0] = C2;
		V1[1] = H2;
		for(int i=0; i<2; i++) {
			V1[i].start(); 
			V1[i].stop();
		}
		
		//using references of interfaces
		Fly F1 = H2;
		F1.flyfast(90);
		F1.flyslow(10);
		Pos_sys P1 = H2;
		P1.show_road_ahead();
		P1.search_location("Sun");
	}

}
