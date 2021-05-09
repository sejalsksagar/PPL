package myVehicle;

public class Hifi extends Car implements Pos_sys, Fly {

	public Hifi(){
		super(5, 'a');
	}
	
	@Override
	public void flyfast(int s) {
		System.out.println("Hifi flying fast with speed: "+s);	
	}

	@Override
	public void flyslow(int s) {
		System.out.println("Hifi flying slow with speed: "+s);	
	}
	
	@Override
	public void show_road_ahead() {
		System.out.println("Hifi show road ahead.");	
	}
	
	@Override
	public void search_location(String l) {
		System.out.println("Hifi location: "+l);	
	}
	
	public void start() {
		System.out.println("Hifi has started...");	
	}
	
	public void stop() {
		System.out.println("Hifi has stopped...");	
	}
	
	public void ferrari() {
		System.out.println("Hifi car Ferrari.");	
	}
	
	public void start(int gears) {
		System.out.println("Hifi has started. It is in "+gears+" gears.");
	}

	public void change_gears(int gears) {
		gears++;
	}
}
